package Chapter7_ProblemSolvingandTernaryOperator;

public class ProblemSolving_ContinueStatement_3 {
    public static void main(String[] args) {
         int i=1,j=1;

         while(i<=3){

             System.out.println("Outer Loop" +i);

             while(j<=3){
                 if(j==2){
                     i++;
                     continue;
                 }

                 System.out.println("Inner Loop" +j);
                 j++;


             }
                i++;
         }
    }
}
