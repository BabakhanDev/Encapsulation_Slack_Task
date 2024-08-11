import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//     todo   Task Student:
//      1  Майн класста 20 стунденттин обектисин тузуп, маанилерин толтурунуз.
//               Праметирине студенттердин массивин алган эки метод тузунуз.
//      2  Биринчи метод 2000-жылдaн кийин торолгон студенттерди кайтарсын,
//      3  экинчи метод 2000-жылга чейин торолгон студенттерди кайтарсын
//      4  Параметирине стринг тибинде ат алып ошол аттагы студенттерди кайтарган метод туз
//      5  Праметирине студенттердин массивин алган эки метод тузунуз.
//                Биринчи метод эн жашы кичине студентти кайтарсын.
//      6  Экинчи метод эн жашы чон студентти кайтарсын.
//      7          Бардык студенттердин жаштарын кайтарган метод тузунуз.
//      8          Параметирине курстун атын алып ошол курста окуган бардык студенттерди
//        кайтарган метод туз.
//      9          Параметирине соз алып. Ошол создон же тамгадан башталган аттагы студенттерди
//        кайтарган метод тузунуз.
//      10  removeStudentsBetweenDates(Student[]students, LocalDate startDate, LocalDate endDate);
//        деген метод тузyнуз.Ошол жылдардын арасында торолгон бардык
//        студенттерди очуруп калган студенттерди кайтарган метод тузунуз

        //      todo 1  Майн класста 20 стунденттин обектисин тузуп, маанилерин толтурунуз.
        Student student1 = new Student("Bekbolsun", "Asan", LocalDate.of(1995, 1, 1), "Disain");
        Student student2 = new Student("Almaz", "Tursun", LocalDate.of(1996, 2, 15), "Informatika");
        Student student3 = new Student("Aida", "Sydyk", LocalDate.of(1997, 3, 10), "Matematika");
        Student student4 = new Student("Ermek", "Akylbek", LocalDate.of(1998, 4, 5), "Fizika");
        Student student5 = new Student("Aida", "Samat", LocalDate.of(1999, 5, 20), "Himiya");
        Student student6 = new Student("Dana", "Azat", LocalDate.of(2000, 6, 30), "Biologiya");
        Student student7 = new Student("Erjan", "Bolot", LocalDate.of(2001, 7, 25), "Istoriya");
        Student student8 = new Student("Aida", "Marat", LocalDate.of(2002, 8, 12), "Geografiya");
        Student student9 = new Student("Maksat", "Kairat", LocalDate.of(2003, 9, 9), "Ekonomika");
        Student student10 = new Student("Nurlan", "Aibek", LocalDate.of(2004, 10, 18), "Informatika");
        Student student11 = new Student("Samat", "Samat", LocalDate.of(2005, 11, 22), "Arhitektura");
        Student student12 = new Student("Adil", "Erkin", LocalDate.of(1995, 12, 1), "Marketing");
        Student student13 = new Student("Zarina", "Zhan", LocalDate.of(1996, 1, 29), "Jurnalistika");
        Student student14 = new Student("Mirlan", "Talgat", LocalDate.of(1997, 2, 14), "Pedagogika");
        Student student15 = new Student("Altynai", "Bakyt", LocalDate.of(1998, 3, 3), "Psihologiya");
        Student student16 = new Student("Azamat", "Aidyn", LocalDate.of(1999, 4, 8), "Sotsiologiya");
        Student student17 = new Student("Bakyt", "Azamat", LocalDate.of(2000, 5, 17), "Injeneriya");
        Student student18 = new Student("Zhanna", "Ruslan", LocalDate.of(2001, 6, 7), "Informatika");
        Student student19 = new Student("Erbol", "Rysbek", LocalDate.of(2002, 7, 21), "Filosofiya");
        Student student20 = new Student("Nurgul", "Bolot", LocalDate.of(2003, 8, 15), "Menegment");


        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15,
                student16, student17, student18, student19, student20};

//       todo 2 Биринчи метод 2000-жылдaн кийин торолгон студенттерди кайтарсын,
        System.err.println("Биринчи метод 2000-жылдaн кийин торолгон студенттерди кайтарсын");
        getStudBornAfter2000(students);


        //        todo 3  экинчи метод 2000-жылга чейин торолгон студенттерди кайтарсын
        System.out.println(" ");
        System.out.println("   Экинчи метод 2000-жылга чейин торолгон студенттерди кайтарсын");
        System.out.println(" ");
        getStudBornBefore2000(students);

//       todo 4 Параметирине стринг тибинде ат алып ошол аттагы студенттерди кайтарган метод туз
        System.out.println(" ");
        System.out.println("  Параметирине стринг тибинде ат алып ошол аттагы студенттерди кайтарган метод туз");
        System.out.println(" ");
        Student[] studentsNamedAida = getStudentsByFirstName(students, "Aida");

        // Вывод студентов с указанным именем
        for (Student student : studentsNamedAida) {
            System.out.println(student.toString());
        }

//       todo 5 Праметирине студенттердин массивин алган эки метод тузунуз.
//                Биринчи метод эн жашы кичине студентти кайтарсын.
        System.out.println(" ");
        System.out.println("     Праметирине студенттердин массивин алган эки метод тузунуз.\n" +
                "      Биринчи метод эн жашы Чон студентти кайтарсын.");
        System.out.println(" ");

        Student oldStudent = getOldStudent(students);
        if (oldStudent != null) {
            System.out.println("Самый старший студент: " + oldStudent.toString());
        } else {
            System.out.println("Нет студентов в массиве.");
        }

//       todo 6 Экинчи метод эн жашы кичине студентти кайтарсын.
        System.out.println(" ");
        System.out.println("      Экинчи метод эн жашы кичине студентти кайтарсын.");
        System.out.println(" ");
        Student youngestStudent = getYoungestStudent(students);
        if (youngestStudent != null) {
            System.out.println("Самый младший студент: " + youngestStudent.toString());
        } else {
            System.out.println("Нет студентов в массиве.");
        }

        //todo 7  Бардык студенттердин жаштарын кайтарган метод тузунуз.
        System.out.println(" ");
        System.out.println("     Бардык студенттердин жаштарын кайтарган метод тузунуз.");
        int[] allAges = Student.getAllAges(students);

        for (int age : allAges) {
            System.out.print(age + " , ");
        }
        System.out.println(" ");

//      todo 8 Параметирине курстун атын алып ошол курста окуган бардык студенттерди
//        кайтарган метод туз.

        Student[] courArray = getStudentsByCourse(students, "Informatika");
        System.out.println(" ");
        System.out.println("      Параметирине курстун атын алып ошол курста окуган бардык студенттерди\n" +
                "                          кайтарган метод туз. ");

        // Вывод студентов с указанным именем Course
        for (Student student : courArray) {
            System.out.println(student.toString());
        }
//        todo 9    Параметирине соз алып. Ошол создон же тамгадан башталган аттагы студенттерди
//                          кайтарган метод тузунуз.
        Student[] wordArray = getNameByWord(students, "bol");
        System.out.println(" ");
        System.out.println("    Параметирине соз алып. Ошол создон же тамгадан башталган аттагы студенттерди\n" +
                "                       кайтарган метод тузунуз. ");
        for (Student student : wordArray) {
            System.out.println(student.toString());
        }

//    Todo. 10  removeStudentsBetweenDates(Student[]students, LocalDate startDate, LocalDate endDate);
//               деген метод тузyнуз.Ошол жылдардын арасында торолгон бардык
//               студенттерди очуруп калган студенттерди кайтарган метод тузунуз

        LocalDate startDate = LocalDate.of(1996, 2, 15);
        LocalDate endDate = LocalDate.of( 2004, 10, 18);

        Student[] remainingStudents = removeStudentsBetweenDates(students, startDate, endDate);
        System.out.println(" ");
        System.out.println("  LocalDate startDate, LocalDate endDate .  Ошол жылдардын арасында торолгон бардык\n" +
                "          студенттерди очуруп калган студенттерди кайтарган метод тузунуз");
        System.out.println(" ");
        for (Student student : remainingStudents) {
            System.out.println(student);
        }


    }

    public static Student[] getStudBornAfter2000(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getBirthDate().isAfter(LocalDate.of(2000, 1, 1))) {
                count++;
            }
        }

        Student[] filteredStudents = new Student[count];

        int index = 0;
        for (Student student : students) {
            if (student.getBirthDate().isAfter(LocalDate.of(2000, 1, 1))) {
                filteredStudents[index] = student;
                System.out.println(student.toString());
                index++;
            }
        }

        return filteredStudents;
    }

    public static Student[] getStudBornBefore2000(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getBirthDate().isBefore(LocalDate.of(2000, 1, 1))) {
                count++;
            }
        }

        Student[] filteredStudents = new Student[count];

        int index = 0;
        for (Student student : students) {
            if (student.getBirthDate().isBefore(LocalDate.of(2000, 1, 1))) {
                filteredStudents[index] = student;
                System.out.println(student.toString());
                index++;
            }
        }

        return filteredStudents;
    }

    public static Student[] getStudentsByFirstName(Student[] students, String name) {
        // Считаем количество студентов с указанным именем
        int count = 0;
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(name)) {
                count++;
            }
        }

        // Создаем массив нужного размера
        Student[] filteredStudents = new Student[count];

        // Заполняем массив студентами с указанным именем
        int index = 0;
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(name)) {
                filteredStudents[index] = student;
                index++;
            }
        }

        return filteredStudents;
    }


    // Метод, который возвращает самого младшего студента
    public static Student getYoungestStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return null; // Если массив пуст или null, возвращаем null
        }

        Student youngest = students[0];

        // Ищем самого младшего студента
        for (Student student : students) {
            if (student.getBirthDate().isAfter(youngest.getBirthDate())) {
                youngest = student;
            }
        }
        return youngest;
    }

    public static Student getOldStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return null; // Если массив пуст или null, возвращаем null
        }

        // Предполагаем, что первый студент - самый старший
        Student old = students[0];

        // Ищем самого старшего студента
        for (Student student : students) {
            if (student.getBirthDate().isBefore(old.getBirthDate())) {
                old = student;
            }
        }
        return old;
    }

    public static Student[] getStudentsByCourse(Student[] students, String course) {
        int count = 0;
        for (Student student : students) {
            if (student.getCourse().equalsIgnoreCase(course)) {
                count++;
            }
        }

        // Создаем массив нужного размера
        Student[] filtStudents = new Student[count];

        // Заполняем массив студентами с указанным курсом
        int index = 0;
        for (Student student : students) {
            if (student.getCourse().equalsIgnoreCase(course)) {
                filtStudents[index] = student;
                index++;
            }
        }
        return filtStudents;
    }

    public static Student[] getNameByWord(Student[] students, String word) {
        int count = 0;
        for (Student student : students) {
            if (student.getFirstName().contains(word)) {
                count++;
            }
        }

        // Создаем массив нужного размера
        Student[] filtStud = new Student[count];

        // Заполняем массив студентами с указанным курсом
        int index = 0;
        for (Student student : students) {
            if (student.getFirstName().contains(word)) {
                filtStud[index] = student;
                index++;
            }
        }
        return filtStud;
    }

    public static Student[] removeStudentsBetweenDates (Student[] students, LocalDate startDate, LocalDate endDate) {
        int count = 0;
        for (Student student : students) {
            if (student.getBirthDate().isBefore(startDate) || student.getBirthDate().isAfter(endDate)) {
                count++;
            }
        }

        Student[] arrayStud = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.getBirthDate().isBefore(startDate) || student.getBirthDate().isAfter(endDate)) {
                arrayStud[index++] = student;
            }
        }

        return arrayStud;

    }


}


















