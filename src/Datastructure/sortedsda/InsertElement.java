package Datastructure.sortedsda;

public class InsertElement {

    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 50;
        int n = 5;
        int key = 20;
        int capacity = arr.length;
        System.out.print("Before insertion :");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
        n  = insertElement(arr, n, key, capacity);
        System.out.print(" \n After insertion :");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");


    }

    static int insertElement(int[] arr, int n, int key, int capacity) {
        if (n >= capacity)
            return n;
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i+1] = arr[i];
        arr[i +1] = key;
        return n + 1;
    }
}
