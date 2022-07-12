/**
 * 
 */
package Preparation;

/**
 * @author paruc
 *
 */
import java.util.*;

public class distinct_factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		int a;
		a=sr.nextInt();
		for (int i=1; i<=a;i++)
		{
			if(a%i==0) {
				System.out.println(i);
			}
				
		}

	}

}
