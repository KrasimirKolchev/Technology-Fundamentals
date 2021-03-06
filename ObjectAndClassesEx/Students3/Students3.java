package Q_ObjectAndClassesEx.Students3;

public class Students3 {
    private String firstName;
    private String lastName;
    private double grade;

    public Students3(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.getFirstName(), this.getLastName(), this.getGrade());
    }
}
