package InterviewProgram;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int a[] = { 1, 6, 9, 8, 4, 2, 6, 37, 2 ,39};
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
