package chap_09;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        // Arraylist 를 활용해서 Student 클래스를 만들어 자바 자격증을 가진 학생을 출력해라
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("유재석", "파이썬"));
        studentList.add(new Student("박명수", "자바"));
        studentList.add(new Student("김종국", "자바"));
        studentList.add(new Student("조세호", "C"));
        studentList.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("--------------------");

        for (Student s: studentList) {
            if (s.certification == "자바") { // s.certification.equals("자바"); 로도 할 수 있음 true, false로 값 반환
                System.out.println(s.name);
            }
        }
    }
}

class Student {
    String name;
    String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}