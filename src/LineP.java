import java.util.Random;
import java.util.Scanner;

/**
 * Created by SergeyKarpilovich on 2/28/2017.
 */
public class LineP {

	Scanner sc = new Scanner(System.in);
	Random rnd = new Random(System.currentTimeMillis());
	int[][] masChar;

	public static void main(String args[]) {
		LineP app = new LineP();
		app.runTheApp();
	}

	private void runTheApp() {
		System.out.println("Enter new string consist of integer values");
		getMas();
		printMas(masChar);
	}

	private int[][] getMas() {
		String Res = takeString();
		char[]a = stringToCharMas(Res);
		masChar = new int[a.length][];
		for (int ar = 0; ar < Res.length(); ar ++) {
			masChar[ar] = new int[Integer.parseInt(String.valueOf(Res.charAt(ar)))];
		}
		for (int it = 0; it < masChar.length; it++) {
			for (int j = 0; j < masChar[it].length; j++) {
				masChar[it][j] = fillArr();
			}
		}
		return masChar;
	}

	private void printMas(int massiv[][]) {
		for (int[] a: massiv){
			for (int l: a) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

	private String takeString() {
		if (sc.hasNextLine()) {
			return sc.nextLine();
		}
		else {
			return takeString();
		}
	}

	private char[] stringToCharMas(String str) {
		return str.toCharArray();
	}

	private int fillArr() {
		return rnd.nextInt(100);
	}
}
