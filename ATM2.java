package com.example;
import java.util.Scanner;
/*here is an ATM machine. Initially, it contains a total of KK units of money. NN people (numbered 11 through NN) want to withdraw money; for each valid ii, the ii-th person wants to withdraw A_iA 
i
​
  units of money.

The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.

For each person, determine whether they will get the required amount of money or not. */

public class ATM2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[] =new int[n];
            String s=" ";
            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                if(k>=arr[j])
                {
                    s=s+"1";
                    k=k-arr[j];
                }
                else
                    s=s+"0";
            }
            System.out.println(s);

        }
    }
}
