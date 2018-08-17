package guvi1;
import java.util.*;
public class MinArray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int l=a.length;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();}
		int min=a[0];
		for(int i=1;i<n;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
