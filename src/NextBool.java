import java.util.InputMismatchException;
import java.util.Scanner;



public class NextBool {

    public static void main(String[] args) {
        String inputStr = "1 0 true false True False TRUE FALSE 234 t f T F trUE fALsE";
        Scanner input = new Scanner(inputStr);

        String str;
        while (input.hasNext()) {
            str = input.next().toLowerCase();
            if(str.equals("true") || str.equals("false")) {
                System.out.println(str);
            } else {
                System.out.println("ERROR: null");
            }
        }
    }

}