package guvi1;
import java.util.*;
public class PrimeNumbers {
	public static void main(String args[]){
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		boolean prime=true;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				prime=false;
				break;
			}
		}if(prime){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
