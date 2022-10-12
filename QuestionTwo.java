import java.util.ArrayList;

public class QuestionTwo {
    public double sumWithoutSmallest(ArrayList<Double> array){
        double sum=0, minimum=0;

        for(int i=0; i<array.size(); i++){
            if(i==0){
                minimum = array.get(i);
                sum = sum + array.get(i);
            }
            else{
                if(array.get(i)<minimum) minimum = array.get(i);
                sum = sum + array.get(i);
            }
        }

        return (sum - minimum);
    }
}
