import java.util.Random;


public class Lists {
	
    public static int[] getListA()
    {
    	Random rand = new Random();
        int[] temp= new int[10000];
        for(int i=0; i<temp.length; i++)
        {
        	temp[i]=rand.nextInt(temp.length);
        }
        return temp;
    }
    public static int[] getListB()
    {
    	int[] temp= new int[10000];
        for(int i=0; i<temp.length; i++)
        {
        	temp[i]=temp.length-i;
        }
        return temp;
    }
    public static int[] getListC()
    {
    	int[] temp= new int[10000];
        for(int i=0; i<temp.length; i++)
        {
        	temp[i]=i;
        }
        return temp;
    }
}
