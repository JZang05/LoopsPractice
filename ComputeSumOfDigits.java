import java.util.Scanner;
public class ComputeSumOfDigits {
    public static void main(String[] args) {
        int digit;
        int sumOfDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int n = sc.nextInt();
        String ofInteger = ""+n;
        int stringLength = ofInteger.length();
        for(int i=0; i<stringLength; i++) {
            digit = n%10;
            n = n/10;
            sumOfDigits = sumOfDigits + digit;
        }
        System.out.println("Digit sum is "+sumOfDigits);
    }
}