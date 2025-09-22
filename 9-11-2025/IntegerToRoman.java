public class IntegerToRoman {

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "Invalid input: Number must be between 1 and 3999.";
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                romanNumeral.append(symbols[i]);
                num -= values[i];
            }
        }
        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        System.out.println("3: " + intToRoman(3));    
        System.out.println("58: " + intToRoman(58));   
        System.out.println("1994: " + intToRoman(1994)); 
        System.out.println("4: " + intToRoman(4));     
        System.out.println("9: " + intToRoman(9));     
        System.out.println("3999: " + intToRoman(3999)); 
    }
}