package Encapsulation;
import java.util.*;
public class EmployDriver {
    public static void main(String[] args) {
        // "e1" is a reference variable → stored in Stack
        // new Employ() object → stored in Heap
        Employ e1 = new Employ();

        // Try-catch used to handle invalid input from Scanner (Required)
        try (Scanner sc = new Scanner(System.in)) {

            // "age" is a local variable → stored in Stack
            int age;

            System.out.println("Enter Your Age");

            // nextInt() may throw InputMismatchException → handled in try-catch
            age = sc.nextInt();

            if (age > 0) {
                // Calls setAge() where object variable age is updated in Heap
                e1.setAge(age);
                System.out.println("Employ age Set Successfully");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number!");
        }

        // Calling getAge() → prints age stored in Heap
        e1.getAge();

    }

}


/*
** My Original Code
*
package Encapsulation;
import java.util.*;
public class EmployDriver
{
    public static void main(String[] args) {
        Employ e1 = new Employ();
        Scanner sc = new Scanner(System.in);
        int age;
            System.out.println("Enter Your Age");
            age = sc.nextInt();

        if (age > 0) {
            e1.setAge(age);
        }

        e1.getAge();
    }
}
*/