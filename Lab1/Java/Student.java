package Java_Lab1;

public class Student {
    String name;
    int age;
    double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void showStudent() {
        System.out.println("Student " + this.name
                + " about " + this.age + " years old"
                + " has an " + this.mark);
    }
}
