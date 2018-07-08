//David Smith
//finds mst with specified constraint on the number of vertices
//both kruskal and prim's methods are used

package mstRestric;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import mstRestric.projectJ.components;

public class TreeGraph {
	
	static ArrayList<Integer> cnt;
	static Integer[] degr;
	static int constr;

	public static class comp {
	
	static List<HashSet<Integer>> set;
	static int num;
	//fills the graph with designated num of vert
	comp(int[] vert){
		
		set = new ArrayList<HashSet<Integer>>(vert.length);
		num = vert.length;
		
		for(int i=0; i<num; i++){
			set.add(i, new HashSet<Integer>());
			set.get(i).add(i);
		}
	}
	
	//creates edges
	public void setEdge(int x, int y, int z){
		int temp1 = 0, temp2 = 0;
		
		for(int i = 0; i < set.size(); i++){
			if(check(x, y, z)) return;			
		}
		
		for (int i = 0; i < set.size(); i++){
			if(set.get(i).contains(y)) temp1 = i;
			if(set.get(i).contains(z)) temp2 = i;
		}
		
		set.get(temp1).addAll(set.get(temp2));
		set.get(temp2).clear();
		num--;		
	}
	
	//see if an edge is already there
	public boolean check(int x, int y, int z){
		boolean checkY = false;
		boolean checkZ = false;
		
		if (set.get(x).contains(y)) checkY = true;
		if (set.get(x).contains(y)) checkZ = true;
		if (checkZ && checkY) return true;
				
		return false;
	}
	
}
	
	//kruskal implementation
	  static Integer[][] kruskal(Integer[][] A) {
	        
		  int i, j, tempI1, tempI2, compI;

	        components c = new components(A[0]);

	        degr = new Integer[A.length];
	        for (i = 0; i < degr.length; i++) {
	            degr[i] = 0;
	        }

	        //answer
	        Integer[][] mst = new Integer[A.length][A.length];
	        for (i = 0; i < mst.length; i++) {
	            for (j = 0; j < mst.length; j++) {
	                mst[i][j] = 0;
	            }
	        }

	        //combining components and finds cheapest edge
	        while (c.size() > 1) {

	            Integer cheapestEdge = Integer.MAX_VALUE;
	            tempI1 = -1;
	            tempI2 = -1;
	           
	            for (i = 0; i < mst.length; i++) {
	                for (j = 0; j < mst.length; j++) {
	                    if (A[i][j] < cheapestEdge && A[i][j] != 0) {
	                        cheapestEdge = A[i][j];
	                        tempI1 = i;
	                        tempI2 = j;
	                    }
	                }
	            }

	            if (cheapestEdge == Integer.MAX_VALUE) {
	                return mst;
	            }

	            //makes sure it does not break the constraint
	            if (c.findSet(tempI1) != c.findSet(tempI2) && degr[tempI1] < constr && degr[tempI2] < constr) {
	                degr[tempI1]++;
	                degr[tempI2]++;
	                mst[tempI1][tempI2] = cheapestEdge;
	                mst[tempI2][tempI1] = cheapestEdge;
	                compI = 0;
	                while (compI < A.length) {
	                    if (c.components.get(compI).contains(tempI1) || c.components.get(compI).contains(tempI2)) {
	                        c.AddEdge(compI, tempI1, tempI2);
	                    }
	                    compI++;
	                }
	            }

	            A[tempI1][tempI2] = 0;
	            A[tempI1][tempI1] = 0;
	            compI = 0;

	        }
	        return mst;
	    }
	  //prim's implementation
    static Integer[][] prim(Integer[][] A, int Start) {
        int i, j;
        
        //making sure the constraint isn't broken
        degr = new Integer[A.length];
        for (i = 0; i < degr.length; i++) {
            degr[i] = 0;
        }
        
        //adds what is connected to the starting node
        cnt = new ArrayList<Integer>();
        cnt.add(Start);

        //answer
        Integer[][] mst = new Integer[A.length][A.length];
        for (i = 0; i < mst.length; i++) {
            for (j = 0; j < mst.length; j++) {
                mst[i][j] = 0;
            }
        }
        

        // weight, row, column
        Integer[] triple = uncntNodes(A, mst);
        while (triple[0] != Integer.MAX_VALUE) {
            mst[triple[1]][triple[2]] = triple[0];
            mst[triple[2]][triple[1]] = triple[0];
            //adds node
            if (!cnt.contains(triple[1])) {
                cnt.add(triple[1]);
            }
            if (!cnt.contains(triple[2])) {
                cnt.add(triple[2]);
            }
            
            degr[triple[1]]++;
            degr[triple[2]]++;
            triple = uncntNodes(A, mst);
        }

        return mst;
    }
	
static boolean inTree(Integer[][] mst, int node) {
    for (int i = 0; i < cnt.size(); i++) {
        for (int j = 0; j < mst.length; j++) {
            if (mst[cnt.get(i)][j] != 0 && (cnt.get(i) == node || j == node)) {
                return true;
            }
        }
    }
    return false;
}

static boolean Adjacent(Integer[][] A, int node) {
    for (int i = 0; i < cnt.size(); i++) {
        for (int j = 0; j < A.length; j++) {
            if (A[cnt.get(i)][j] != 0 && (j == node)) {
                return true;
            }
        }
    }
    return false;
}

static Integer[] uncntNodes(Integer[][] A, Integer[][] mst) {
    int row = -1, col = -1;
    int leastEdge = Integer.MAX_VALUE;
    for (int i = 0; i < cnt.size(); i++) {
        for (int j = 0; j < A.length; j++) {
            if (A[cnt.get(i)][j] != 0) {
                if ((!inTree(mst, j)) && (A[cnt.get(i)][j] < leastEdge) && degr[cnt.get(i)] < constr) {
                    leastEdge = A[cnt.get(i)][j];
                    row = cnt.get(i);
                    col = j;
                }
            }
        }
    }
    Integer[] answer = {leastEdge, row, col};
    return answer;
}

public static void main(String[] args) {

    System.out.println("Enter constraint on MST: ");
    Scanner s = new Scanner(System.in);
    constr = s.nextInt();
    s.close();

    System.out.println();

    Integer[][] adjMatrix2 = {
        {1, 3, 3, 1, 1},
        {5, 2, 1, 9, 4},
        {3, 1, 1, 2, 6},
        {6, 3, 0, 3, 2},
        {1, 3, 6, 6, 4},
    };

    System.out.println("Prim's MST with a constraint of " + constr + ".");
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

    System.out.println("\nSOLUTION\n");

    for (int i = 0; i < result2.length; i++) {
        System.out.printf("%s%2d:", "Vertex", i);
        for (int j = 0; j < result2.length; j++) {
            System.out.printf("[%" + 2 + "d]", result2[i][j]);
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Kruskal's MST with a constraint of " + constr+ ".");
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

    System.out.println("\nSOLUTION\n");

    for (int i = 0; i < result2.length; i++) {
        System.out.printf("%s%2d:", "Vertex", i);
        for (int j = 0; j < result2.length; j++) {
            System.out.printf("[%" + 2 + "d]", result2[i][j]);
        }
        System.out.println();
    }

}

}