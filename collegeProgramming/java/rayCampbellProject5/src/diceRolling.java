public class diceRolling{

    public static void main(String[] args){

        int ar[]= new int[11];//allowing 11 spaces in memory for the array
        int count=0;//assigning the value of the count

        System.out.println("Raymond Campbell Assignment 5 Dice Rolling");

        for(int i=0;i<36000;i++)//Array for printing the results of rolling the dice 36,000 times
        {
            int sum=randomDice(); //Calling the randomDice method to calculate the sum
            if(sum==2){
                ar[0]++;
            }
            else if(sum==3){
                ar[1]++;
            }
            else if(sum==4){
                ar[2]++;
            }
            else if(sum==5){
                ar[3]++;
            }
            else if(sum==6){
                ar[4]++;
            }
            else if(sum==7){
                ar[5]++;
            }
            else if(sum==8){
                ar[6]++;
            }
            else if(sum==9){
                ar[7]++;
            }
            else if(sum==10){
                ar[8]++;
            }
            else if(sum==11){
                ar[9]++;
            }
            else if(sum==12){
                ar[10]++;
            }
        }
        for(int j=0;j<6;j++)//loop for the table
        {
            for(int k=count;k<6+j;k++)//count loop
            {
                System.out.printf("%d ",ar[k]);//printing sums held by the array
            }
            System.out.println();//after the sums is printed 6 times a new line is printed
            count++;
        }

    }
    public static int randomDice()//method for generating random dice rolls
    {
        int min = 1;//assigning the min value to 1 as that is the lowest number on a die
        int max = 6;//assigning the max value to 6 as that is the highest number on a die

        int d1=(int)(Math.random()*max - min +1) + min; //assigning a random number between 1 and 6 to d1
        int d2=(int)(Math.random()*max - min +1) + min; //assigning a random number between 1 and 6 to d2
        int sum= d1 + d2; //Adding the random numbers of both the dice
        return sum;//returning the sum of the two dice to the array
    }
}
