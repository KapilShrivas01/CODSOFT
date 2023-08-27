import java.util.Scanner;

public class Student_grade_calculator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        // To store the values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

        float total_marks;
        float average;
        float average_percentage;
        char grade;

        // Calculate total marks and average percentage
        total_marks = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total_marks / 5.0);
        average_percentage = (float)((total_marks / 500.0) * 100);

        // It will calculate the Grade
        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else
            grade = 'E';

        // It will produce the final output
        System.out.println("\n Total marks = " + total_marks + "/500.0");
        System.out.println("Average Percentage = " + average_percentage + "%");
        System.out.println(" Grade = '" + grade + "'");
    }
}