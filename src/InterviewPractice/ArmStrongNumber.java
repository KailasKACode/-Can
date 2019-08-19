package InterviewPractice;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int value = number;
		int sum = 0, temp = 0;
		while (value > 0) {
			temp = value % 10;
			value = value / 10;
			sum += (temp * temp * temp);
		}
		System.out.println(sum);
		if (sum == number) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("No is not armstrong");
		}
	}
}
