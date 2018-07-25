package guvi1;
import java.util.*;
public class Vo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	char s=in.next().charAt(0);
		int c=0;
		int n=(int)s;
		if(n>=65 && n<=90 || n>=97 && n<=122){
		if(n==97 || n==101||n==105||n==111||n==117||n==65||n==69||n==73||n==79||n==85){
			c++;
		}if(c!=0){
			System.out.println("vowels");
		}else{
			System.out.println("consonants");
		}
		}else{
			System.out.println("Invalid");
		}

		
	}

}
