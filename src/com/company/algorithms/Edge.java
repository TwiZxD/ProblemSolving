package com.company.algorithms;

/**
 * Created by Johan Segerlund on 2018-07-30.
 */
public class Edge implements Comparable {
    private final Node source;
    private final Node destination;
    private final int weight;

    public Edge(Node source, Node destination, int weight)  {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
