

public class Main {

 static String mystring = "This is the string";
 //for dollar sign
    static String dollarSign = "\u0024";

 //we can also use the unicode here by using unicode we don;t have to use symbols which simplifies the conversion process
    // so i  used $ and  for the $ sign the unicode is \u0024
 static String mystring2 = " I wish have \u002400000";
    public static void main(String[] args) {
        //we can also use the print;n method in the same line to be executed
        System.out.println(dollarSign); System.out.println(mystring); System.out.println(mystring2);

    }


}