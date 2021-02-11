import java.util.Scanner;
public class lab2_1{
	static void Bubble_Asc(int arr[]){
		for(int i=1; i<arr.length ; ++i){
			for(int j = arr.length-1 ; j>=i ; --j){
				if(arr[j-1]> arr[j]){
					int t= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
			}
		}
	}

	static void Bubble_Dsc(int arr[]){
		for(int i=1; i<arr.length ; ++i){
			for(int j = arr.length-1 ; j>=i ; --j){
				if(arr[j-1]<arr[j]){
					int t= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
			}
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		  for(int i =0; i < n ; ++ i){
		  	 System.out.println("Enter the element " + (i+1));
		  	 a[i] = sc.nextInt();
		  }

		  Bubble_Asc(a);
		  System.out.println("The elements sorted in ascending order are ");


		  for(int i=0;i<n; ++i){
		  	System.out.println(a[i]);
		  }

		  System.out.println("The elements sorted in descending order are ");

		  Bubble_Dsc(a);


		  for(int i=0;i<n; ++i){
		  	System.out.println(a[i]);
		  }

	}
	
}

