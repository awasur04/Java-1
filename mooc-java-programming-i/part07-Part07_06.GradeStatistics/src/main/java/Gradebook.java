import java.util.ArrayList;
import java.util.Arrays;

public class Gradebook {
    private ArrayList<Integer> grades;

    public Gradebook() {
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
        if (grade > 0 && grade < 101) {
            this.grades.add(grade);
        }
    }
    public double getAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for (int grade : grades) {
            totalSum += grade;
            totalCount++;
        }
        return (double)totalSum / totalCount;
    }

    public String getPassingAverage() {
        int totalSum = 0;
        int totalCount = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                totalSum += grade;
                totalCount++;
            }
        }
        if (totalCount < 1) {
            return "-";
        }
        return String.valueOf((double)totalSum / totalCount);
    }

    public double getPassPercentage() {
        int totalPass = 0;
        int totalCount = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                totalPass++;
            }
            totalCount++;
        }
        return (100 * ((double)totalPass / totalCount));
    }

    public void printDistribution() {
        int[] grades = {0,0,0,0,0,0};
        int gradePoint = 5;
        System.out.println("Grade distribution:");
        for (int grade : this.grades) {
            if (grade >= 90) {
                grades[0]++;
                continue;
            } else if (grade < 90 && grade >= 80) {
                grades[1]++;
                continue;
            } else if (grade < 80 && grade >= 70) {
                grades[2]++;
                continue;
            } else if (grade < 70 && grade >= 60) {
                grades[3]++;
                continue;
            } else if (grade < 60 && grade >= 50) {
                grades[4]++;
                continue;
            } else {
                grades[5]++;
                continue;
            }
        }
        for (int j = 0; j < grades.length; j++) {
            String stars = "";
            for (int i = 0; i < grades[j]; i++) {
                stars = stars.concat("*");
            }
            System.out.println(gradePoint + ": " + stars);
            gradePoint--;
        }
    }
}
