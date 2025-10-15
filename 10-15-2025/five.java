public class five {
    public static void main(String[] args) {
        String s = "hellofromjava";
        char sCharArray[] = s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] == 'a' || sCharArray[i] == 'A' ||
                    sCharArray[i] == 'e' || sCharArray[i] == 'E' ||
                    sCharArray[i] == 'i' || sCharArray[i] == 'I' ||
                    sCharArray[i] == 'o' || sCharArray[i] == 'O' ||
                    sCharArray[i] == 'u' || sCharArray[i] == 'U') {
                s1.append(sCharArray[i]);
            }
        }
        s = s1.toString();
        System.out.println(s);
    }
}
