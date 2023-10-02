package Sorting;

public class Sorting {
    static void bubbleS(int arr[], int n){
        int i = 0, j, temp;
        boolean swapped;
        for (i=0; i < n-1; i++){
            swapped = false;
            for (j=0; j < n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
    static void printArr(int arr[], int size){
        int i;
        for (i=0; i < size; i++)
            System.out.println(arr[i]+" ");
        System.out.println();
    }
}
