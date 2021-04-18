import java.util.Scanner;//calling a scanner
public class salary {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        salary myS = new salary();
        int employeeCounter = 1;
        int employeeNum = 1;

        do{//looping for all 3 employees
            System.out.print("Please input the hours worked: ");
            double hours = input.nextDouble();
            System.out.print("Please input the hourly rate: ");
            double rate = input.nextDouble();
            System.out.printf("The pay for employee %d is: $%.2f\n", employeeNum, myS.calculation(hours, rate));//calculates and output for the employees pay
            employeeNum++;//adds to the employee number
            employeeCounter++;//adds to the primary counter
        }
        while (employeeCounter <= 3);//counter for 3 employees, the loop ends once three have been inputted
    }
    public double calculation(double hoursWorked, double hourlyRate){//class for calculating salary
        double totalPay;
        if (hoursWorked <=40)
        {
            totalPay = hoursWorked*hourlyRate;
        }
        else
        {
            double half  = hoursWorked/2;
            totalPay = (hoursWorked + half) * hourlyRate;
        }
        return totalPay;
    }
}
