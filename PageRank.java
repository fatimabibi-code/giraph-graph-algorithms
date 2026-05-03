import org.apache.giraph.graph.BasicComputation;
import org.apache.giraph.graph.Vertex;
import org.apache.hadoop.io.*;

public class PageRank extends BasicComputation<
    LongWritable, DoubleWritable, FloatWritable, DoubleWritable> {

    private static final double DAMPING = 0.85;

    public void compute(
        Vertex<LongWritable, DoubleWritable, FloatWritable> vertex,
        Iterable<DoubleWritable> messages) {

        if (getSuperstep() == 0) {
            vertex.setValue(new DoubleWritable(1.0));
        }

        double sum = 0;
        for (DoubleWritable msg : messages) {
            sum += msg.get();
        }

        double rank = (1 - DAMPING) + DAMPING * sum;
        vertex.setValue(new DoubleWritable(rank));

        if (getSuperstep() < 10) {

            double out = vertex.getNumEdges();

            if (out > 0) {
                double send = vertex.getValue().get() / out;
                sendMessageToAllEdges(vertex, new DoubleWritable(send));
            }

        } else {
            vertex.voteToHalt();
        }
    }
}
