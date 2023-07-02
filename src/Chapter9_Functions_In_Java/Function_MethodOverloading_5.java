/*
package Chapter9_Functions_In_Java;

//ArmS  trong number
//A positive  integer is called an armStrong number
//abc=a^n+b^n+c^n
//153=1^3+  5^3+3^3
//1634=1^4+6^4+3^4+4^4

//Given an  input number, true or false,If its an armStrong number or Not
//153=true
//570=false
//1634->true


public class Function_MethodOverloading_5 {
    public static void main(String[] args) {
        System.out.println(isArmStrong(1634));

    }

    public static boolean isArmStrong(int n){
        int  nod=countDigits(n);//4
        int on=n;//1634
        int sum=o;
        while(n>0){
            int rem=n%10;//4
            sum+=Math.pow(rem,nod);//4 ^4
            n=n/10;
        }

      */
/*  if(sum==on){
            return true;
        }
        else{
            return false;
        }*//*

    return sum==on;
    }

    public static int countDigits(int n){
        int nod=0;
        while(n>0){
        n=n/10;
        nod++;
        }
    }
}
*/
