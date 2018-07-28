package guvi1;
import java.util.*;
public class IntervalOddNumbers {
	public static void main(String args[]){
	int n;
	int q;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	q=in.nextInt();
	if(n<=100000){
		for(int i=n+1;i<q;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		
	}
	
	}

}
