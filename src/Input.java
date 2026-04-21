import java.util.Scanner;

public class Input {

    private Input(){}

    static Scanner scn = new Scanner(System.in);

    public static String getUserString(String prompt){

        System.out.print(prompt);
        return scn.nextLine();
    }

    public static int getUserInt(String prompt){

        System.out.print(prompt);
        return scn.nextInt();
    }
}
