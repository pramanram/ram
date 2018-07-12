package even;
import java.util.*;
public class Odd {
	public static void main(String[] args) {
		int N;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N==0){
			System.out.println("zero");
		}
		else if(N>=1 && N<=100000){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}

	}

}
