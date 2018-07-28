package guvi1;
import java.util.*;
public class Power {
	public static void main(String args[]){
		int n;
		int p;
		int s=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		p=in.nextInt();
		for(int i=0;i<p;i++){
			s=s*n;
		}
		System.out.println(s);
	}

}
