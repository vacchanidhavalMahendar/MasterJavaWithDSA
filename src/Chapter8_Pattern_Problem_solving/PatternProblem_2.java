package Chapter8_Pattern_Problem_solving;

public class PatternProblem_2 {
    public static void main(String[] args) {
        int n=8;
        int trows=n;
        //First Row
        int spaces=n-1;
        int star=1;

        for(int row=1;row<=trows;row++){
                //Work for Current row

                //Spaces
            for(int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
              //Stars
            for(int cst=1;cst<=star;cst++){
                System.out.print("*");
            }

            //Prepare for Next Row
            System.out.println();
            spaces--;
            star +=2;


        }


    }
}
