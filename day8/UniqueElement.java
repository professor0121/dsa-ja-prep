
import java.util.*;

public class UniqueElement {
	public static ArrayList<Integer> unique(int array[]) {
		ArrayList<Integer> map = new ArrayList<Integer>();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int num : array) {
			if (hashmap.containsKey(num)) {
				hashmap.put(num, hashmap.get(num) + 1);
			} else {
				hashmap.put(num, 1);
			}
		}
		for (int num : hashmap.keySet()) {
			if (hashmap.get(num) == 1) {
				map.add(num);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		int array[] = { 2, 2, 4, 1, 1, 5, 7, 7 };
		System.out.println("the unique elements is " + unique(array));
	}
}
