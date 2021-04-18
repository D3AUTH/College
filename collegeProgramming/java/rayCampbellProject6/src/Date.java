public class Date {
    //private values for the month day and year
    private static int month;
    private static int day;
    private static int year;

    public Date(int month, int day, int year){//assigning the values for the Date class
        month=month;
        day=day;
        year=year;
    }
    public static void displayName(){//displays name and assignment number
        System.out.println("Raymond Campbell Assignment 6 Date");
    }

    public static void setMonth(int m){//sets the value range of the month
        if(m>=0 && m<=12)
            month=m;
        else{
            month=0;
        }
    }

    public int getMonth(){//returns the value of the month to the get call
        return month;
    }

    public static void setDay(int d){//sets the value range of the day
        if(d>=0 && d<=30)
            day=d;
        else{
            day=0;
        }
    }

    public int getDay(){//returns the value of the day to the get call
        return day;
    }

    public void setYear(int y){//sets the value of the year
        year=y;
    }

    public int getYear(){//returns the value of the year to the get call
        return year;
    }

    public void displayDate(){//method for configuring the format of the inputted values
        System.out.printf("%d/%d/%d\n",getMonth(),getDay(),getYear());
    }
}
