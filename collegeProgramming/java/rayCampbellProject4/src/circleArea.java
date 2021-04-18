import java.util.Scanner;
public class circleArea{

    public static void main(String[] args){

        double radius;
        double circle;

        Scanner scan = new Scanner(System.in);//calling a scanner

        System.out.print("Please enter the radius of your circle: ");//asking for input of circles radius

        radius = scan.nextDouble();//assigning the radius variable with the input from the user
        circle = solution(radius);//assigning the circle variable with the solution method return

        System.out.printf("The area of your circle is: %f", circle);
    }

    public static double solution(double i){//method for calculating the area of a circle

        return i * i * Math.PI; //using the Math.PI constant and the radius squared to calculate the area of the circle
    }
}
