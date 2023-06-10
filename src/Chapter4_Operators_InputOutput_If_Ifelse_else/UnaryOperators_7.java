package Chapter4_Operators_InputOutput_If_Ifelse_else;

public class UnaryOperators_7 {

    public static void main(String[] args){

        //Unary operators has only one operands
        // ++  or --

        int num=5;
        ++num;

        System.out.println(num);

        int a=12, b=12;
         int res1, res2;

        System.out.println(a);

        //Increment
        res1=++a;
        System.out.println(res1);

        //Decrement

        res2=--b;
        System.out.println(res2);

        int var1=5;
         int var2=5;

         //If I use ++operator  as postflix like: val++
        //The original value is returned first and val is incremented by 1
        //5 is basically displayed
        //then var1 is increased to 6
        System.out.println(var1++);


        //var2 is increases to six first and then var2 only displayed

        System.out.println(++var2);

    }

}
