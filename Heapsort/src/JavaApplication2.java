/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author Thomas
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] lists = new int[6][10000];
        lists[0] = Lists.getListA();
        lists[1]= Lists.getListB();
        lists[2]= Lists.getListC();
        lists[3] = Lists.getListA();
        lists[4]= Lists.getListB();
        lists[5]= Lists.getListC();
        Stopwatch sw= new Stopwatch();
        //the stopwatch is now running
        for(int j = 0; j<lists.length; j++){
            sw.Restart();
            for(int i=0; i<lists[j].length; i++){
                System.out.print(lists[j][i]+", ");
            }
            sw.Stop();
            //the stopwatch has stopped, check the time
            System.out.println("\nThis took "+sw.elapsedTime()+" MicroSeconds");
        }
    }
    
}
