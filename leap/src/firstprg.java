import java.util.*;
public class firstprg {
	public static void main(String[] args) {
	    int year;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Year:");
        year=sc.nextInt();

	    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	    {
         System.out.println("Its a leap year");
	    }
        else
        {
         System.out.println("Its not a leap year");
        }
	}
}
