package com.example;

public class floorNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
    
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=target){
                start = mid + 1;
                ans = mid;
            }
            else if(arr[mid]>target){
                end = mid - 1;
                
            }
            
        }
        return ans;
     }
}
