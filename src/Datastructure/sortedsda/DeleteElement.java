package Datastructure.sortedsda;


public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int n = arr.length;
        int key = 30;
        int i;
        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Function call
        n = deleteTheElement(arr, n, key);

        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    static int deleteTheElement(int[] arr, int n, int key) {
        int pos = searchPosition(arr,0, n-1, key);
        if(pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        int i ;
        for(i = pos; i< n-1; i++)
            arr[i] = arr[i+1];
        return n- 1;

    }

    static int searchPosition(int[] arr,int low, int high, int key) {
        if(high<low)
            return -1;
        int mid = (low + high) / 2;
        if(key == arr[mid])
            return mid;
        if(key > arr[mid])
            return searchPosition(arr, mid+1, high, key);
        return searchPosition(arr, low, mid -1,  key);
    }
}
