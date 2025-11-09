import java.util.*;

public class JosephusProblem {
	public static int checkServivor(int input, int k) {
		int persons[] = new int[input];
		for (int i = 0; i < input; i++) {
			persons[i] = i + 1;
		}
		for (int element : persons) {
			System.out.println(element);
		}
		return 0;
	}

	public static void main(String args[]) {
		System.out.println("hello this is from java");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of the persons");
		int value = sc.nextInt();
		System.out.println("enter the killing range");
		int k = sc.nextInt();
		int servivor = checkServivor(value, k);
	}
}
