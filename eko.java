package com.example;
public class eko {
    //20 16 10 17
    public static void main(String[] args) {
        int ar[] = new int[]{4,42, 40, 26 ,46};
        int height = 20;
        int max = 0;
        for(int i = 0; i<ar.length; i++){
            if(ar[i]>max){
                max = ar[i];
            }

        }
        //System.out.println(max);
        
        int sum = 0;
        boolean flag = false;
        while(max>0){
            for(int i = 0; i<ar.length; i++){
                if(ar[i]>=max){
                    sum += ar[i] - max;
                }
                
                if(sum>=height){
                    flag = true;
                    break;
                }
                }
                if(flag){
                    break;
                }
                sum = 0;
                max--;
            
        
    }
        System.out.println(max);
        

    }
    
}
