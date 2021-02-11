import java.util.Scanner;
public class lab2_23{
	public static void main(String[] args){
 
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter the number of rows");
      int r = sc.nextInt();

      System.out.println("Enter the number of columns");
      int col = sc.nextInt();

      int A[][] = new int[r][col];
      int B[][]=new int[r][col];
      int C[][] = new int[r][col];


       for(int i=0 ; i<r ; ++ i){
       	 for(int j= 0 ; j<col ; ++j){
       	 	System.out.println("Enter the "+ (i+1)+ "," + (j+1) + " element of matrix A :");
       	 	A[i][j]=sc.nextInt();
       	 }
       }

       for(int i=0 ; i<r ; ++ i){
       	 for(int j= 0 ; j<col ; ++j){
       	 	System.out.println("Enter the "+ (i+1)+ "," + (j+1) + " element of matrix B :");
       	 	B[i][j]=sc.nextInt();
       	 }
       }

       for(int i=0 ; i<r ; ++ i){
       	 for(int j= 0 ; j<col ; ++j){
       	 	C[i][j]=A[i][j] + B[i][j];
          }
        }


        System.out.println("\n Resultant Matrix is :");

        for(int i=0 ; i<r ; ++ i){
       	 for(int j= 0 ; j<col ; ++j){
       	 	System.out.print(C[i][j] + " ");
       	 }
         System.out.println();
       }

	}
}
