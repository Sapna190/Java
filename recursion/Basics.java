public class Basics{

    public static int allOccurence(int arr[], int key, int i, int j[]){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            j[] = i;
            return j;
        }
        return allOccurence(arr, key, i+1,j);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println(allOccurence(arr, key, 0, j));
    }
}