package graphs;

import java.util.HashSet;
import java.util.Set;

public class GraphParser {
     public static Set<Edge> listEdges (Node[] nodes){
        Set<Edge> edges = new HashSet<>();

        for(Node node : nodes){
            for(Node neighbour: node.getNeighbours()){
                edges.add(new Edge(node, neighbour));
            }
        }
        return edges;
     }
}
