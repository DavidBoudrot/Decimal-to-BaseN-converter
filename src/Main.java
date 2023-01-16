import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in decimal system:");
        int decimal = scanner.nextInt();
        System.out.println("Enter target base: ");
        int targetBase = scanner.nextInt();
        String output = decimalToBaseN(decimal, targetBase);
        System.out.println("Conversion result: " + output);

    }
    // this function will divide by targetBase to find a remainder and add it to the output repeatedly.
    // Once the result is 0 that is when the function knows its completed.
    // At the end it reverses itself so the number is formatted properly.
    public static String decimalToBaseN(int decimal, int targetBase) {
        HashMap<String, String> map = new HashMap<>();
        String[] chars = new String[] {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        for (int i = 0; i < chars.length; i++) {
            map.put(Integer.toString(i), chars[i]);
        }
        //Math
        int x = decimal;
        String out = new String();
        int r = 0;
        while (x > 0) {
            r = x % targetBase;
            out = out.concat(map.get(Integer.toString(r)));
            x /= targetBase;
        }
        //Reversing
        char ch;
        String out2 = "";
        for(int i = 0; i < out.length(); i++) {
            ch = out.charAt(i);
            out2 = ch + out2;
        }
        return out2;
    }
    }



