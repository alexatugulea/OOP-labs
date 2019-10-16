package Java_Lab1;

public class University {
    String name;
    int fYear;
    Student[] students;

    public University(String name, int fYear, Student[] students) {
        this.name = name;
        this.fYear = fYear;
        this.students = students;
    }

    public double getAverage() {
        double media = 0;
        for (int i = 0; i < students.length; i++) {
            media += this.students[i].mark;
        }
        return media / this.students.length;
    }

    public void showUniversity() {
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < this.students.length; i++) {
            msg.append(this.students[i].name);
            msg.append(" ");
        }
        double media = this.getAverage();
        System.out.println("University " + this.name
                + " founded in " + this.fYear
                + " has students : " + msg
                + " with the mark " + media);
    }
}
