package String;

public class AdditionNumberInString {
	public static void main(String[] args) {
		String str = "5T2e1s3t6t1i1n9g7";
		String[] a = str.split("\\D");
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print( " "+Integer.parseInt(a[i]));
			k+=Integer.parseInt(a[i]);
		}
		System.out.println( "   Additoin of number:  "+k);
	}
}
