package Chapter9_Functions_In_Java;

public class Functions_2 {
    public static void main(String[] args) {

        int res=addNumbers(25,10);
        System.out.println(res);

        int res2= addNumbers();
        System.out.println(res2);
        for(int i=1;i<=5;i++){
            int result=getSquare(i);
            System.out.println("Square of " + i + "is:"+result  );
        }
    }


    public static int addNumbers(int val1,int val2){
    int sum=val1+val2;
    return  sum;
    }

    public static int addNumbers(){
        int a=5;
        int b=10;
        int sum=a+b;
        return sum;
    }



    public static int getSquare(int x){
        return x*x;
    }

}
