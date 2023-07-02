package Chapter8_Pattern_Problem_solving;

public class PatternProblem_1 {
    public static void main(String[] args) {


        int n=4;
        int trows=n;

        for(int row=1;row<=trows;row++){
            //Work for Current row
            for(int cst=1;cst<=row;cst++){  //Count of star
                System.out.print("*");
            }
            //Prepare for next row
            System.out.println();

        }

    }
}
