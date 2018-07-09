package mstRestric;

import java.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class projectJ {

    static ArrayList<Integer> connected;
    static Integer[] degrees;
    static int constraint;

    public static void main(String[] args) {

        System.out.println("Please enter how many degrees the MST is constrained to:");
        Scanner s = new Scanner(System.in);
        constraint = s.nextInt();
        s.close();

        System.out.println();
        //Example from homework 4; can be changed as desired.
        Integer[][] adjMatrix2 = {
        	       {1, 3, 3, 1, 1},
        	        {5, 2, 1, 9, 4},
        	        {3, 1, 1, 2, 6},
        	        {6, 3, 0, 3, 2},
        	        {1, 3, 6, 6, 4},};

        System.out.printf("Finding a MST using Prim's algorithm with a constraint of %d degrees:", constraint);
        System.out.println();
        for (int i = 0; i < adjMatrix2.length; i++) {
            System.out.printf("%s%2d:", "Vertex", i);
            for (int j = 0; j < adjMatrix2.length; j++) {
                System.out.printf("[%" + 2 + "d]", adjMatrix2[i][j]);
            }
            System.out.println();
        }

        Integer[][] result2 = prim(adjMatrix2, 0);

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2.length; j++) {
                if (result2[i][j] == null) {
                    result2[i][j] = 0;
                }
            }
        }

        System.out.println("\nThe solution:\n");

        for (int i = 0; i < result2.length; i++) {
            System.out.printf("%s%2d:", "Vertex", i);
            for (int j = 0; j < result2.length; j++) {
                System.out.printf("[%" + 2 + "d]", result2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("Finding a MST using Kruskal's algorithm with a constraint of %d degrees:", constraint);
        System.out.println();
        for (int i = 0; i < adjMatrix2.length; i++) {
            System.out.printf("%s%2d:", "Vertex", i);
            for (int j = 0; j < adjMatrix2.length; j++) {
                System.out.printf("[%" + 2 + "d]", adjMatrix2[i][j]);
            }
            System.out.println();
        }

        result2 = kruskal(adjMatrix2);

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2.length; j++) {
                if (result2[i][j] == null) {
                    result2[i][j] = 0;
                }
            }
        }

        System.out.println("\nThe solution:\n");

        for (int i = 0; i < result2.length; i++) {
            System.out.printf("%s%2d:", "Vertex", i);
            for (int j = 0; j < result2.length; j++) {
                System.out.printf("[%" + 2 + "d]", result2[i][j]);
            }
            System.out.println();
        }

    }

    static Integer[][] prim(Integer[][] A, int Start) {
        int i, j;
        
        //Here we keep track of the degree of each vertex, in order to make sure
        // we do not excede our constraint.
        degrees = new Integer[A.length];
        for (i = 0; i < degrees.length; i++) {
            degrees[i] = 0;
        }
        
        //We keep track of which nodes are connected to the origin here.
        connected = new ArrayList<Integer>();
        connected.add(Start);

        //This is where we store our answer
        Integer[][] mst = new Integer[A.length][A.length];
        for (i = 0; i < mst.length; i++) {
            for (j = 0; j < mst.length; j++) {
                mst[i][j] = 0;
            }
        }
        
        //unconnectedNodes returns the value of the smallest adjacent node to our
        // connected subtree, and its indices as a triple:
        // {weight, row, column}
        Integer[] triple = unconnectedNodes(A, mst);
        while (triple[0] != Integer.MAX_VALUE) {
            mst[triple[1]][triple[2]] = triple[0];
            mst[triple[2]][triple[1]] = triple[0];
            //if one of the nodes isn't connected to the subtree, add it.
            if (!connected.contains(triple[1])) {
                connected.add(triple[1]);
            }
            if (!connected.contains(triple[2])) {
                connected.add(triple[2]);
            }
            
            //increment the degree of the newly connected nodes
            degrees[triple[1]]++;
            degrees[triple[2]]++;
            triple = unconnectedNodes(A, mst);
        }

        return mst;
    }

    static Integer[][] kruskal(Integer[][] A) {
        int i, j, index, index2, componentIndex;

        //Initialize V number of components (comprised of a single vertex)
        components c = new components(A[0]);
        //initialize degrees
        degrees = new Integer[A.length];
        for (i = 0; i < degrees.length; i++) {
            degrees[i] = 0;
        }

        //This is where we store our answer
        Integer[][] mst = new Integer[A.length][A.length];
        for (i = 0; i < mst.length; i++) {
            for (j = 0; j < mst.length; j++) {
                mst[i][j] = 0;
            }
        }

        //Combine the components til we only have one left (or til we hit an escape condition)
        while (c.size() > 1) {

            Integer cheapestEdge = Integer.MAX_VALUE;
            index = -1;
            index2 = -1;
            //Search for the cheapest edge.
            // Later on, it is made clearer why we do not need a priority queue
            // for the edges.
            for (i = 0; i < mst.length; i++) {
                for (j = 0; j < mst.length; j++) {
                    if (A[i][j] < cheapestEdge && A[i][j] != 0) {
                        cheapestEdge = A[i][j];
                        index = i;
                        index2 = j;
                    }
                }
            }

            //This is an escape condition, if the algorithm cannot find any more edges.
            if (cheapestEdge == Integer.MAX_VALUE) {
                return mst;
            }

            //If the edge connects two components, and doesn't exceed our constraint,
            // then we add it to the mst. And etc.
            if (c.findSet(index) != c.findSet(index2) && degrees[index] < constraint && degrees[index2] < constraint) {
                degrees[index]++;
                degrees[index2]++;
                mst[index][index2] = cheapestEdge;
                mst[index2][index] = cheapestEdge;
                componentIndex = 0;
                while (componentIndex < A.length) {
                    if (c.components.get(componentIndex).contains(index) || c.components.get(componentIndex).contains(index2)) {
                        c.AddEdge(componentIndex, index, index2);
                    }
                    componentIndex++;
                }
            }

            //Instead of implementing a priority queue/heap for the edges, we just
            // remove them from the matrix one by one.
            A[index][index2] = 0;
            A[index2][index] = 0;
            componentIndex = 0;

        }
        return mst;
    }

    public static class components {

        //The "trees" are stored as Hashsets of integers. The integers represent 
        // a unique node.
        List<HashSet<Integer>> components;
        int size;

        //This constructor creates a forest populated by trees of size 1
        components(Integer[] vertices) {
            components = new ArrayList<HashSet<Integer>>(vertices.length);
            int size = vertices.length;
            for (int i = 0; i < vertices.length; i++) {
                components.add(i, new HashSet<Integer>());
                components.get(i).add(i);
            }
        }

        public int findSet(int v) {
            for (int i = 0; i < components.size(); i++) {
                if (!components.get(i).isEmpty()) {
                    if (components.get(i).contains(v)) {
                        return i;
                    }
                }
            }
            return -1;
        }

        //Calcualtes how many individual components there are.
        public int size() {
            int result = 0;
            for (int i = 0; i < components.size(); i++) {
                if (!components.get(i).isEmpty()) {
                    result++;
                }
            }
            return result;
        }

        //for debugging
        public void print() {
            for (int i = 0; i < components.size(); i++) {
                if (!components.get(i).isEmpty()) {
                    System.out.println(components.get(i).toString());
                }
            }
        }

        //Checks to see if an edge is already in a component somewhere.
        //i is the index of the component.
        public boolean contains(int i, int u, int v) {
            boolean hasU, hasV;
            hasU = false;
            hasV = false;
            if (components.get(i).contains(u)) {
                hasU = true;
            }
            if (components.get(i).contains(v)) {
                hasV = true;
            }
            if (hasU && hasV) {
                return true;
            }
            return false;
        }

        //adds an edge - this edge will necessarily connect two trees,
        // so we clear one of the HashSets to ensure we don't have duplicate edges
        public void AddEdge(int index, int u, int v) {
            int index1 = 0;
            int index2 = 0;
            //I wrote this at 5 am last night. I have no idea why it works, nor 
            // why there are three separate index variables. But it works.
            for (int i = 0; i < components.size(); i++) {
                if (contains(index, u, v)) {
                    return;
                }
            }

            for (int i = 0; i < components.size(); i++) {
                if (components.get(i).contains(v)) {
                    index1 = i;
                }
                if (components.get(i).contains(u)) {
                    index2 = i;
                }
            }
            components.get(index1).addAll(components.get(index2));
            components.get(index2).clear();
            size--;
        }
    }

    static boolean inTree(Integer[][] mst, int node) {
        for (int i = 0; i < connected.size(); i++) {
            for (int j = 0; j < mst.length; j++) {
                if (mst[connected.get(i)][j] != 0 && (connected.get(i) == node || j == node)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean Adjacent(Integer[][] A, int node) {
        for (int i = 0; i < connected.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[connected.get(i)][j] != 0 && (j == node)) {
                    return true;
                }
            }
        }
        return false;
    }

    static Integer[] unconnectedNodes(Integer[][] A, Integer[][] mst) {
        int row = -1, col = -1;
        int leastEdge = Integer.MAX_VALUE;
        for (int i = 0; i < connected.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[connected.get(i)][j] != 0) {
                    if ((!inTree(mst, j)) && (A[connected.get(i)][j] < leastEdge) && degrees[connected.get(i)] < constraint) {
                        leastEdge = A[connected.get(i)][j];
                        row = connected.get(i);
                        col = j;
                    }
                }
            }
        }
        Integer[] answer = {leastEdge, row, col};
        return answer;
    }
}