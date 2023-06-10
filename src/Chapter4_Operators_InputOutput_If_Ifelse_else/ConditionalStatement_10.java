package Chapter4_Operators_InputOutput_If_Ifelse_else;

public class ConditionalStatement_10 {

    public static void main(String[] args) {

    int hotstarsubs=4;

    if(hotstarsubs==0){
        System.out.println("Now its a good time  to get the HotStar Subscription");
    }
    else if(hotstarsubs==1){
        System.out.println("Why Dont you Upgrade your premium subs");
    }

    else if(hotstarsubs==2){
        System.out.println("Welcome to the HotStar Subs");
    }

    else{
        System.out.println("This Looks like an Invalid Input");
    }

    }
}
