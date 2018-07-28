package guvi1;
import java.util.*;
public class SumIntegers {
	public static void main(String args[]){
		int n;
		int n1;
		int sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		n1=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n1;i++){
			a[i]=in.nextInt();
			sum=sum+a[i];
		}System.out.println(sum);
	}

}
