package graphs;

import java.util.Objects;

public class Edge {
    private Node start;
    private Node end;

    public Edge(Node start, Node end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "("+start.getLabel()+","+end.getLabel()+")";
    }

    @Override
    public int hashCode() {
       
        return Objects.hash(start,end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(start, edge.start) && Objects.equals(end, edge.end);
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }



    

}
