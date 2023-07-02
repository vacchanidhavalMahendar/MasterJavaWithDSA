package Chapter8_Pattern_Problem_solving;

public class PatternProblem_5 {
    public static void main(String[] args) {

        int n=4;

        //Print the First Row

        for(int frow=1;frow<=2*n-1;frow++){
            System.out.print("*");
        }

        System.out.println();

        int trows=n-1;
        int stars=n-1;
        int spaces=1;
        for(int row=1;row<=trows;row++){

         //Work


         //Stars
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");

            }
            //Spaces
            for(int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }

            //Stars
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }


            //Prep
            System.out.println();
            stars--;
            spaces+=2;



        }


    }
}
