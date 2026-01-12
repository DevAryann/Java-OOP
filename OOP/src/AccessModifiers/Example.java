package AccessModifiers;

public class Example {
    public static void main(String[] args) {
        Passwords acc1 = new Passwords();
        acc1.setPasswords("abcd");

        System.out.println(acc1.getPasswords());


    }

}

class Passwords{
   private String passwords ;

   public void setPasswords(String pass ) {                     // Setter
       this.passwords = pass ;
    }
   public String getPasswords(){                               //getter
       return this.passwords;

   }
}