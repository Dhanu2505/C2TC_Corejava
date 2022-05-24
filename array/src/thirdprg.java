import java.util.*;
public class thirdprg {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
 
        int i,size,key,flag=0;
        System.out.println("Enter the number of elements:") ;
        size = sc.nextInt();
        int[] a = new int[size];
 
        System.out.println("Enter the elements") ;
        for(i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
 
        System.out.println("Enter the element to be seached");
        key = sc.nextInt();
        
        for(i=0;i<size;i++)
        {
            if(a[i] == key) 
            {
                System.out.println("position of "+key+" is: "+(i+1)+" ");
                break;
            }
            
        }
	}

}
