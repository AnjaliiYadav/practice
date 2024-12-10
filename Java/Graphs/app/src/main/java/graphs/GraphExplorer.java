package graphs;

public class GraphExplorer {

   

    public static Node[] parseGraph (String spec){
        String[] lines = spec.split("\n");

        int numNodes = Integer.parseInt(lines[0]);
        int numEdges = Integer.parseInt(lines[1]);

        Node[] nodes = new Node[numNodes];

        for ( int i =0; i<numNodes; i++){
            nodes[i] = new Node(i+1);
        }

        for (int i =2; i<lines.length; i++){
            String[] edges = lines[i].split(" ");
            for(String e: edges){
                Node n = new Node(Integer.parseInt(e));
                nodes[i-1].addNeighbour(n);
            } 
        }

        return nodes;

    }

}
