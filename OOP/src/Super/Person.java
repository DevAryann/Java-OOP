package Super;

public class Person {
   public String FirstName;
    public String  LastName;

    Person(String First , String Last){
        this.FirstName = First ;
        this.LastName = Last ;
    }

    void info() {

        System.out.println(FirstName+ " " + LastName );
    }

}
