/**
 * pragnya
 */
import java.util.Scanner;

public class RegtangleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("input length:" );
		double length = scanner.nextDouble();
		scanner.nextLine();
		double width = scanner.nextDouble();
		scanner.nextLine();
		System.out.printf("\n area: %16.2f", length * width );
		System.out.printf("\n perimeter: %11.2f", 2*length + 2*width);
		System.out.printf("\n diagonal: %11.2f", Math.sqrt(width*width + length*length));
	}

}
