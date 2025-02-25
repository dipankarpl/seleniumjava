package patternProblems;

public class Pattern6 {

	public static void main(String[] args) {
		printPattern(5);
	}

	private static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
