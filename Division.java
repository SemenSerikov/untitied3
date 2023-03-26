import java.util.Scanner;

public class Division {
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;

    public String divide()throws LoginValidationException {
        System.out.println("Enter a,b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b == 0) throw new LoginValidationException("Division by zero");
        try {
            int result = a / b;
            System.out.println("a/b = " + result);
            return  "OK";
        } catch (ArithmeticException e) {
           if (a<0) return "Infinity";
           if (a>0) return "Infinity";
           return "Error";
        }
    }
}
