package u7pp;

import java.util.List;
import java.util.ArrayList;

public class Sorts {
    public static int[] selectionSort(int[] x){
      int[] nums = new int[x.length];
     for(int k = 0; k < x.length; k++){
       nums[k]= x[k];
     }
        for (int i = 0; i < nums.length; i++) {
          int minimum = i;
          for (int j = i + 1; j < nums.length; j++) {
              if (nums[j] < nums[minimum]) {
                minimum = j;
              }
            }
            int swap = nums[i];
          nums[i] = nums[minimum];
          nums[minimum] = swap;
      }
      return nums;
    }
    public static int[] insertionSort(int[] x){
      int[] nums = new int[x.length];
      for(int k = 0; k < x.length; k++){
        nums[k] = x[k];
      }
      for (int j = 1; j < x.length; j++) {
          int current = x[j];
          int i = j-1;
          while ((i > -1) && (x[i] > current)) {
              x[i+1] = x[i];
              i--;
          }
          x[i+1] = current;
        }
      return x;
    }
     public static List<Integer>selectionSort(List<Integer> x){
       ArrayList<Integer> nums = new ArrayList<Integer>();
       for(int k = 0; k < x.size(); k++){
         nums.add(x.get(k));
       }
        for (int i = 0; i < nums.size(); i++) {
          int maximum = i;
          for (int j = i + 1; j < nums.size(); j++) {
              if ((nums.get(j) > nums.get(maximum))) {
                  maximum = j;
              }
          
          }
          int swap = nums.get(i);
          nums.set(i, nums.get(maximum));
          nums.set(maximum, swap);
      }
      return nums;
     }
  
     public static List<Integer>insertionSort(List<Integer> x){
        ArrayList<Integer> nums = new ArrayList<Integer>();
       for(int k = 0; k < x.size(); k++){
         nums.add(x.get(k));
       }
        for (int j = 1; j < nums.size(); j++) {
            int current = nums.get(j);
            int i = j-1;
            while ((i > -1) && (nums.get(i) < current)) {
                nums.set(i+1, nums.get(i));
                i--;
            }
            nums.set(i+1, current);
          }
           
       return nums;
      }
      
  }
