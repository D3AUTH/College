import java.util.Scanner;

public class enumDays{

    public enum Days{//enumerating the days of the week
        MONDAY(0),TUESDAY(1),WEDNESDAY(2),THURSDAY(3),FRIDAY(4),SATURDAY(5),SUNDAY(6);

        private int value;

        private Days(int val)//initializing the value
        {
            this.value=val;
        }
    }
    //array for business hours
    static String[] hours = {"8am - 6pm", "9am - 5pm", "8am - 4pm", "10am - 1pm", "8am-10am", "8am - 9pm","12pm - 6pm"};

    public static void main(String args[]) {//main method for printing and accepting input
        System.out.println("Raymond Campbell Final Project Part 2");
        for(Days d:Days.values())
        {
            System.out.println(d);//printing days
        }

        System.out.println("Enter Day Of Week To See Business Hours: ");//asking for the day
        Scanner s=new Scanner(System.in);//scanner to take user input

        String day=s.nextLine();
        day=day.toUpperCase();

        Days d=Days.valueOf(day);//getting enum for inputted day

        System.out.println("The Business Hours on "+d+" are from "+hours[d.value]+"");//printing the hours for the chosen day
    }
}