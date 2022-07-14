package Preparation;
import java.util.*;
public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sr=new Scanner(System.in);
int a,b,c;
a=sr.nextInt();
b=sr.nextInt();
c=sr.nextInt();
if(a>b&& a>c)
{
	if(b>c) {
	System.out.println(b);
	}
	else
	{
		System.out.println(c);
	}
	
}
else if(b>c&&b>a){
	if(a>c) {
		System.out.println(a);
		
	}
	else
	{
		System.out.println(c);
	}
}
else
	{if(a>b) {
		
		System.out.println(a);
	}
	else
	{
		System.out.println(b);
	}
	
}

	}
}
