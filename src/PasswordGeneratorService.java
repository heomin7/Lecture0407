/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PasswordGeneratorService {
    int nameSquare = 0;


    public String createPassword(
            String name, String prefix, String postfix){

        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nameSquare = (name.length()) * (name.length());

        if(name.length() >= 8)
            postfix = "";

        return prefix + name + nameSquare + postfix;
    }

}
