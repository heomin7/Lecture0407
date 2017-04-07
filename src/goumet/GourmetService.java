package goumet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {

    public double calcAverageScore(List<Gourmet> listi){

        int sum = 0;

        for(Gourmet e: listi){
            sum += e.getScore();
        }

        return sum / (double)listi.size();
    }
    //todo
}
