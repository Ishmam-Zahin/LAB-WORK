import java.util.ArrayList;

public class DataSet {
    int maximumnumberofvalues;
    ArrayList<Double> array = new ArrayList<Double>();

    public DataSet(int maximumnumberofvalues){
        this.maximumnumberofvalues = maximumnumberofvalues;
    }

    public void add(double value){
        if(array.size()>=maximumnumberofvalues){
            System.out.println("Array is Full!");
        }
        else{
            array.add(value);
        }
    }

    public double getSum(){
        double sum=0;
        for(int i=0; i<array.size(); i++) sum = sum + array.get(i);

        return sum;
    }

    public double getAverage(){
        double sum=0;
        for(int i=0; i<array.size(); i++) sum = sum + array.get(i);

        return (sum/maximumnumberofvalues);
    }

    public double getMaximumValue(){
        double maximumvalue=0;
        for(int i=0; i<array.size(); i++){
            if(i==0){
                maximumvalue = array.get(i);
            }
            else{
                if(maximumvalue<array.get(i)){
                    maximumvalue = array.get(i);
                }
            }
        }

        return maximumvalue;
    }

    public double getMinimumValue(){
        double minimumvalue=0;
        for(int i=0; i<array.size(); i++){
            if(i==0){
                minimumvalue = array.get(i);
            }
            else{
                if(minimumvalue>array.get(i)){
                    minimumvalue = array.get(i);
                }
            }
        }

        return minimumvalue;
    }
}
