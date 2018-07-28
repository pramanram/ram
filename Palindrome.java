package guvi1;
import java.util.*;
public class Palindrome {
	public static void main(String args[]){
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		String s=Integer.toString(n);
		String s1=new StringBuffer(s).reverse().toString();
		if(s.equals(s1)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
