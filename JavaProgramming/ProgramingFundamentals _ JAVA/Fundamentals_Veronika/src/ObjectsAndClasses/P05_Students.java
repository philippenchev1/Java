package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student (String firstName, String lastName, String age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String town = inputArr[3];

            Student currentStudent = new Student(firstName,lastName,age,town);
            studentsList.add(currentStudent);

            input = scanner.nextLine();
        }

        String homeTown = scanner.nextLine();
        for (Student student : studentsList){
            if (homeTown.equals(student.getTown())){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }

    }
}
