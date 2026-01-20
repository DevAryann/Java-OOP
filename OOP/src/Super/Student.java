package Super;

public class Student extends Person {
    String FirstName ;
    String LastName;
    String middle ;

    double GPA ;


    Student(String first , String last, String middle , double gpa){
        super(first,last);
        this.GPA = gpa ;
        this.middle = middle ;
    }
}
