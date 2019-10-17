public class University {
    private String name; //name of institution
    private String FoundationYear; //number of Student
    Student[] Student;

    public University(String name, String FoundationYear, Student[] Student){
        this.name = name;
        this.FoundationYear = FoundationYear;
        this.Student = Student;
    }
    public double average(){
        double result = 0;
        for (int i = 0; i < Student.length; i++)
        {
            result += Student[i].getGrade();
        }
        return result/Student.length;
    }

    public double averageUni()
    {
        return average();
    }
}
