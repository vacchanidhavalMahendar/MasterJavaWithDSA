package Chapter7_ProblemSolvingandTernaryOperator;

public class ProblemSolving_TypeCasting_5 {
    public static void main(String[] args) {
        //Case 1

        byte by=10;
        short sh=10;
        int in=10;
        long ln=10;

        /*by=sh;
        by=in;
        by=long;*/

            sh=by;
            /*sh=in;
            sh=ln;*/

        in =by;
        in=sh;
        //in=ln;

        ln=by;
        ln=in;
        ln=sh;

        //CASE 2

        by=100;
        for(byte b=0;b<=128;b++){

            System.out.println("Hello");
        }

        //CASE 3

        float f=5.6f;
        double d=6.7;

        //f=d;
    d=f;//f is given to d
        System.out.println(d);

    //CASE 4
    //in=f;
        f=in;
    in=(int)f;  //Forcefully given and it will allow to execute it in int

        byte b=(byte)130;
        System.out.println(b);


        //case 5
        char ch ='a';
        in=ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int)ch);
        ch=(char)(ch+1);
        System.out.println(ch);



        //CASE 6::
        ch ='a'+1;  //b
        ch=(char)('a'+ch);
        System.out.println(ch);


        System.out.println(10+20+ "Hello" +10+20);
        System.out.println(2 +' '+5);
        System.out.println(2+" "+5);
        System.out.println("Hello"+'\t'+"World");
        System.out.println(2+'\t'+3);




    }
}
