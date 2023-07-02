package Chapter11_ArrayList_ProblemSolving;
import java.util.ArrayList;
public class ArrayList_1 {
    public static void main(String[] args) {
        //ArrayList<Type>arrayList= new ArrayList<>();

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        ArrayList<String>  languages= new ArrayList<String>();
        //Adding the elements
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("swift");
        System.out.println(languages);

        //Accessing the elements
        String str=languages.get(1);
        String str1=languages.get(2);
        String str2=languages.get(3);

        //How to change
        languages.set(2,"c++");
        System.out.println(languages);

        //Remove the element
        languages.remove(2);
        System.out.println(languages);
        System.out.println(languages.size());

        //Iteration or Traversing
        for(String language:languages){
            System.out.println(language);
        }
    }
}
