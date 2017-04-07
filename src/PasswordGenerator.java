import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PasswordGenerator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("input name: ");
        String name = scanner.nextLine();

        PasswordGeneratorService pgs = new PasswordGeneratorService();

        String password = pgs.createPassword(name, "$$", "##");
        System.out.println(password);
    }
}
