package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Node {

    private Map<Integer, ArrayList<Node>> adjacencyList = new HashMap<>();
    private int currentLabel ;

    public Node (int label){
        this.currentLabel = label;
        adjacencyList.put(label, new ArrayList<>());

    }

    public void addNeighbour (Node node){
        adjacencyList.get(currentLabel).add(node);
    }


     public List<Node> getNeighbours(){
        return  adjacencyList.get(currentLabel);
     }

     public int getLabel(){
        return  currentLabel;
     }



    @Override
    public String toString() {
        String sb = currentLabel + " -> " + adjacencyList.get(currentLabel).toString();
        return sb;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return currentLabel == node.currentLabel;

    }


    @Override
    public final int hashCode() {
        return Objects.hash(currentLabel);
    }

     

}
