/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Celsius2FahrenheitService {
    int celsius = 0;

    Celsius2FahrenheitService(int celsius){
        this.celsius = celsius;
    }

    public double toFaranheit(int celsius){

        return (celsius * 1.8) + 32;
    }
}
