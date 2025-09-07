import java.io.*;
import java.util.*;

public class Compressor {
    public void compress(String inputFile, String outputFile) {
        try {
            String text = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(inputFile)));

            // Count frequencies
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char ch : text.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            // Build Huffman Tree
            HuffmanTree tree = new HuffmanTree();
            tree.build(freqMap);

            Map<Character, String> huffmanCodes = tree.getHuffmanCodes();

            // Encode text
            StringBuilder encoded = new StringBuilder();
            for (char ch : text.toCharArray()) {
                encoded.append(huffmanCodes.get(ch));
            }

            // Write to output
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
                oos.writeObject(freqMap);
                oos.writeObject(encoded.toString());
            }

            System.out.println("✅ File compressed successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
