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
		    float s = sc.nextInt();
		    float a = sc.nextInt();
		    float b = sc.nextInt();
		    float c = sc.nextInt();
		    float cent = (s*c)/100;
		    float total = s + cent;
		    
		    if(total>=a && total<=b){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
