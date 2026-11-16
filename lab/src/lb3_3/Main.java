package lb3_3;

import java.time.LocalDateTime; // <-- Вот этот импорт обязателен для работы со временем
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Тест с Integer
        Sorting<Integer> sorter = new GenericInsertionSort<>();
        List<Integer> numbers = new ArrayList<>(List.of(45, 12, 89, 3, 24));
        System.out.println("До сортировки (Integer): " + numbers);
        sorter.sort(numbers);
        System.out.println("После сортировки (Integer): " + numbers);

        System.out.println("-----------------------------------");

        // 2. Тест со String
        Sorting<String> stringSorter = new GenericInsertionSort<>();
        List<String> words = new ArrayList<>(List.of("Java", "Python", "C++", "Ada", "Ruby"));
        System.out.println("До сортировки (String): " + words);
        stringSorter.sort(words);
        System.out.println("После сортировки (String): " + words);

        System.out.println("-----------------------------------");

        // 3. Тест с LocalDateTime
        Sorting<LocalDateTime> timeSorter = new GenericInsertionSort<>();
        List<LocalDateTime> times = new ArrayList<>(List.of(
                LocalDateTime.of(2026, 10, 15, 14, 30),
                LocalDateTime.of(2023, 1, 1, 10, 0),
                LocalDateTime.of(2026, 10, 15, 9, 15)
        ));

        System.out.println("До сортировки (LocalDateTime): " + times);
        timeSorter.sort(times);
        System.out.println("После сортировки (LocalDateTime): " + times);

        System.out.println("-----------------------------------");

        // 4. Тест с классом Student[span_0](start_span)[span_0](end_span)
        Sorting<Student> studentSorter = new GenericInsertionSort<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", 20));
        students.add(new Student("Анна", 19));
        students.add(new Student("Иван", 18));

        System.out.println("До сортировки (Student):");
        for (Student s : students) {
            System.out.println(s.getName() + " (" + s.getAge() + " лет)");
        }

        studentSorter.sort(students);

        System.out.println("\nПосле сортировки (Student):");
        for (Student s : students) {
            System.out.println(s.getName() + " (" + s.getAge() + " лет)");
        }
    }
}