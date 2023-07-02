package Chapter9_Functions_In_Java;

public class Functions_1 {
    public static void main(String[] args) {
        System.out.println("Lets get started");
        //Calling the Functions
        greetingCustomer();
        System.out.println("See you soon Dear Dhaval");
      //  addNumbers(25,35);
       // addNumbers(5,25);
        //addNumbers(15,655);
        int res= addNumbers(12,25);
    }
    //Void is something ur functions
    //Declaring the functions
    public static void  greetingCustomer(){
        System.out.println("Hello to you,Dhaval");
        System.out.println("Hope your are having a good day");
    }

/*    public static  void addNumbers(int val1,int val2){
        int sum=val1+val2;
        System.out.println(sum);
    }*/

    public static int addNumbers(int val1,int val2){

        int sum=val1+val2;
        int mul=val1*val2;
        return  sum;
    }


}
