package main.java.socs.network.node;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by alicezhu on 25/2/2018.
 */
public class Node {

    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addAdjacent(Node adjacent, int distance) {
        adjacentNodes.put(adjacent, distance);
    }


    public Node(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printNeighborNodes(){
        for (Map.Entry<Node, Integer> entry : this.adjacentNodes.entrySet()) {
            Node keyNode = entry.getKey();
            int value = entry.getValue();
            System.out.print("Neighbor:" + keyNode.getName() + " " + value + "\n");
        }
    }

}