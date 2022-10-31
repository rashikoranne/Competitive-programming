import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		     int p = a+b;
		    int q = b+c;
		    int r = a+c;
		    if(p>q){
		        if(p>r){
		            System.out.println(p);
		        }else{
		            System.out.println(r);
		        }
		    }else{
		        if(q>r){
		            System.out.println(q);
		        }else{
		            System.out.println(r);
		        }
		    }
	}
}
}
