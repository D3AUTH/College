import java.util.Scanner;
public class DateTest {
    public static void main(String args[]){

        Date date=new Date(0,0,0);

        Scanner input=new Scanner(System.in);

        date.displayName();//gets displayName to show the name and assignment number

        System.out.println("Please enter the month: ");//receives input from user for the value of the month
        int month=input.nextInt();
        date.setMonth(month);//gets the value of the month

        System.out.println("Please enter the day: ");//receives input from the user for the value of the day
        int day=input.nextInt();
        date.setDay(day);//gets the value of the day

        System.out.println("Please enter the year: ");//receives input from the user for the value of the year
        int year=input.nextInt();
        date.setYear(year);//gets the value of the year

        date.displayDate();//gets the formatted date
    }
}
