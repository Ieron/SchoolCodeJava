//David Smith
//Time Complexity:  O(E log V), same as Prim's
public class BoruvkaMST {
	int node;
	int edges;
	int mainTree = 0;
	int weights = 0;
	int numEdges;
	EdgeOfTree edge[];
	Subset subsets[];
	int sets[];

	class EdgeOfTree {
		int firstNode;
		int secondNode;
		int weight;
	}

	class Subset {
		int parent;
		int level;
	}

	BoruvkaMST(int nd, int e) {
		numEdges = e;
		mainTree = nd;
		edge = new EdgeOfTree[e];
		subsets = new Subset[nd];
		sets = new int[nd];
		for (int i = 0; i < e; ++i) {
			edge[i] = new EdgeOfTree();
		}
		for (int i = 0; i < nd; ++i) {
			subsets[i] = new Subset();
			subsets[i].parent = i;
			subsets[i].level = 0;
			sets[i] = -1;
		}
	}

	int find(int vertex) {//finds each node

		Subset tempSet = subsets[vertex];
		while (subsets[vertex].parent != vertex) {
			int parentVertex = subsets[vertex].parent;
			vertex = subsets[parentVertex].parent;
		}
		return tempSet.parent;
	}

	void union(int mainRoot, int addition) {
		int mR = find(mainRoot);
		int aDD = find(addition);

		if (subsets[mR].level < subsets[aDD].level)
			subsets[mR].parent = aDD;
		else if (subsets[mR].level > subsets[aDD].level)
			subsets[aDD].parent = mR;
		else {
			subsets[aDD].parent = mR;
			subsets[mR].level++;
		}
	}

	void boruvkaMST() {

		//adds nodes until each node has been used, this insures it is a complete tree
		while (mainTree > 1) {
			// finds lowest weight
			for (int i = 0; i < numEdges; i++) {
				
				int set1 = find(edge[i].firstNode);
				int set2 = find(edge[i].secondNode);

				
				if (set1 == set2)
					continue;

				else {
					if (sets[set1] == -1 || edge[sets[set1]].weight > edge[i].weight)
						sets[set1] = i;

					if (sets[set2] == -1 || edge[sets[set2]].weight > edge[i].weight)
						sets[set2] = i;
				}
			}

			//adds edge to mst
			for (int i = 0; i < node; i++) {
				if (sets[i] != -1) {
					int set1 = find(edge[sets[i]].firstNode);
					int set2 = find(edge[sets[i]].secondNode);

					if (set1 == set2)
						continue;
					weights += edge[sets[i]].weight;
					System.out.printf(" Added edge %d-%d in MST with weight %d\n", edge[sets[i]].firstNode,
							edge[sets[i]].secondNode, edge[sets[i]].weight);

					//connects two sets
					union(set1, set2);
					mainTree--;
				}
			}

			for (int i = 0; i < node; i++) {
				sets[i] = -1;

			}
		}

	}

	public static void main(String[] args) {
		
		BoruvkaMST tree = new BoruvkaMST(9, 14);
		
		//taken from follow student for testing
		tree.edge[0].firstNode = 0;
		tree.edge[0].secondNode = 1;
		tree.edge[0].weight = 2;

		//edge 1-2
		tree.edge[1].firstNode = 1;
		tree.edge[1].secondNode = 2;
		tree.edge[1].weight = 8;

		//edge 1-7
		tree.edge[2].firstNode = 1;
		tree.edge[2].secondNode = 7;
		tree.edge[2].weight = 2;

		//edge 0-7
		tree.edge[3].firstNode = 0;
		tree.edge[3].secondNode = 7;
		tree.edge[3].weight = 15;

		//edge 7-6
		tree.edge[4].firstNode = 6;
		tree.edge[4].secondNode = 7;
		tree.edge[4].weight = 7;

		//edge 7-8
		tree.edge[5].firstNode = 7;
		tree.edge[5].secondNode = 8;
		tree.edge[5].weight = 8;

		//edge 2-8
		tree.edge[6].firstNode = 2;
		tree.edge[6].secondNode = 8;
		tree.edge[6].weight = 6;

		//edge 2-5
		tree.edge[7].firstNode = 2;
		tree.edge[7].secondNode = 5;
		tree.edge[7].weight = 5;

		//edge 8-6
		tree.edge[8].firstNode = 8;
		tree.edge[8].secondNode = 6;
		tree.edge[8].weight = 9;

		//edge 2-3
		tree.edge[9].firstNode = 2;
		tree.edge[9].secondNode = 3;
		tree.edge[9].weight = 10;

		//edge 3-5
		tree.edge[10].firstNode = 3;
		tree.edge[10].secondNode = 5;
		tree.edge[10].weight = 2;

		//edge 3-4
		tree.edge[11].firstNode = 3;
		tree.edge[11].secondNode = 4;
		tree.edge[11].weight = 13;

		//edge 4-5
		tree.edge[12].firstNode = 4;
		tree.edge[12].secondNode = 5;
		tree.edge[12].weight = 2;

		//edge 5-6
		tree.edge[13].firstNode = 5;
		tree.edge[13].secondNode = 6;
		tree.edge[13].weight = 7;

		tree.boruvkaMST();
	}
}