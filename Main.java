import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionMethod getException = new ExceptionMethod();

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = scan.nextInt();
        try {
            getException.checkAge(age);
            
        } catch (Exception e) {
            System.out.println("Error..." +  e);
        }

        
    }
    
}
