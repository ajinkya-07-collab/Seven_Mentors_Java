package Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("// concat()");
        String name = "Amit Kumar";
        System.out.println(name.length());

        String address = "Pune";

        String info = name.concat(" : " + address);
        System.out.println(info);

        System.out.println("// equals() => boolean");
        System.out.println("Enter Passowrd : ");
        String ps1 = sc.next();

        System.out.println("Re-Enter Password : ");
        String ps2 = sc.next();

        if (ps1.equals(ps2)) {
            System.out.println("Proceed further !!");
        } else {
            System.out.println("Password Mismatched !!");
        }

        System.out.println("// charAt(index)");
        char c = info.charAt(2);
        System.out.println("Char at 2 : " + c);

        System.out.println(" // toUppercase() , toLowerCase()");
        System.out.println(info.toUpperCase());
        System.out.println(info.toLowerCase());

        // String[] words = info.split(" ");

        for (int i = info.length() - 1; i >= 0; i--) {
            System.out.print(info.charAt(i));
        }

        System.out.println();

        System.out.println(" // equalsIgnoreCase() => boolean");
        System.out.println("Please Enter City : ");
        String inputCity = sc.next();
        String cityName = "Pune";

        System.out.println(cityName.equalsIgnoreCase(inputCity)); // true

        System.out.println("// isEmpty(),isBlank()-Java11+ => boolean");
        System.out.println(info.isEmpty()); // false
        System.out.println(info.isBlank()); // false

        System.out.println("//trim(),trimLeft(),trimRight() or strip(),stripLeading(),stripTrailing()");
        String str1 = "   Ajinkya    ";
        System.out.println("Not Trimmed : " + str1);
        System.out.println("Trimmed : " + str1.trim());

        System.out.println("//subString()");
        System.out.println(info.substring(0, 4));

        System.out.println("//contains()");
        String token = "sevenmentors.com";
        String email = "ajinkya@sevenmentors.com@gmail.com";
        System.out.println(email.contains(token));

        System.out.println("Example : ");

        String website = sc.next();

        if (website.startsWith("https") && website.endsWith(".com")) {

        }

        System.out.println("indexOf() => returns index of specific char");
        System.out.println("lastIndexOf(str) => returns last index");
        System.out.println(
                "replace(str,str) is used to replace characters or a sequence of characters with something else.");

        System.out.println("replaceFirst() replaces only the first occurrence of a matching pattern.");
        System.out.println("replaceAll() replaces all occurrences that match a pattern (regular expression).");

        System.out.println(
                "split() is used to break a String into multiple parts based on a separator. It returns a String array (String[]).");

        sc.close();
    }
}
