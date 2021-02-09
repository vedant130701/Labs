import java.util.Scanner;
public class lab1{
	static boolean isPrime(int n){
		int fact=0;
		for(int i=2 ; i< n ; ++i){
			if(n%i == 0)
				fact=fact+1;
		}

		if(fact !=0)
			return false;
		else
			return true;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("\n The first " + n +" prime numbers are");

		int count=1;

		  for(int i=2 ; count<=n ; ++i){
		  	 if(isPrime(i)){
		  	 	System.out.println(i);
		  	 	count=count+1;
		  	  }

		  }
	}
}
