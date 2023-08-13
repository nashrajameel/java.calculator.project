import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int input = 1;
         
    
        do{
            System.out.println("Calculator  Menu");
            System.out.println("choice 1. Addition ");
            System.out.println("choice 2. Substraction");
            System.out.println("choice 3. Multiplication");
            System.out.println("choice 4. Division");
            System.out.println("choice 5. Exit");
            
            int choice = sc.nextInt();

            if (choice == 5 ){
                System.out.println("Exiting calculator");
                break ;
            }
            else if( choice <1  || choice >4 ){
                System.out.println("Invalid choices");
            }
            System.out.println(" Enter value of a");
             int a = sc.nextInt();
           System.out.println(" Enter  value of b");
            int b = sc.nextInt();
          


            
        
    

            switch(choice) {
            
            case 1: System.out.println(a + b);
            break;

            case 2 : System.out.println( a - b);
            break;

            case 3 : System.out.println( a*b);
            break;
            
            
            case 4 : 
            if ( b == 0) {
                System.out.println( a/b);
            }else {
                System.out.println("Cannot divide by zero");
            }
            break;

            default : System.out.println(" Invalid choice ");
            
            }
            System.out.println(" want  to Continue  yes(1)  or no (0)");

            input = sc.nextInt();         



        }while ( input == 1);
    }
}