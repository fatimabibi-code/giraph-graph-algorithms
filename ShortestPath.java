import org.apache.giraph.graph.BasicComputation;
import org.apache.giraph.graph.Vertex;
import org.apache.giraph.edge.Edge;
import org.apache.hadoop.io.*;

public class ShortestPath extends BasicComputation<
    LongWritable, DoubleWritable, FloatWritable, DoubleWritable> {

    private static final double INF = Double.MAX_VALUE;
    private static final long SOURCE = 1;

    public void compute(
        Vertex<LongWritable, DoubleWritable, FloatWritable> vertex,
        Iterable<DoubleWritable> messages) {

        if (getSuperstep() == 0) {
            if (vertex.getId().get() == SOURCE) {
                vertex.setValue(new DoubleWritable(0));
                sendMessageToAllEdges(vertex, new DoubleWritable(0));
            } else {
                vertex.setValue(new DoubleWritable(INF));
            }
        }

        double min = vertex.getValue().get();

        for (DoubleWritable msg : messages) {
            min = Math.min(min, msg.get());
        }

        if (min < vertex.getValue().get()) {
            vertex.setValue(new DoubleWritable(min));

            for (Edge<LongWritable, FloatWritable> edge : vertex.getEdges()) {
                sendMessage(edge.getTargetVertexId(),
                    new DoubleWritable(min + edge.getValue().get()));
            }
        }

        vertex.voteToHalt();
    }
}