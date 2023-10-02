package Sorting;

import java.util.Random;
import java.util.Scanner;

import static Sorting.Sorting.bubbleS;
import  static Sorting.Sorting.printArr;
import static Sorting.UsersOption.sortForUserArray;
import static Sorting.UsersOption.printUserOption;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want enter your own array or random? (choose 1 or 2)");
        System.out.println("1 = your own, 2 = random");

        Scanner c = new Scanner(System.in);
        int ch = c.nextInt();
        if (ch == 2) {
            Random rd = new Random();
            System.out.println("Enter the size: ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("NOT sorted array");
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(100);
                System.out.println(arr[i] + " ");
            }
            System.out.println("---------");
            System.out.println("SORTED array");

            bubbleS(arr, n);
            printArr(arr, n);
        }

        if (ch == 1) {

            System.out.println("Enter the size: ");
            Scanner s1 = new Scanner(System.in);
            int size = s1.nextInt();
            int option[] = new int[size];
            System.out.println(" ");
            System.out.println("Enter the elements: ");
            for (int i = 0; i < size; i++) {
                option[i] = s1.nextInt();
            }

            System.out.println("-----------");
            System.out.println("Your sorted array");
            int m = option.length;
            sortForUserArray(option, m);
            printUserOption(option, m);
        }
    }
}
