import java.util.Scanner;

public class testRectangle {//test for the Rectangle class

    public static void main(String[] args) throws IllegalArgumentException {//Try Catch Illegal Argument Exception to ensure the user inputs one of the option numbers
        double num;//value for the length and width
        int choose;//value for the switch statements
        Scanner input = new Scanner(System.in);//creating scanner for user input
        Rectangle r = new Rectangle();

        while (true) {//while loop for selecting multiple switch statements
            menu();//displays menu
            choose = choice();//referencing choice method for choosing the switch statement
            try {
                switch (choose) {
                    case 1://case for length of rectangle
                        System.out.println("Enter the length of the rectangle: ");
                        num = input.nextDouble();//receives the value of length from the user
                        try {
                            r.setLength(num);//sets the value of the length for the rectangle
                        } catch (IllegalArgumentException e) {//looks for incorrect input
                            System.out.println(e.getMessage());//prints error message in case of incorrect input
                        }
                        break;

                    case 2://case for width of rectangle
                        System.out.println("Enter the width of the rectangle");
                        num = input.nextDouble();//receives the value of width from the user
                        try {
                            r.setWidth(num);//sets the value of the width for the rectangle
                        } catch (IllegalArgumentException e) {//looks for incorrect input
                            System.out.println(e.getMessage());//prints error message in case of incorrect input
                        }
                        break;

                    case 3://case for printing the area and perimeter of rectangle
                        System.out.println("The area of the rectangle is: " + r.getArea() + " and the perimeter is: " + r.getPerimeter());//printing the answers of the area and perimeter methods
                        break;

                    case 4://case for exiting the program
                        System.exit(0);
                    default://error message for incorrect input when selecting switch statement
                        System.out.println("Error! Please choose a number between 1 and 4");
                }
            } catch (Exception e) {//Error message for incorrect input when assigning value to length or width
                System.out.println("Error! Please input a number between 0.0 and 20.0!");
            }
        }
    }

    public static void menu() {//menu for selecting input or viewing the answer
        System.out.println("Raymond Campbell Assignment 7 Rectangle");
        System.out.println("1. Set Length");
        System.out.println("2. Set Width");
        System.out.println("3. Get Area and Perimeter");
        System.out.println("4. Exit");
    }

    public static int choice() {//method for choosing switch statement

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Choice: ");
            return scan.nextInt();//assigns the selected number to the correct switch statement
        }
        catch (Exception e) {//returns default error
            return 0;
        }

    }

}