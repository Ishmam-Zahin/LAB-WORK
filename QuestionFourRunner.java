import java.util.Scanner;

public class QuestionFourRunner {
    public static void main(String[]str){
        int maximumnumberofvalue;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum number of values:");
        maximumnumberofvalue = in.nextInt();
        DataSet dataSet = new DataSet(maximumnumberofvalue);

        System.out.println("Enter values(enetr a character to stop):");
        while(in.hasNextDouble()){
            dataSet.add(in.nextDouble());
        }

        System.out.println("Sum is: "+dataSet.getSum());
        System.out.println("Average is: "+dataSet.getAverage());
        System.out.println("Maximum value is: "+dataSet.getMaximumValue());
        System.out.println("Minimum value is: "+dataSet.getMinimumValue());
    }
}
