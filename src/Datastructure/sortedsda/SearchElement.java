package Datastructure.sortedsda;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length - 1;
        int key = 30;

        System.out.println("Index Searching "+searchElement(arr, 0, n, key));
    }

    static int searchElement(int[] arr, int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return searchElement(arr, (mid + 1), high, key);

        return 0;
    }
}
