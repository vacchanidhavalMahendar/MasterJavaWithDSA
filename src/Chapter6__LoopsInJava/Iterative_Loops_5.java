package Chapter6__LoopsInJava;

import java.util.Scanner;

//While Loop
public class Iterative_Loops_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=12345;
        int ans=0;
        while(n>0){
            int rem= n%10;
            ans= ans*10+rem;
            n= n/10;

        }
        System.out.println(ans);



        }
    }


