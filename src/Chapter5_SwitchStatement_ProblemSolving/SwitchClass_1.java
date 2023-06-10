package Chapter5_SwitchStatement_ProblemSolving;

public class SwitchClass_1 {
    public static void main(String[] args){

    int number =30;
    String size;

    switch(number){

        case 29:
            size="Small";
            break;

        case 42:
            size="Medium";
            break;

        case  48:
            size="Large";
            break;

        case  50:
         size="Extra Large";
            break;
        default:
            size="Unknown";
            break;
    }

        System.out.println("Size is ::"  + size);

    }
}
