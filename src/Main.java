import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Integer> list2 = list.stream().
                filter(x -> x % 2 == 0).
                map(x -> x * x).
                toList();
        System.out.println(list2);

        //2
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("python");
        words.add("kotlin");
        words.add("java");
        words.add("c#");
        List<String> sozler = words.stream().
                filter(x -> x.length() > 3).distinct().
                sorted((x1, x2) -> x2.length() - x1.length())
                .limit(3)
                .toList();
        System.out.println(sozler);

        //3
        List<Employee> employees = List.of(
                new Employee(1, "Ali", "IT", 2500, 28),
                new Employee(2, "Aysel", "HR", 1800, 32),
                new Employee(3, "Vali", "IT", 3000, 35),
                new Employee(4, "Nigar", "Finance", 2200, 25)
        );


        //5
        List<String> emails = List.of(
                "Ali@gmail.com",
                "AYSel@yahoo.com",
                "ali@gmail.com",
                "Nigar@gmail.com",
                "VALI@GMAIL.COM"
        );

        long count = emails.stream()
                .map(String::toLowerCase)
                .filter(email -> email.endsWith("@gmail.com"))
                .distinct()
                .count();

        System.out.println(count);

        //6
        List<String> students = List.of("Aysel", "Orxan", "Leyla");
        students.stream()
                .map(n -> "Student: " + n)
                .forEach(System.out::println);


        //7
        List<Integer> numbers = List.of(1, 5, 12, 8, 15, 20);
        numbers.stream()
                .filter(n -> n > 10)
                .forEach(n -> System.out.println("Number: " + n));
        System.out.println(numbers);

        //8
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Math", 95);
        grades.put("Java", 100);
        grades.put("Physics", 91);
        grades.put("English", 88);
        grades.forEach((key, value) ->
                System.out.println(key + " -> " + value));


    }
}