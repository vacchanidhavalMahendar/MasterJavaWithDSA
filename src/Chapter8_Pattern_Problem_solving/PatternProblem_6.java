package Chapter8_Pattern_Problem_solving;

public class PatternProblem_6 {
    public static void main(String[] args) {

         int n=7;
          int trows=n;
          int stars=1;
          int spaces=n-2;

          for(int row=1;row<=trows;row++){

                //Work

              //stars
              for(int cst=1;cst<=stars;cst++){
                  System.out.print("*");
              }

              //Spaces
              for(int csp=1;csp<=spaces;csp++){
                  System.out.print(" ");

              }

              //Stars
              int sstars=stars;

              if(row==trows/2+1){
                sstars=stars-1;
              }

              for(int cst=1;cst<=sstars;cst++){
                  System.out.print("*");
              }


              //Prepare
              System.out.println();
              if(row<=trows/2){
                stars++;
                spaces-=2;
              }

              else{
                  stars--;
                  spaces+=2;
              }



          }
    }
}
