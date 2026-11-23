package models;

/* 
Interface because there are two different graph implementations: List & Matrix, that must implement the following methods

<T> refers to the type of the nodes (String, Integer, another Java object). This makes the graph generic
*/

public interface Graph<T> {
    
    // ====================
    // Node CRUD
    // ====================
    
    void addNode(T node);
    void removeNode(T node);

    // ====================
    // Relationship CRUD
    // ====================
    
    void addRelationship(T origin, T destination, double weight);  
    void removeRelationship(T origin, T destination);

    // ====================
    // Setters
    // ====================

    void setWeight(T origin, T destination, double weight);

    // ====================
    // Getters
    // ====================

    double getWeight(T origin, T destination);

    // ====================
    // Others
    // ====================

    // Flag to evaluate if the graph is directed or undirected, must be implemented in GraphList & GraphMatrix 
    boolean isDirected();
}
