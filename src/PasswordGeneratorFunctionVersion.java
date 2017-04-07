import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PasswordGeneratorFunctionVersion {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("input your name:");
        String name = in.nextLine();

        String passWord = passwordGenerator(name, "$$", "##");

        System.out.println(passWord);

        in.close();
    }

    public static String passwordGenerator(String name, String prefix, String postfix){

        int nameSquare = 0;

        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        nameSquare = (name.length()) * (name.length());

        return prefix + name + nameSquare + postfix;
    }



}


