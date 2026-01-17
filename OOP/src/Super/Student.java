package Super;

public class Student extends Person {
    String FirstName ;
    String LastName;

    double GPA ;


    Student(String first , String last , double gpa){
        super(first,last);
        this.GPA = gpa ;
    }
}
