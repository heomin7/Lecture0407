/**
 * Created by danawacomputer on 2017-04-07.
 */
public class ArrayExampleFunctionVersion {
    public static void main(String[] args){

        int[] iArr = {1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};

        double averageOfArray = 0.0;

        averageOfArray = calcAverage(iArr);

        System.out.println("average: " + averageOfArray);
    }

    public static double calcAverage(int[] iArr){

        int sum = 0;

        for(int e: iArr){
            sum += e;
        }

        return sum / (double)iArr.length;
    }
}
