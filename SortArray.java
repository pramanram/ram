package guvi1;
import java.util.*;
public class SortArray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int l=a.length;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			}
		Arrays.sort(a);
		for(int b:a){
			System.out.println(b);
		}

	}

}
