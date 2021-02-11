class Complex{
	int a;
	int b;

    Complex(){
    	//default constructor 
    	a=0;
    	b=0;
    }

    Complex(int A , int B){
    	//parametrized Constructor 
    	a=A;
    	b=B;
    }

	void Assign(int A , int B){
		this.a =A;
		this.b= B;
	}


	void display(){
		System.out.println("The complex number is ");
		System.out.println(a+"+i("+ b + ")");
	}

	Complex Add (Complex c1 , Complex c2){
		Complex c3 = new Complex();
		c3.a = c1.a + c2.a ;
		c3.b= c1.b + c2.b;
		return c3;
	}
	
	Complex Subtract(Complex c1, Complex c2){
		Complex c3 = new Complex();
		c3.a = c1.a - c2.a ;
		c3.b= c1.b - c2.b ;
		//.a = Math.abd(c3.a);
		//.b= Math.abs(c3.b);
		return c3;

	}
}

class lab3_1{
	public static void main(String args[]){
		Complex c = new Complex();
		c.Assign(5,4);
		Complex c1 = new Complex();
		c1.Assign(6,2);
		Complex c2 = new Complex();
		c2.Assign(5,4);

		c = c1.Add(c1,c2);
		 System.out.println("Sum is");
		 c.display();
		c=c1.Subtract(c1,c2);
		System.out.println("Differnce is ");
		c.display();
		

	   Complex c4 = new Complex();
	   c4.display();

	   Complex c5 = new Complex(6,7);
	   c5.display();


	}
}

