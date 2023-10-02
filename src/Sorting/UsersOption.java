package Sorting;

public class UsersOption {
    static void sortForUserArray(int option[], int m){
        int i = 0, j, temp;
        boolean swapped;
        for (i=0; i < m-1; i++){
            swapped = false;
            for (j=0; j < m-i-1; j++){
                if (option[j]>option[j+1]){
                    temp = option[j];
                    option[j] = option[j+1];
                    option[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

    }
    static void printUserOption(int option[], int size){
        int i;
        for (i=0; i < size; i++)
            System.out.println(option[i]+" ");
        System.out.println();
    }
}
