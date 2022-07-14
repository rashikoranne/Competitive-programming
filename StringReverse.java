package com.example;

public class StringReverse {
    public static void main (String[] args) throws java.lang.Exception
    {
        String s = "Badminton is an elite sport which only a few can learn";
        System.out.println(rev(s));






    }
    static String rev(String s){

        String reverse = "";
        for(int i = s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;

    }


    }

}
