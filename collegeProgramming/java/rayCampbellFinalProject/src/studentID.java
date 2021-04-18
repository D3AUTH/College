import javax.swing.JOptionPane;

public class studentID {

    public static void main(String[] args) {

        String[] id = new String[]{"1616","2424","1235","1805", "8856","0168","1478","3698","7783","2589"};//array for student ID's
        String[] names = new String[]{"Bob", "Suzy", "Jeff", "Andrew", "Rob", "Jenny", "Sally", "John", "Richard", "Lacey"};//array for student names
        double[] average = new double[]{88.6, 98.4, 84.3, 89.2, 90.5, 79.9, 65.8, 98.6, 78.2, 80.3};//array for student grades
        String sID=null;

        while((sID=JOptionPane.showInputDialog(null, "Enter a 4 Digit Student ID")) != null){//message box that allows for student ID input
            boolean found = false;

            for(int i=0; i<id.length; i++){
                if(sID.equals(id[i])){//checking if the inputted student ID matches an ID from the array
                    //displays the parallel name / grade from the array
                    JOptionPane.showMessageDialog (null, "Student Name: " + names[i] + ", Average Grade: " + average[i], "Raymond Campbell Final Project: Student ID", JOptionPane.INFORMATION_MESSAGE);
                    found = true;
                    break;
                }
            }

            if(! found){
                //if no student was found with the inputted ID then this message is displayed
                JOptionPane.showMessageDialog (null, "No student with that ID was found.", "Raymond Campbell Final Project: Student Not Found", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
