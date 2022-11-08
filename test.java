import java.util.Scanner;
public class test {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);

       System.out.println("Enter ur first name");
       String firstname=inp.next();

       System.out.println("Enter ur last name");
       String lastname=inp.next();

       System.out.println("Your full name :"+firstname+" "+lastname);
    }

}
