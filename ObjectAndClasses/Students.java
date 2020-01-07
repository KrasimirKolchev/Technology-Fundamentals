package P_ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Students(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        List<Students> student = new ArrayList<>();

        while (!command.equals("end")) {

            String[] input = command.split(" ");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String homeTown = input[3];

            Students students = new Students(firstName, lastName, age, homeTown);

            student.add(students);

            command = scanner.nextLine();
        }

        String filterHomeTown = scanner.nextLine();

        for (Students students : student) {
            if (students.getHomeTown().equals(filterHomeTown)) {
                System.out.printf("%s %s is %d years old%n",
                        students.getFirstName(), students.getLastName(), students.getAge());
            }
        }
    }

}
