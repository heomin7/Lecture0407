/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Celsius2FahrheitFunctionVersion {
    public static void main(String[] args){
        double Fahr = 0;
        double celsius = 50;

        Fahr = ToFaranheit(celsius);

        System.out.println("Fahr:" + Fahr);
    }

    public static double ToFaranheit(double celsius){
        return (celsius * 1.8) + 32;
    }
}
