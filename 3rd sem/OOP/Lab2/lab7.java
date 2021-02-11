import java.util.Scanner;
interface Series{
	int getNext();
	void reset();
	void setStart(int a);
}

class ByTwos implements Series{
	int a;
	public int getNext(){
		int temp = a;
		a = a+2;
		return temp;
	}

	public void reset(){
		a=0;
	}

	public void setStart(int starter){
		a = starter;
	}
}

class lab7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ByTwos bt = new ByTwos();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		bt.reset();
		System.out.println("Enter starting element: ");
		int start = sc.nextInt();
		bt.setStart(start);
		System.out.println("The series is: ");
		for(int i=0;i<n; i++){
			System.out.println(bt.getNext());		
		}
	}
}