import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTwoRunner {
    public  static void main(String[]str){
        ArrayList<Double> array = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enetr the array(enetr a character to stop):");
        while(in.hasNextDouble()){
            double x = in.nextDouble();
            array.add(x);
        }

        QuestionTwo questionTwo = new QuestionTwo();
        System.out.println("Sum without Smalest Number: "+questionTwo.sumWithoutSmallest(array));

    }
}
