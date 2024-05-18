package Datastructure.unsortedsda;

public class SearchElementSDArray {

    static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 1, 3, 7};
        int n = arr.length;
        int key = 3;
        int position = findElement(arr, n, key);
        if (position == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element  found :    " + (position + 1));
            System.out.println("element  found in position :    " + arr[position]);
        }

    }
}
