import java.io.*;
import java.util.*;

public class Decompressor {
    public void decompress(String inputFile, String outputFile) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
            Map<Character, Integer> freqMap = (Map<Character, Integer>) ois.readObject();
            String encoded = (String) ois.readObject();

            // Rebuild Huffman Tree
            HuffmanTree tree = new HuffmanTree();
            tree.build(freqMap);
            HuffmanNode root = tree.getRoot();

            // Decode
            StringBuilder decoded = new StringBuilder();
            HuffmanNode current = root;
            for (char bit : encoded.toCharArray()) {
                current = (bit == '0') ? current.left : current.right;
                if (current.isLeaf()) {
                    decoded.append(current.ch);
                    current = root;
                }
            }

            // Write decoded text
            java.nio.file.Files.write(java.nio.file.Paths.get(outputFile), decoded.toString().getBytes());

            System.out.println("✅ File decompressed successfully!");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
