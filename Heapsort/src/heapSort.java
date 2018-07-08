//David Smith

public class heapSort {
	//declare needed variables
    private static int[] heapA;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    //creates/fills the heap from an array
    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            minheap(a,i);
        }
    }
    
    //sorts the heap into a min heap
    public static void minheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] < a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] < a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            minheap(a, largest);
        }
    }
    
    //method used to swap nodes
    public static void exchange(int i, int j){
        int t=heapA[i];
        heapA[i]=heapA[j];
        heapA[j]=t; 
        }
    
    //sorts an array using a heap
    public static void sort(int []a0){
        heapA=a0;
        buildheap(heapA);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            minheap(heapA, 0);
        }
    }
    
    public static void main(String[] args) {
    	
        int []h1=Lists.getListA();
        int []h2=Lists.getListB();
        int []h3=Lists.getListC();
        double time;
        
        Stopwatch w = new Stopwatch();
        sort(h1);
        //w.Stop();
        time = w.elapsedTime();
        System.out.println("ListA: "+ java.util.Arrays.toString(h1));
        System.out.println("\nThis took "+time+" MilliSeconds\n");

        
        w.Restart();
        sort(h2);
        time = w.elapsedTime();
        System.out.println("ListB: "+ java.util.Arrays.toString(h2));
        System.out.println("\nThis took "+time+" MilliSeconds\n");
        
        w.Restart();
        sort(h3);
        time = w.elapsedTime();
        System.out.println("ListC: "+ java.util.Arrays.toString(h3));
        System.out.println("\nThis took "+time+" MilliSeconds");

    }
}

