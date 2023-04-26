package com.example;
public class remove_element {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        int count = 0;
    for(int i = 0; i<nums.length; i++){
        if(nums[i]!=val){
          nums[count] = nums[i];
          count+=1;
        }
     }
     System.out.println(count);
     for(int i = 0; i<nums.length; i++){
         System.out.print(nums[i]);
        }
        
    }
    


}
