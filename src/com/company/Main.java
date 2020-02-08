package com.company;

import java.util.Arrays;

import static com.company.MergeSort.printArray;

public class Main {

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

        int array[] = {64, 34, 25, 12222, 22, 11, 90};
        SelectionSort ob1 = new SelectionSort();
        ob1.sort(array);
        System.out.println("Sorted array");
        ob1.printArray(array);

        int arrax[] = { 12, 11, 13, 5, 6 };
        System.out.println("Sorted array");

        InsertionSort ob2 = new InsertionSort();
        ob2.sort(arrax);
        InsertionSort.printArray(arrax);

        int arrayM[] = {12, 11, 13, 5, 6, 7};

        MergeSort ob3 = new MergeSort();
        ob3.sort(arrayM, 0, arrayM.length-1);

        System.out.println("\nSorted array");
        printArray(arrayM);


        int arrayQ[] = {10, 7, 8, 9, 1, 5};
        int n = arrayQ.length;

        QuickSort ob4 = new QuickSort();
        ob4.sort(arrayQ, 0, n-1);

        System.out.println("sorted array");
        printArray(arrayQ);

        int arrayH[] = {12, 11, 13, 5, 6, 7};


        HeapSort ob5 = new HeapSort();
        ob5.sort(arrayH);

        System.out.println("Sorted array is");
        printArray(arrayH);

        int arrayS[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arrayS);

        ShellSort ob6 = new ShellSort();
        ob6.sort(arrayS);

        System.out.println("Array after sorting");
        printArray(arrayS);


//        Arrays.sort(arrayH); for java own implementation which use both quick and merge sort
    }


}
