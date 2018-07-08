
// Boruvka's algorithm to find Minimum Spanning
// Tree of a given connected, undirected and
// weighted graph
import java.io.*;


    public class Boruvkas {
    int noOfVertices;
    int noOfEdges;
    //  one tree that will be MST
    int numTrees = 0;
    int MSTweight = 0;
    int noOfEdge;
    Edge edge[];
    Subset subsets[];
    int cheapSets[];
    class Edge {
        int src;
        int dest;
        int weight;
    }

    class Subset {
        int parent;
        int rank;
    }

    Boruvkas(int v,int e) {
        noOfVertices=v;

        noOfEdge=e;
        numTrees=v;
        edge=new Edge[e];
        subsets=new Subset[v];
        cheapSets=new int[v];
        for (int i = 0; i < e; ++i) {
            edge[i]=new Edge();
        }
        for (int i = 0; i < v; ++i)
        {
            subsets[i]=new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
            cheapSets[i] = -1;
        }
    }
    int find(int vertex) {

        Subset tempSet=subsets[vertex];
        while(subsets[vertex].parent!=vertex) {
            int parentVertex=subsets[vertex].parent;
            vertex=subsets[parentVertex].parent;
           // vertex=tempSet.parent;
        }
        return tempSet.parent;
    }
    void union(int src,int dest) {
        int xroot=find(src);
        int yroot=find(dest);
        // Attach smaller rank tree under root of high
        // rank tree (Union by Rank)
        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;

            // One becomes a rot if the rank is the same
            // increment its rank by one
        else
        {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    // The main function for MST using Boruvka's algorithm
    void boruvkaMST() {

        // Keep combining components (or sets) until all
        // components are not combined into single MST.
        while (numTrees > 1)
        {
            // Traverse through all edges and update
            // cheapest of every component
            for (int i=0; i<noOfEdge; i++)
            {
                // Find components (or sets) of two corners
                // of current edge
                int set1 = find( edge[i].src);
                int set2 = find(edge[i].dest);

                // If two corners of current edge belong to
                // same set, ignore current edge
                if (set1 == set2)
                    continue;

                    // Else check if current edge is closer to previous
                    // cheapest edges of set1 and set2
                else
                {
                    if (cheapSets[set1] == -1 ||
                            edge[cheapSets[set1]].weight > edge[i].weight)
                        cheapSets[set1] = i;

                    if (cheapSets[set2] == -1 ||
                            edge[cheapSets[set2]].weight > edge[i].weight)
                        cheapSets[set2] = i;
                }
            }

            // Consider the above picked cheapest edges and add them
            // to MST
            for (int i=0; i<noOfVertices; i++)
            {
                // Check if cheapest for current set exists
                if (cheapSets[i] != -1)
                {
                    int set1 = find( edge[cheapSets[i]].src);
                    int set2 = find( edge[cheapSets[i]].dest);

                    if (set1 == set2)
                        continue;
                    MSTweight += edge[cheapSets[i]].weight;
                   System.out.printf("Edge %d-%d included in MST %d\n",
                           edge[cheapSets[i]].src, edge[cheapSets[i]].dest,
                          edge[cheapSets[i]].weight);
                 
                    // Do a union of set1 and set2 and decrease number
                    // of trees
                    union(set1, set2);
                    numTrees--;
                }
            }
            
              for (int i=0; i<noOfVertices; i++)
            {
                cheapSets[i]=-1;

            }
        }
       
    }

	public static void main (String[] args) {
		//code
		System.out.println("hello there get ready");
		Boruvkas graph=new Boruvkas(9,14);
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 1;

        // add edge 1-2
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 1;


        // add edge 1-7
        graph.edge[2].src = 1;
        graph.edge[2].dest = 7;
        graph.edge[2].weight = 1;

        // add edge 0-7
        graph.edge[3].src = 0;
        graph.edge[3].dest = 7;
        graph.edge[3].weight = 1;

        // add edge 7-6
        graph.edge[4].src = 6;
        graph.edge[4].dest = 7;
        graph.edge[4].weight = 1;

        // add edge 7-8
        graph.edge[5].src = 7;
        graph.edge[5].dest = 8;
        graph.edge[5].weight = 1;

        // add edge 2-8
        graph.edge[6].src =2;
        graph.edge[6].dest = 8;
        graph.edge[6].weight = 1;

        // add edge 2-5
        graph.edge[7].src =2;
        graph.edge[7].dest = 5;
        graph.edge[7].weight = 1;


        // add edge 8-6
        graph.edge[8].src =8;
        graph.edge[8].dest = 6;
        graph.edge[8].weight = 1;


               // add edge 2-3
        graph.edge[9].src =2;
        graph.edge[9].dest = 3;
        graph.edge[9].weight = 1;


        // add edge 3-5
        graph.edge[10].src =3;
        graph.edge[10].dest = 5;
        graph.edge[10].weight =1;

        // add edge 3-4
        graph.edge[11].src =3;
        graph.edge[11].dest = 4;
        graph.edge[11].weight =1;


        // add edge 4-5
        graph.edge[12].src =4;
        graph.edge[12].dest = 5;
        graph.edge[12].weight =1;

        // add edge 5-6
        graph.edge[13].src =5;
        graph.edge[13].dest = 6;
        graph.edge[13].weight =1;

        graph.boruvkaMST();
	}
}