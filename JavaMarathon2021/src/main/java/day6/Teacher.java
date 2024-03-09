package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;

    }

    public void evaluateStudent(Student s) {
        Random random = new Random();
        int min = 2;
        int max = 5;
        int diff = max - min;
        int evalution = random.nextInt(diff + 1) + min;
        switch (evalution) {
            case 2:
                System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() + " по предмету " + "\"" + subject + "\"" + " на оценку \"неудовлетворительно\"");
                break;
            case 3:
                System.out.println("Преподаватель " + name + "оценил студента с именем " + s.getName() + " по предмету " + "\"" + subject + "\"" + " на оценку \"удовлетворительно\"");
                break;
            case 4:
                System.out.println("Преподаватель " + name + "оценил студента с именем " + s.getName() + " по предмету " + "\"" + subject + "\"" + " на оценку \"хорошо\"");
                break;
            case 5:
                System.out.println("Преподаватель " + name + "оценил студента с именем " + s.getName() + " по предмету " + "\"" + subject + "\"" + " на оценку \"отлично\"");
                break;
        }

    }

}
