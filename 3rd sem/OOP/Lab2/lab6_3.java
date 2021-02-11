import java.util.Scanner;

abstract class Figure{
    int dim1;
    int dim2;
    abstract double area(int dim1, int dim2);
}

class Rectangle extends Figure{
    double area(int dim1,int dim2){
        return dim1*dim2;
    }
}

class Square extends Figure{
    double area(int dim1,int dim2){
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    double area(int dim1, int dim2){
        return 0.5*dim1*dim2;
    }
}

public class lab6_3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        Square sq = new Square();
        Triangle trig = new Triangle();
        Figure fig;
        fig = rect;
        int dim1,dim2;
        System.out.println("Enter length and breadth");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
        System.out.println("Rectangle area ="+fig.area(dim1, dim2));
    }
    

}