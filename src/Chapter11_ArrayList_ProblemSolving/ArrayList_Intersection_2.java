package Chapter11_ArrayList_ProblemSolving;

import java.util.ArrayList;

public class ArrayList_Intersection_2 {
    public static void main(String[] args) {

        int[] one ={10,19,20,30,40,40,40,50};
        int[] two={15,16,17,20,25,30,30,40};

        System.out.println(intersection(one,two));
    }

    public static  ArrayList<Integer> intersection(int[] one,int[] two){
        ArrayList<Integer> ans= new ArrayList<>();

        int i=0;
        int j=0;
        while(i<one.length&& j<two.length){

            if(one[i]<two[j]){
                i++;
            }
            else if(one[i]>two[j]){
                j++;
            }

            else{
                ans.add(one[i]);
                i++;
                j++;
            }
        }
        return  ans;
    }
}
