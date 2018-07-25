package guvi1;
import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		/*String c[]={"a","e","i","o","u","A","E","I","O","U"};
		Scanner in=new Scanner(System.in);
		Object a[]=c;
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}*/
		int[] a={1,2,3,4,5};
		int[] b={5,5};
		a=b;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		a=b;
		System.out.println();
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	  }


}
