import java.util.ArrayList;

public class Basics{

    public static ArrayList<Integer> allOccurence(int arr[], int key, int i ){
        ArrayList<Integer> result = new ArrayList<>();

            //Base Case
            if(i == arr.length){
            return result;
            }


            //Recusive case
            if(arr[i] == key){
            result.add(i);
            }

            //Recurse for the rest of the array
            result.addAll(allOccurence(arr, key, i+1));

            return result;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println(allOccurence(arr, key, 0));
    }
}