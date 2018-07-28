package guvi1;
import java.util.*;
public class IntervalsPrimeNumbers {
	public static void main(String[] args) {
		int n,q;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		q=in.nextInt();
		boolean prime=true;
	for(int f=n+1;f<q;f++){
		//System.out.println(f);
		prime=true;
		if(f!=2)
		for(int j=2;j<=f/2;j++){
			if(f%j==0){
				prime=false;
				break;
			}
		}
		
	if(prime){
			System.out.println(+f);
		}
	
	}
	}

}
