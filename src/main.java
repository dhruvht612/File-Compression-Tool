public class main {
    public static void main(String[] args){
        String inputFile = "input.txt";
        String compressedFile = "compressed.huff";
        String decompressedFile = "decompressed.txt";

        Compressor compressor = new Compressor();
        compressor.compress(inputFile, compressedFile);

        Decompressor decompressor = new Decompressor();
        decompressor.decompress(compressedFile, decompressedFile);

        System.out.println("✅ Compression and Decompression completed.");
    }
}

