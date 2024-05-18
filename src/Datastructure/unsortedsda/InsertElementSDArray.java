package Datastructure.unsortedsda;

public class InsertElementSDArray {

    static int insertElement(int[] arr, int n, int key, int capacity) {
        if (n >= capacity)
            return n;
        arr[n] = key;
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        int n = 6;
        int key = 70;
        int capacity = 10;
        System.out.print("Before insertion :");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i]+ "  ");
        n = insertElement(arr, n, key, capacity);
        System.out.print(" \n After insertion :");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i]+ "  ");

    }
}
