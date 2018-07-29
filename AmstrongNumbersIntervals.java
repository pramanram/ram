package guvi1;
import java.util.*;
public class AmstrongNumbersIntervals {
	public static void main(String[] args) {
		int s,f;
		int c=0;
		int d=0;
		Scanner in=new Scanner(System.in);
		s=in.nextInt();
		f=in.nextInt();
		int temp;
		for(int n=s+1;n<f;n++){
			d=0;
			temp=n;
		while(temp!=0){
			c=temp%10;
			temp=temp/10;
			d+=c*c*c;
		}if(n==d){
			System.out.println(n);
		}
		}
	
	
	}
}
