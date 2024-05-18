package Datastructure.unsortedsda;

public class DeleteElementSDArray {

    static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    static int deleteElement(int[] arr, int n, int key) {
        int pos = findElement(arr, n, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        return n - 1;

    }

    public static void main(String[] args) {
        int i;
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;
        System.out.print("Before Delete :");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
        n = deleteElement(arr, n, key);

        System.out.print(" \n After Delete :");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + "  ");
    }
}
