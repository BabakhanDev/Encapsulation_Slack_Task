import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String courses;


    public Student(String name, String surname, LocalDate dateOfBirth, String courses) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
    }

    public LocalDate getBirthDate() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public static int[] getAllAges(Student[] students) {
        int[] allAges = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            allAges[i] = students[i].getAge();
        }
        return allAges;

    }

    public String getCourse() {
        return courses;
    }


    public String toString() {
        return
                "firstName='" + name + '\'' +
                        ", lastName='" + surname + '\'' +
                        ", birthDate=" + dateOfBirth +
                        ", courses='" + courses + '\'';
    }
}