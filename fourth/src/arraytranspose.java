import java.util.*;
public class arraytranspose {
	 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the size of array:");
	 int row=sc.nextInt();
	 int col=sc.nextInt();
	 int arr[][]=new int[row][col];
     System.out.println("enter the array elements:");
     for(int i=0;i<row;i++) {
    	 for(int j=0;j<col;j++) {
    		 arr[i][j]=sc.nextInt();
    	 }
     }
     for(int i=0;i<row;i++) {
    	 for(int j=0;j<col;j++) {
    		 System.out.print(arr[j][i]+" ");
    	 }
    	 System.out.println();
     }
}
}