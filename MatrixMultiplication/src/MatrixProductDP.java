//David Smith
//program adapted from: http://www.sanfoundry.com/java-program-perform-optimal-paranthesization-using-dynamic-programming/
//and: http://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/
//Dynamically finds the optimal way of multiplying a set number of matrices

import java.util.Scanner;
 
public class MatrixProductDP
{
    private int[][] y;
    private int[][] s;
    private int     x;
 
    public MatrixProductDP(int[] a)
    {
        x = a.length - 1; //number of matrices
        y = new int[x + 1][x + 1]; //y and s are offset to avoid using and index of 0
        s = new int[x + 1][x + 1];
        matrixDPAlgo(a);
    }
 
    private void matrixDPAlgo(int[] a)
    {
        
        for (int i = 1; i <= x; i++) //Initializes y 
        	y[i][i] = 0;
        
        for (int k = 2; k <= x; k++)
        {
            for (int i = 1; i <= x - k + 1; i++)
            {
                int j = i + k - 1;
                y[i][j] = Integer.MAX_VALUE;
                
                for (int z = i; z < j; z++)
                {
                    int bestSplit = y[i][z] + y[z][j] + a[i - 1] * a[z] * a[j];
                    if (bestSplit < y[i][j])
                    {
                       
                        y[i][j] = bestSplit;
                        s[i][j] = z;
                    }
                }
            }
        }
    }
    
    //method that finds the best order using a greedy technique 
    static int matrixBestOrderGreedy(int a[], int i, int j)
    {
        if (i == j)
            return 0;
 
        int min = Integer.MAX_VALUE;
 
        for (int k=i; k<j; k++)
        {
            int count = matrixBestOrderGreedy(a, i, k) +
            			matrixBestOrderGreedy(a, k+1, j) +
                        a[i-1]*a[k]*a[j];
 
            if (count < min)
                min = count;
        }
 
        return min;
    }
    
    //Methods for printing out results
    private String print(int i, int j)
    {
        if (i == j)
            return "A[" + i + "]";
        else
            return "(" + print(i, s[i][j])
                    + print(s[i][j] + 1, j) + ")";
    }
 
    public String toString()
    {
        return print(1, x);
    }
 
    public static void main(String[] args)
    {
    	//greedy technique
    	int aGreedy[] = new int[] {10, 3, 8, 14, 21};
        int length = aGreedy.length;
 
        System.out.println("Minimum number of multiplications using a greedy technique: "+ matrixBestOrderGreedy(aGreedy, 1, length-1));
        
    	//dynamic technique
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nDynamic Technique\n");
        System.out.println("Enter the length of your array: ");
        
        int x = scan.nextInt();
        int a[] = new int[x];
        
        System.out.println("Enter the dimensions of the matricies: ");
        
        for (int i = 0; i < x; i++)
           
        	a[i] = scan.nextInt();
     
        MatrixProductDP optimalMultiplication = new MatrixProductDP(a);
        System.out.println("Order of matricies: ");
        
        //prints out the dimensions of the arrays being multiplied
        for (int i = 1; i < a.length; i++)
        {
            System.out.println("Array" + i + ": " + a[i - 1] + " by " + a[i]); //Array'i' dimensions are a[i-1] x a[i]
        }
        
        System.out.println("Order of optimal multiplication: " + optimalMultiplication.toString());
        
        scan.close();
    }
}