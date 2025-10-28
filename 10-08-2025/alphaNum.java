public class alphaNum {
    public static String num(String str) {
        char charArray[] = str.toCharArray();
        StringBuilder characters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (isInteger(String.valueOf(charArray[i]))) {
                numbers.append(charArray[i]);
            } else {
                characters.append(charArray[i]);
            }
        }
        return characters.toString() + "" + numbers.toString();
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(num("hello123world456"));
        System.out.println(num("ABC789XYZ"));
    }
}