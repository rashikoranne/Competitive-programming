package com.example;

public class linearsearchstring {
    
    public static void main(String[] args) {
        String name = "Rashi";
        char target = 'l';
        System.out.println(search(name, target));

        
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;


    }
    /* FOR - EACH METHOD
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for each(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;


    }*/
    
}
