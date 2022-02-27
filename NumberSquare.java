import java.util.Scanner;
public class NumberSquare {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Min? ");
        int minimum = sc.nextInt();
        System.out.print("Max? ");
        int maximum = sc.nextInt();
        for(int i=minimum; i<=maximum; i++) {
            for(int x=i; x<=maximum; x++) {
                System.out.print(x);
            }
            for(int y=minimum; y<i; y++) {
                System.out.print(y);
            }
            System.out.println("");
        }
	}
}