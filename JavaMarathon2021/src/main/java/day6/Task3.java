package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Андрей");
        Teacher teacher = new Teacher("Сергей Николаевич", "Программирование");
        teacher.evaluateStudent(student);
    }
}
