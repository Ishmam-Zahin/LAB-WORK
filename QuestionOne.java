public class QuestionOne {
    int[] array = new int[Constants.LENGTH];

    public void calculate(){
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random() * Constants.TEN);
            if(array[i]==0) i--;
        }
    }

    public void printOutputs(){
      System.out.println("Every Elements at Even Index(zero base index):");
      for(int i=0; i<array.length; i=i+2) System.out.print(array[i]+" ");
      System.out.println();

        System.out.println("Every even Elements:");
        for(int i=0; i<array.length; i=i+1) if(array[i]%Constants.TWO==0) System.out.print(array[i]+" ");
        System.out.println();

        System.out.println("Every Elements in Reverse Order:");
        for(int i=array.length-1; i>=0; i=i-1) System.out.print(array[i]+" ");
        System.out.println();

        System.out.println("Only the Fitrst And Last Element:");
        System.out.print(array[0]+" "+array[array.length-1]);
        System.out.println();
    }
}
