import java.util.*;

class anagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            // System.out.println(str);
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // System.out.println(charArray);
            String sortedStr = new String(charArray);
            // System.out.println(sortedStr);

            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
            System.out.println(anagramMap);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println(groupedAnagrams);
    }
}
