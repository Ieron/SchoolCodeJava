package degreeRestrainedST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TreeGraph {
	
	static ArrayList<Integer> cnt;
	static Integer[] degr;
	static int constr;
	List<HashSet<Integer>> set;
	int num;
	
	//fills the graph with designated num of vert
	TreeGraph(int[] vert){
		
		set = new ArrayList<HashSet<Integer>>(vert.length);
		num = vert.length;
		
		for(int i=0; i<num; i++){
			set.add(i, new HashSet<Integer>());
			set.get(i).add(i);
		}
	}
	
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
	
	public boolean check(int x, int y, int z){
		boolean checkY = false;
		boolean checkZ = false;
		
		if (set.get(x).contains(y)) checkY = true;
		if (set.get(x).contains(y)) checkZ = true;
		if (checkZ && checkY) return true;
				
		return false;
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
}
