package com.example;
//find the smallest element in array greater than or equal to target

public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,9,14,16,18};
        int target = 17;
        System.out.println(search(arr, target));
        
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
    
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid]>=target){
                end = mid - 1;
                ans = mid;
            }
            

        }
        /*int target2 = 0;
        if(flag == 0){
            for(int i = 0; i<arr.length; i++){
                if(arr[start+(end-start)/2]>target){
                    target2 = start+(end-start)/2;
                    break;
                }

            }*/

        
            return ans;
    }
   
    
}
