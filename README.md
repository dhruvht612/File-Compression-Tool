# 📦 File Compression Tool (Huffman Coding)

A simple **file compression and decompression tool** implemented in Java using **Huffman Coding**.  
This project demonstrates **Object-Oriented Programming (OOP)** concepts such as inheritance and abstraction, along with the use of **data structures and algorithms** like binary trees, hash maps, and priority queues.

---

## 🚀 Features
- Compresses text files into a `.huff` format
- Decompresses back to the original text
- Implements **Huffman Coding** for lossless compression
- Clear class structure:
  - `Compressor`
  - `Decompressor`
  - `HuffmanTree`
  - `HuffmanNode`

---

## 📂 Project Structure
```
file-compression-tool/
│── src/
│   ├── Main.java
│   ├── Compressor.java
│   ├── Decompressor.java
│   ├── HuffmanTree.java
│   ├── HuffmanNode.java
│── README.md
│── .gitignore
```

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/file-compression-tool.git
   cd file-compression-tool
   ```

2. Compile the project:
   ```bash
   javac src/*.java
   ```

3. Run the program:
   ```bash
   java -cp src Main
   ```

---

## 📌 Example Workflow
- Place your input text in `input.txt`  
- The program generates:
  - `compressed.huff` (compressed file)
  - `decompressed.txt` (restored text file)  

Expected output:
```
✅ File compressed successfully!
✅ File decompressed successfully!
✅ Compression and Decompression completed.
```

---

## 🛠️ Technologies Used
- Java (JDK 8+)
- Huffman Coding Algorithm
- Data Structures: PriorityQueue, Binary Tree, HashMap

---

## 📖 Learning Outcomes
- Hands-on implementation of **compression algorithms**
- Usage of **OOP principles in Java**
- Practical application of **data structures and algorithms**

---

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).
