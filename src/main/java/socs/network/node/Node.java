package main.java.socs.network.node;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by alicezhu on 25/2/2018.
 */
public class Node {

	// simulated IP address
    private String name;
    
    // distance from source node
    private int distance = Integer.MAX_VALUE; // initialize to infinity
    
    // shortest path to this node
    private List<Node> shortestPath = new LinkedList<>();
    
    private List<Integer> shortestPathWeights = new LinkedList<>();
    
    // links
    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addAdjacent(Node adjacent, int distance) {
        adjacentNodes.put(adjacent, distance);
    }

    public void printNeighborNodes(){
        for (Map.Entry<Node, Integer> entry : this.adjacentNodes.entrySet()) {
            Node keyNode = entry.getKey();
            int value = entry.getValue();
            System.out.print("Neighbor: " + keyNode.getName() + " " + value + "\n");
        }
    }
    public void setDistance(int d){
        this.distance = d;
    }
    public int getDistance(){
        return this.distance;
    }
    public Map<Node, Integer> getAdjacentNodes(){
        return this.adjacentNodes;
    }
    public List<Node> getShortestPath(){
        return shortestPath;
    }
    public List<Integer> getShortestPathWeights() {
    		return shortestPathWeights;
    }
    public void setShortestPath(List<Node> path){
        this.shortestPath = path;
    }
    public void setShortestPathWeights(List<Integer> path) {
    		this.shortestPathWeights = path;
    }
    public String toStringShortestPath() {
    		String Path = "";
        for(Node node : this.shortestPath){
            Path += node.getName() + " -> ";
      	  	System.out.println(node.getName());
        }
        return Path;
    }
}



