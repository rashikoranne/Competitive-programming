package com.example;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4 , 6 ,76 ,85};
        int n = 5;
        search(arr, n);
        System.out.println(search(arr, n));
        
    }
    static boolean search(int[] arr, int a){
        boolean flag = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==a){
                flag = true;
                break;
                
            }
            else{
                flag = false;
            }
            
            
        }
        return flag;

    }

    
}
