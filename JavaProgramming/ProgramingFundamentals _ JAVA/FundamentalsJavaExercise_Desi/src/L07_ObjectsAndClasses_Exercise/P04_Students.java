package L07_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04_Students {
    static class Student{
        private String firstName;
        private String secondName;
        private double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public double getGrade() {
            return this.grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();
            String firstName = data.split("\\s+")[0];
            String secondName = data.split("\\s+")[1];
            double grade =Double.parseDouble(data.split("\\s+")[2]);

                Student student = new Student(firstName,secondName,grade);
                studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList){
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getSecondName(),student.getGrade());
        }
    }
}
