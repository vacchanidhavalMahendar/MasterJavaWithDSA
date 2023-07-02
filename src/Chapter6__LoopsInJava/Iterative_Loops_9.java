package Chapter6__LoopsInJava;
//Prime number: Exactly Divisible by 1 or number itsef
//given input iteger ad eed to tell its is prime or not
//5 true and  9 false
public class Iterative_Loops_9 {
    public static void main(String[] args) {

        int n=7;
        int div=2;
        int flag=0; //Toggle value

        while(div<=n-1){

            if(n%div==0){
                flag=1;
                break;
            }
            div+=1;
        }

        if(flag==1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime Number");
        }

        for(int i=1;i<=10;i++){

            if(i==5){
                break;
            }
            System.out.println(i);
        }

    }
}
