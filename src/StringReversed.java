import java.util.Scanner;

public class StringReversed {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("Please enter a string: ");

        String s = SCANNER.nextLine();
        
        String revString = "";

        for (int i = s.length() - 1; i >= 0; i--){

            revString += s.charAt(i);

            }
             System.out.print("The reversed string of your initial string is: " + revString);
        }
    }