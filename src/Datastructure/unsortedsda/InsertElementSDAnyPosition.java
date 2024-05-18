package Datastructure.unsortedsda;

public class InsertElementSDAnyPosition {
    static void insertElementAnyPosition(int[] arr, int n, int x, int position) {
        for (int i = n - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
            arr[position] = x;
        }
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
        int x = 70;
        int position = 2;
        System.out.print("Before insertion :");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
        insertElementAnyPosition(arr, n, x, position);
        n += 1;
        System.out.print(" \n After insertion :");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");

    }
}
