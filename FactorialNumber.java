package guvi1;
import java.util.*;
public class FactorialNumber {
	public static void main(String[] args) {
		int n;
		int f=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++){
		f=f*i;
		}
		System.out.println(f);

	}

}
