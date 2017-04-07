package goumet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {
    public static void main(String[] args){

        //맛집 객체를 5개 만든다.
        Gourmet spoon = new Gourmet();
        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        spoon.setScore(111);

        Gourmet sushi = new Gourmet();
        sushi.setTitle("스시 메이진");
        sushi.setMainMenu("스시, 스시뷔페");
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        chan.setTitle("맛찬들");
        chan.setMainMenu("한정식, 떡갈비, 갈비찜");
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        choi.setTitle("최우영 스시");
        choi.setMainMenu("한정식, 떡갈비, 갈비찜");
        choi.setScore(49);

        Gourmet ranch = new Gourmet();
        ranch.setTitle("철판목장");
        ranch.setMainMenu("한정식, 떡갈비, 갈비찜");
        ranch.setScore(49);

        Gourmet yongho = new Gourmet("용호낙지", "낙새, 낙곱새", 46);
        yongho.setTitle("용호낙지");
        yongho.setMainMenu("한정식, 떡갈비, 갈비찜");
        yongho.setScore(49);

        //맛집객체를 리스트에 담는다.
        List<Gourmet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushi);
        list.add(chan);
        list.add(choi);
        list.add(ranch);

//맛집 점수 평균 구히기
        /*
         int sum = 0;

        for(Gourmet e: list){
            sum += e.score;
        }

        double average = sum / (double)list.size();
         */

        GourmetService gs = new GourmetService();

        double average = gs.calcAverageScore(list);

        System.out.printf("맛집 점수 평균은 %.1f 입니다.", average);
    }

    //맛집객체를 리스트에 담는다.
//    List<Gourmet> list = Arrays.asList(
 //           spoon, sushi, chan, choi, ranch);
}
//