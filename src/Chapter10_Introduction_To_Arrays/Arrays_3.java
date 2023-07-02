package Chapter10_Introduction_To_Arrays;

//Given an array and then find the maximum element of the array

public class Arrays_3 {
    public static void main(String[] args) {
     int[] arr={10,20,30,40,50};
     minimumEle(arr);
    }

    public static void minimumEle(int[] arr) {

        int min = Integer.MAX_VALUE;
        //int min = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);

    }
}
