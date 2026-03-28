/**
 *
 * @author Anna Jang
 * @set C
 * @studentnumber A01405877
 */

public class Graph
{
    final public int NOT_FOUND = -1;

    String[] vertexLabels;
    boolean isDirected;
    int[][] adjacencyMatrix;
    String lastBFSResult;
    String lastDFSResult;


    /**
     * Graph constructor for an NxN adjacency matrix and initialized to all zeroes.
     * @param vertexLabels an array of Strings that represent the names of vertices.
     *                     The number of names will determine N, the size of the graph.
     * @param isDirected whether the graph is directed or undirected.
     */
    public Graph(String[] vertexLabels, boolean isDirected)
    {
        this.vertexLabels = vertexLabels;
        this.isDirected = isDirected;
        this.adjacencyMatrix = initializeAdjacencyMatrix(vertexLabels.length);
    }

    private int[][] initializeAdjacencyMatrix(int n)
    {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = 0;
            }
        }

        return matrix;
    }

    private int getIndexFromLabel(String label)
    {
        int index = NOT_FOUND;
        int size = size();
        for (int i = 0; i < size; i++)
        {
            if (vertexLabels[i].equals(label))
            {
                index = i;
                return index;
            }
        }
        return index;
    }

    /**
     * Returns whether the graph is directed.
     * @return true or false depending on if the graph is directed or undirected respectfully.
     */
    public boolean isDirected()
    {
        return isDirected;
    }

    /**
     * Adds an edge between vertex A to vertex B.
     * If the graph is undirected, both entries in the adjacency matrix set to 1.
     * If any string is not present in the list of vertices, the function quietly does nothing.
     * @param a label of vertex A.
     * @param b label of vertex B.
     */
    public void addEdge(String a, String b)
    {
        if (a.isBlank() || b.isBlank())
            return;

        int indexA = getIndexFromLabel(a);
        int indexB = getIndexFromLabel(b);

        if (indexA == -1 || indexB == -1)
            return;

        if (isDirected)
        {
            adjacencyMatrix[indexA][indexB] = 1;
        }
        else
        {
            adjacencyMatrix[indexA][indexB] = 1;
            adjacencyMatrix[indexB][indexA] = 1;
        }
    }

    /**
     * Returns the number of vertices in the adjacency matrix.
     * @return number of vertices in the adjacency matrix.
     */
    public int size()
    {
        return vertexLabels.length;
    }

    /**
     * Returns the string name of the vertex numbered v in the list of vertices.
     * @param v assumed to be an integer in range 0->N-1 inside the adjacency matrix.
     * @return the name of the vertex numbered 'v' in the vertices list.
     */
    public String getLabel(int v)
    {
        return vertexLabels[v];
    }

    /**
     * Returns a string representation of the adjacency matrix.
     * Includes one line of "output" for each vertex in the same order they are listed in the graph.
     * @return a human-readable string of the adjacency matrix.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int size = size();

        for (int i = 0; i < size; i++)
        {
            // label
            sb.append(getLabel(i));
            sb.append(":");

            // Adjacency matrix
            for (int j = 0; j < size; j++)
            {
                sb.append(" ");
                sb.append(adjacencyMatrix[i][j]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Performs DFS algorithm on the graph. The first vertex will be the default starting position.
     *
     * The output resulting from this method should include all the vertices of the graph even if the graph is not connected
     * @param quiet if true, the console will produce no output.
     *              If false, the method will print out the sequence of vertices as they are visited.
     */
    public void runDFS(boolean quiet)
    {

    }

    /**
     * Performs DFS algorithm on the graph, starting at vertex v.
     * As the program runs, save two lists of vertices internally.
     * The first will be the DFS order of the vertices which is the order they are visited during the search.
     * The second list is the finished order (aka dead-end-order)
     *
     * If the graph is not connected, the output of this method will not include all the vertices of the graph,
     * but only the ones reachable from the start vertex v
     * @param v specified vertex to start from.
     * @param quiet if true, the console will produce no output.
     *              If false, the method will print out the sequence of vertices as they are visited.
     */
    public void runDFS(String v, boolean quiet)
    {

    }

    /**
     * Runs BFS algorithm on the graph. The first vertex will be the default starting position.
     *
     * The output resulting from this method will include all the vertices of the graph even if the graph is not connected
     * @param quiet if true, the console will produce no output.
     *              If false, the method will print out the sequence of vertices as they are visited.
     */
    public void runBFS(boolean quiet)
    {

    }

    /**
     * Runs BFS algorithm on the graph, starting at vertex v
     * As the program runs, a list of vertices will be saved in the order they are visited during the search.
     *
     * If the graph is not connected, the output of this method will not include all the vertices of the graph,
     * but only the ones reachable from the start vertex v
     * @param v specified vertex to start from.
     * @param quiet if true, the console will produce no output.
     *              If false, the method will print out the sequence of vertices as they are visited.
     */
    public void runBFS(String v, boolean quiet)
    {

    }

    /**
     * Gets the result of the most recently performed DFS.
     * @return a string containing the DFS order results of the most recently performed DFS.
     *         If no RunDFS() method has been called, a message will be displayed to the user.
     */
    public String getLastDFSOrder()
    {
        return getString();
    }

    private String getString()
    {
        return lastDFSResult == null ? "Depth first search has not been run yet" : lastDFSResult;
    }

    /**
     * Returns a string containing the dead-end order results of the most recently performed DFS.
     * @return a string containing the dead-end order result of the most recently performed DFS.
     *         If no RunDFS() method has been called, a message will be displayed to the user.
     */
    public String getLastDFSDeadEndOrder()
    {

    }

    /**
     * Get results of most recently performed BFS.
     * @return a string containing the result of the most recently performed BFS.
     *         if no RunBFS() was called, a message will be displayed to the user.
     */
    String getLastBFSOrder()
    {
        return lastBFSResult == null ? "Breadth first search has not been run yet" : lastBFSResult;
    }

}
