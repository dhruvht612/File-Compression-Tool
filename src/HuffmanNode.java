class HuffmanNode implements Comparable<HuffmanNode> {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(HuffmanNode other) {
        return this.freq - other.freq;
    }

    // Check if node is a leaf
    boolean isLeaf() {
        return (left == null && right == null);
    }
}
