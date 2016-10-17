/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00183089
 */
public class LargestArray {
    int array[] = new int[10];
    
    public static int findLargest(int [] array){

        return findLargestSub(array, array.length -1);
    }
    
    private static int findLargestSub(int [] array, int end){
        if (end == 0){
            return array[0];
        }
        else{
            int max = findLargestSub(array, end -1);
            if(max > array[end]){
                return max;           
            }
            else 
                return array[end];
        }
        
    }
    
    
}
