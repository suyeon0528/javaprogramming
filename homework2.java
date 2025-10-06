package java_3week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        final int NUM_STUDENTS = 3;

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String inputLine = scanner.nextLine();
            String[] tokens = inputLine.split("\\s+");

            if (tokens.length >= 4) {
                String studentId = tokens[0];
                String name = tokens[1];
                String major = tokens[2];
                String rawPhoneNumber = tokens[3];

                Student student = new Student();
                student.setStudentId(studentId);
                student.setName(name);
                student.setMajor(major);
                student.setPhoneNumber(rawPhoneNumber);

                students.add(student);

            } else {
                System.out.println("⚠️ 입력 형식이 올바르지 않습니다. 다시 시도해 주세요.");
                i--;
            }
        }

        scanner.close();

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < students.size(); i++) {
            String prefix;
            switch (i) {
                case 0:
                    prefix = "첫번째 학생: ";
                    break;
                case 1:
                    prefix = "두번째 학생: ";
                    break;
                case 2:
                    prefix = "세번째 학생: ";
                    break;
                default:
                    prefix = "학생 " + (i + 1) + ": ";
                    break;
            }
            System.out.println(prefix + students.get(i).toString());
        }
    }
}

class Student {
    private String studentId;
    private String name;
    private String major;
    private String phoneNumber;

    public Student() {
    }

    public Student(String studentId, String name, String major, String rawPhoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        setPhoneNumber(rawPhoneNumber);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(String rawPhoneNumber) {
        String digitsOnly = rawPhoneNumber.replaceAll("[^0-9]", "");

        if (digitsOnly.length() == 10) {
            digitsOnly = "0" + digitsOnly;
        }

        if (digitsOnly.length() == 11 && digitsOnly.startsWith("010")) {
            this.phoneNumber = digitsOnly.replaceFirst("(\\d{3})(\\d{4})(\\d{4})", "$1-$2-$3");
        } else {
            this.phoneNumber = digitsOnly;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", studentId, name, major, phoneNumber);
    }
}