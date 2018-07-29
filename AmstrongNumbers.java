package guvi1;
import java.util.*;
import java.net.InetAddress;
public class AmstrongNumbers {
	public static void main(String args[]){
		int n;
		int c=0;
		int d=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int temp=n;
		while(n!=0){
			c=n%10;
			n=n/10;
			d+=c*c*c;
		}if(temp==d){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
		
	

}
