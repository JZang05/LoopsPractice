import java.util.Scanner;
public class BiggestAndSmallest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int biggest;
        int smallest;
        int sum;
        System.out.print("Number of numbers? ");
        int n = sc.nextInt();
        System.out.print("Number 1: ");
        sum = sc.nextInt();
        biggest=sum;
        smallest=sum;
        for(int i=0; i<n-1; i++) {
        System.out.print("Number "+(i+2)+": ");
        sum = sc.nextInt();
        if(sum>biggest) {
        biggest=sum;
        }
        else if(sum<smallest) {
        smallest=sum;
        }
        }
        System.out.println("Biggest = "+biggest);
        System.out.print("Smallest = "+smallest);
	}
}