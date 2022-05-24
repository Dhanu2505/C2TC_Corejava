import java.util.*;
public class secondprg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
   
        if ((num ^ 1) == num + 1) 
        { 
            System.out.println("The number "+ num +" is Even"); 
        } 
        else 
        { 
            System.out.println("The number "+ num +" is Odd"); 
        }
        
	}
}
