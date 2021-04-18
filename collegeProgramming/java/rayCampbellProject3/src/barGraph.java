import java.util.Scanner;
public class barGraph {
    public static void main(String[] args) {//main class for receiving user input
        Scanner input = new Scanner(System.in);
        barGraph graph = new barGraph();
        int num[] = new int[5];
        System.out.println("Raymond Campbell Assignment 3 Bar Graph");
        for (int i=0; i<5;i++) {//assigning values for the graph
            System.out.print("Please enter a number between 1 and 30: ");
            num[i] = input.nextInt();
        }
        graph.asterisks(num);//calling asterisks class
        }
        public static void asterisks(int num[]){//class for graphing asterisks
            for(int i=0; i<num.length; i++){

                for(int n=1;n<=num[i];n++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
