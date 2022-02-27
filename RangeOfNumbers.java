import java.util.Scanner;
public class RangeOfNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Start? ");
        int startInt = sc.nextInt();
        System.out.print("End? ");
        int endInt = sc.nextInt();
        if(startInt <= endInt) {
            for(int i = startInt; i <= endInt-1; i++) {
                System.out.print(i+", ");
            }
        }
        else {
            for(int i = startInt; i>=endInt+1; i--) {
                System.out.print(i+", ");
            }
        }
        System.out.print(endInt);
	}
}