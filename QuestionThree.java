import java.util.ArrayList;

public class QuestionThree {
    public void printPermutations(){
        ArrayList<Integer> permutationarray = new ArrayList<Integer>();
        ArrayList<Integer> secondarray = new ArrayList<Integer>();

        for(int i=1; i<=Constants.TEN; i++){
            permutationarray.add(i);
            secondarray.add(i);
        }

        for(int i=0; i<secondarray.size(); i++){
            permutationarray.remove(secondarray.get(i));
            permutationarray.add(secondarray.get(i));

            System.out.println(permutationarray);
        }
    }
}
