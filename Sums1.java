package guvi1;
import java.util.*;
public class Sums1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int l=a.length;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();}
		int max=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
