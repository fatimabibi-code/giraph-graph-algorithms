# Giraph Graph Algorithms Project

## 📌 Project Overview
This project demonstrates graph processing using distributed computing concepts. It implements two important graph algorithms:

- PageRank Algorithm
- Single Source Shortest Path (SSSP)

Additionally, Python is used for visualizing results and comparing performance.

---

## ⚙️ Technologies Used
- Java
- Apache Giraph (Graph Processing Framework)
- Hadoop (Distributed Processing)
- Python (Matplotlib for visualization)

---

## 📂 Project Structure
Giraph_Project/
│
├── PageRank.java            # Implementation of PageRank algorithm
├── ShortestPath.java       # Implementation of shortest path algorithm
├── graphs.py               # Visualization of results using Python
├── hadoop-commands.txt     # Hadoop and execution commands
├── input.txt               # Sample input data (if available)

---

## 📊 Algorithms Description

### 1. PageRank Algorithm
PageRank calculates the importance of each node in a graph based on the number and quality of incoming links. It is widely used in search engines.

### 2. Shortest Path Algorithm
This algorithm finds the minimum distance from a source node to all other nodes in the graph using message passing technique.

---

## 📈 Visualization
Python (Matplotlib) is used to visualize:
- Performance comparison between Giraph and single-thread execution
- PageRank results for nodes
- Shortest path distances

---

## 🚀 How to Run

### Java (Giraph/Hadoop)
1. Compile Java files using Hadoop libraries
2. Submit job using Hadoop command
3. View output in HDFS

### Python Visualization
Run:

---

## 📌 Key Learning Outcomes
- Understanding distributed graph processing
- Implementation of PageRank and shortest path algorithms
- Comparison of distributed vs single-thread performance
- Data visualization using Python

---

## 👩‍💻 Author
Project developed as part of academic coursework in Distributed Systems / Big Data Lab.