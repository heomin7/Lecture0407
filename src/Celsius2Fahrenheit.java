/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Celsius2Fahrenheit {
    public static void main(String[] args){

        int celsius = 50;

        Celsius2FahrenheitService service =
                new Celsius2FahrenheitService(celsius);

        double result  = service.toFaranheit(celsius);

        System.out.println(result);

        String str = new String("Hello");

        System.out.println();
    }
}
