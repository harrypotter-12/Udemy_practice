

public class Main {
    static byte ch1 = 3;



    static int ch3 = 2;

    static short  shortTotal =    (short)   (1000 + 10 * (ch1 + ch3));


    static long ch4 = 50000L + 10L * (ch1 +  ch3);


    public static void main(String[] args) {

        System.out.println(ch1);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(shortTotal);
    }


}