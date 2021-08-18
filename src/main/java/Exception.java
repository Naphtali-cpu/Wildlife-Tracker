import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            long nb1 = kb.nextLong();
            if(nb1<1000000000)
                throw new ArithmeticException();
            else System.out.println( "result : " + Math.sqrt(nb1) );
        } catch (ArithmeticException e) {
            System.out.println("This is an arithmetic exception!!");
        }
    }
    public void doChangePin(int oldPin, int pin) throws Exception {	//need to add throws followed by exception name
        int pinCode = 0;
        if (oldPin == pinCode) {
            pinCode = pin;
        } else {
            throw new Exception();
        }
    }

}
