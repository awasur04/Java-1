import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String tvName = scanner.nextLine();
            if (tvName.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int tvDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(tvName, tvDuration));
        }
        System.out.println("Program's maximum duration? ");
        int input = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= input) {
                System.out.println(program);
            }
        }
    }
}
