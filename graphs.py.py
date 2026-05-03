
import matplotlib.pyplot as plt

systems = ["Giraph (Distributed)", "Single-thread"]
time = [12, 45]

plt.figure()
plt.bar(systems, time)
plt.title("Performance Comparison: Giraph vs Single-thread")
plt.xlabel("System Type")
plt.ylabel("Execution Time")
plt.show()


nodes = [1, 2, 3, 4]
pagerank = [0.25, 0.25, 0.25, 0.25]

plt.figure()
plt.bar(nodes, pagerank)
plt.title("PageRank Results")
plt.xlabel("Nodes")
plt.ylabel("Rank")
plt.show()


distance = [0, 1, 1, 2]

plt.figure()
plt.bar(nodes, distance)
plt.title("Shortest Path Results")
plt.xlabel("Nodes")
plt.ylabel("Distance")
plt.show()