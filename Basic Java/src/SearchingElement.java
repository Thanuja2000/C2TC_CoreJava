import java.util.Scanner;

public class SearchingElement {
	
	public static void main(String[] args) {
		int flag=-1;
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter the size of elements");
		int size=bc.nextInt();	
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
			arr[i]=bc.nextInt();
		System.out.println("Enter the element to search");
		int key=bc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=i;
				break;
			}
		}
    if(flag!=-1)
	   System.out.println("Index postition of "+ key +" is : "
	   		+ ""+flag);
    else
	   System.out.println("Element not found");
	}
}


