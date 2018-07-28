package guvi1;
import java.util.*;
public class Alpha {
	public static void main(String[] args) {
		char s;
		Scanner in=new Scanner(System.in);
		s=in.next().charAt(0);
		if(s>='a'&&s<='z'||s>='A' &&s<='Z'){
			System.out.println("Alphabet");
		}else{
			System.out.println("No");
		}
	

	}

}
