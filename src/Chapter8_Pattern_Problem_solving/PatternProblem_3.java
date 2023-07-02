package Chapter8_Pattern_Problem_solving;

public class PatternProblem_3 {
    public static void main(String[] args) {

        int n=7;
        int tRows=n;

        int stars=1;

        for(int row=1;row<=tRows;row++){

            //Work
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //Prep Next Row
            System.out.println();
            if(row<=tRows/2){
                stars++;
            }
            else{
                stars--;
            }
        }
    }
}
