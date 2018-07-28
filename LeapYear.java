package guvi1;
import java.util.*;
public class LeapYear {
	public static void main(String args[]){
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n%4==0){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}
	}

}
