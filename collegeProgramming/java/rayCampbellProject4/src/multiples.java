import java.util.Scanner;
public class multiples {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);//calling a scanner

        while(true){
            //while loop for inputting and returning whether the second number is a multiple of the first


            System.out.print("Enter your first number: ");


            int n1 = sc.nextInt();//assigning value to the first number

            System.out.print("Enter your second number: ");

            int n2 = sc.nextInt();//assiging value to the second number

            if(isMultiple(n1, n2))//if statement to use the isMultiple method

                System.out.printf("%d is multiple of %d\n",n2,n1);//this statement prints if the isMultiple method returns true

            else

                System.out.printf("%d is not multiple of %d\n",n2, n1);//this statement prints if the isMultiple method returns false

            System.out.print("Would you like to enter another pair? [y/n]: ");//asking the user if they would like to input another pair of numbers

            char i = sc.next().charAt(0);//assigns user input to the variable

            if('y' != Character.toLowerCase(i))//if the variable does not equal "y" the while loop breaks

                break;//the loop continues and does not break if the variable equals "y"
        }

    }

    public static boolean isMultiple (int n1, int n2){//method to determine if the second number is a multiple of the first

        if(n1%n2 == 0)//using the remainder operator to determine if the second number is a multiple of the first

            return true;//the method returns a value of "true" if the second number is a multiple of the first

        else

            return false;//the method returns a value of "false" if the second number is not a multiple of the first
    }
}
