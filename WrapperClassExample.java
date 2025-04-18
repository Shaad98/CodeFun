// import java.util.*;

public class WrapperClassExample{
    public static void main(String args[]){
        // String number = "19";
        
        // // Always remember Integer.parseInt(String s) always return primitive int

        // // You can give integer as well as string here
        // Integer i = Integer.valueOf(number);

        // // Convert any number format to decimal
        // Integer x = Integer.valueOf("1100",2);
        // System.out.println(x);

        // if(i instanceof Integer)
        // {
        //     System.out.println("Inside string there is a number!");
        // }else{
        //     System.out.println("String is alphanumeric!");
        // }

        // int num = 19;
        // // Convert Integer to Binary Number String
        // System.out.println(Integer.toBinaryString(num));
        // // Convert Integer to Octal Number String
        // System.out.println(Integer.toOctalString(num));
        // // Convert Integer to Hexa Decimal Number String
        // System.out.println(Integer.toHexString(num));


        // Integer a = 10;
        // Integer b = 20;
        // System.out.println(a.equals(b));
        // System.out.println(a==b);

        // System.out.println(a.compareTo(b));
        // System.out.println(Integer.compare(a, b));

        // System.out.println(Integer.max(a, b));
        // System.out.println(Integer.min(a, b));
        // System.out.println(Integer.sum(a, b));

        char ch = 'a';
        char z = 'B';

        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toLowerCase(z));

        System.out.println(Character.isDigit(z));
        System.out.println(Character.isAlphabetic(z));
        System.out.println(Character.compare(ch, z));
        
        System.out.println(Character.isLetter(z));
        System.out.println(Character.isWhitespace(z));

        
    }
}