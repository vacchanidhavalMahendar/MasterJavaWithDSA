package Chapter4_Operators_InputOutput_If_Ifelse_else;

public class ConditionalStatement_9 {

    public static void main(String[] args){


        // if else if else

        //0= no subs
        //1 = super
        //2=premium

        int hotstarsubs=1;

        if(hotstarsubs==0){
            System.out.println("Now is agood time to get the Hot star subscription");
        }

        else if(hotstarsubs==1){

            System.out.println("Why dont you Upgrade  your premium subscription");
        }

        else if(hotstarsubs==2){
            System.out.println("Welcome to Hot star Premium");
        }
        else{

            System.out.println("Welcome to  Hot star Premium");
        }

        //Nested if else

        String movie="line of Duty";
        boolean primeSubs1= true;
        boolean acorn= false;
        boolean amc=false;

        if(primeSubs1) {
            if (acorn || amc) {
                System.out.println("Yes you can watch it" + movie);

            } else {
                System.out.println("We Recommened buying either acorn or ams subs to enjoy the movie");
            }
        }
            else{
                System.out.println("Cannot watch the Movie,Why dont you take the  Prime Subs");
            }

            int num=-10;
            if(num<10){
                System.out.println("It is A Negative Number");


            }

        System.out.println("Now Your the Outside the If Block");
        }
    }

