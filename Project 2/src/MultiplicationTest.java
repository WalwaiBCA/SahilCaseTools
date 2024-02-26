import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void test() {

		Multiplication obj = new Multiplication();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value of num1: ");
		int num1 = input.nextInt();
		System.out.print("Enter value of num2: ");
		int num2 = input.nextInt();
		//int s = num1 * num2;
		int m = obj.mul(num1,num2);
		assertEquals(4,m);
		input.close();
		
	}

}
