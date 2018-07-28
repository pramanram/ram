package guvi1;
import java.util.*;
public class Laragest {
	public static void main(String[] args) {
		int a,b,c,n;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();//\\172.16.1.22 student student wibro logic raman m=3 1.program
		b=in.nextInt();
		c=in.nextInt();
		n=in.nextInt();
		int e=0,f=0,i=0;
	    int[] s=new int[n];
	    s[0]=a;
	    s[1]=b;
	    s[2]=c;
	    if(s[0]<s[1] && s[1]<s[2]){
	    	e=s[1]-s[0];
	    	f=s[2]-s[1];
	    	System.out.println("e1 = "+e+":"+"f1 = "+f);
	    }else{
	    	e=s[1]-s[0];
	    	f=s[2]-s[1];
	    	System.out.println("e = "+e+":"+"f = "+f);
	    }
	        for (i =3;i<n;i++){
	        	if(i%2==0){
	        		s[i]=s[i-1]+f;
	        	}else{
	        		s[i]=s[i-1]+e;
	        	}
	    }
	        for(i=0;i<n;i++){
	        	//System.out.println(s[i]);
	        }
	        		System.out.println(s[n-1]);
	        
	}

}
