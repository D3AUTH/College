import java.util.Random;
import java.util.Scanner;
public class cai{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//calling a scanner
        int solution, ans;
        String option;

        do{
            solution = qAndA();//assigning the solution variable with the return of the qAndA method

            do{
                System.out.print("\nYour answer: ");
                ans = sc.nextInt();//takes user input to the question

                if (ans == solution){//checks user answer against the solution
                    System.out.println("Very Good! ");//if the answer is correct it outputs this statement
                }

                else{
                    System.out.print("No. Please try again.");//if the answer is wrong it moves to this statement
                }

            } while
            (ans != solution);//repeates loop until the correct answer is given
            System.out.print("Would you like to try again? [yes or no]: ");
            option = sc.next();//taking input for continuing with the loop

        } while
        (option.equalsIgnoreCase("yes"));//compares input in option against "yes" without case sensitivity. The loop breaks if it does not equal "yes" and continues if it does equal "yes"
    }

    public static int qAndA(){//method for generating random numbers
        Random rand = new Random();//generating random single digit numbers
        int i, n;

        i = rand.nextInt(10);//generates new random integer below 10
        n = rand.nextInt(10);

        System.out.printf("How much is %d times %d?", i, n);

        return i * n;//returning randomly generated numbers and the solution

    }

}
