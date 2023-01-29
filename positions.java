package com.example;
//leetcode solution


public class positions {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};

       
        int start = search2(nums, 0, true);
        int end = search2(nums, start, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
      

        
    }
    public int[] search(int[] nums, int target){
        int[] ans = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid - 1;

            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                
            }
        }
        return ans;
        
    }
    static int search2(int[] nums, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid - 1;

            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStart==true){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
        }
        return ans;

    }
    


    }
    

