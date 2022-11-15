package com.example;
//linear search algo where index is printed if the element is found
public class linearsearchindex {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 34, 55, 44, 56, 92};
        int n = 55;
        search(arr, n);
        if(search(arr, n) == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The element was fount at the index: " + search(arr, n));
        }
        

    }
    static int search(int[] arr, int a){ 
        int index = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == a){
                index = i;
             }
       
        }
        return index;
       
        
        
    }
}
    

