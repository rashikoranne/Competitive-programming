import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/LP1TO201/problems/MXEVNSUB

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int sum = 0;
		    int count = 0;
		    while(n>0){
		        sum = sum + n;
		        n--;
		        count++;
		        
		    }
		    if(sum%2==0){
		        System.out.println(count);

		    }
		    else{
		        System.out.println(count-1);
		    }
		    
		}
		    
	}
}
