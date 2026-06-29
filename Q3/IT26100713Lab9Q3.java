import java.util.Scanner;

public class IT26100713Lab9Q4 {


    public static double calcFinalMark(double assignmentMark, double examPaperMark) {
        return (assignmentMark * 0.30) + (examPaperMark * 0.70);
    }


    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }


    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s %-15.2f %-10s%n", name, finalMark, grade);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names       = new String[5];
        double[] finalMarks  = new double[5];
        String[] grades      = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examPaperMark = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignmentMark, examPaperMark);
            grades[i]     = findGrades(finalMarks[i]);

            System.out.println();
        }


        System.out.printf("%-10s %-15s %-10s%n", "Name", "Final Mark", "Grade");


        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}