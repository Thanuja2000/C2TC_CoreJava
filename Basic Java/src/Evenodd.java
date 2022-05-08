import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int number=in.nextInt();
		if((number&1)==1)
			System.out.println("number is odd");
		else
			System.out.println("number is even");
         
	}

}
