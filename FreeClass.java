package Other;
import java.util.Scanner;

public class FreeClass {

 /*   public void sayHallo() {
        System.out.println("Hallo");
    }

    public void sayNHallo(int n) {
        int i;
        for ( i=1; i<=n; i++)  // cyklus ... opakovanie
        {
            System.out.print("Hallo ");
        }
        System.out.println();  // odriadkovanie
    }
    public void sayHi() {
        System.out.println("Hi");

    }
    public void sayNHi(int n) {
        int i=1;
        while (i<=n)  // cyklus ... opakovanie
        {
            System.out.print("Hi");
            i++;
        }
        System.out.println();  // odriadkovanie
      }
      public int getEvenNumber(int number) {
        if(number%2==0)
            return number;
        else
            return number +1;
      }

    public void uloha(){
        for (int r=1; r<=8; r++){
            for (int c=1; c<=8-r; c++){
                System.out.print(" ");
            }
            for (int d=1; d<=r*2-1; d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void  getname(){ //2 krok vytvorenie nového objektu

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName);

        // zadaj cislo
        System.out.println("Zadaj cislo");
        int value = myObj.nextInt();
        System.out.println("tvoje cislo je " + value);

        int c = value + 5;

        for (int i = 1; i <= value; i++) {
            System.out.println("*");

        }
        // zadam meno heslo
        // porovna s meno
        String username = "Jakub";
        int password = 123456;

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("zadaj meno");
        String username = myObj.nextLine();

        Scanner myObj1 = new Scanner(System.in); // Create a Scanner object
        System.out.println("write password");
        int password = myObj1.nextInt();

        if(meno.equals(username) && password == heslo) {
            System.out.println("Your data was correct .. success ");
        }
        */
       /* if (m == 1);
         sout (Januar);
         else if (m == 2);
         sout (February);
         else if (m == 3);
         sout (March);
         else if (m == 4);
         sout (April);
         else if (m == 5);
         sout (May);
         else if (m == 6);
         sout (June);
         else if (m == 7);
         sout (July);
         else if (m == 8);
         sout (August);
         else if (m == 9);
         sout (September);
         else if (m == 9);
         sout (October);
         else if (m == 10);
         sout (November);
         else if (m == 11);
         sout (December);
         else if (m == 12);
         sout (Error);
*/
public void one() {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");
    int m = myObj.nextInt();  // Read user input


    switch (m) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        default:
            System.out.println("Error");
    }
    switch (m) {
        case 12:
        case 1:
        case 2:
            System.out.println("Winter");
            break;
        default:
            System.out.println("Error");
    }
    System.out.println("Hi i am program");

    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");
    double a = myObj2.nextDouble();  // Read user input

    Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");
    double b = myObj3.nextDouble();  // Read user input

    Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");
    double c = myObj4.nextDouble();  // Read user input



    double root1, root2;
    double determinant = b * b - 4 * a * c;
    // condition for real and different roots
    if (determinant > 0) {
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println("root1:" + root1);
        System.out.println("root2:" + root2);
    }
    // Condition for real and equal roots
    else if (determinant == 0) {
        root1 = root2 = -b / (2 * a);
        System.out.println("root1" + root1);
    }
    // If roots are not real
    else {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
        System.out.println("No");
    }

    }
}