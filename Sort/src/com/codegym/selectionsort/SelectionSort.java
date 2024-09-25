package com.codegym.selectionsort;

public class SelectionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        for (int i = 0; i < SelectionSort.list.length - 1; i++) {
            double currentMin = SelectionSort.list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < SelectionSort.list.length; j++) {
                if (currentMin > SelectionSort.list[j]) {
                    currentMin = SelectionSort.list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                SelectionSort.list[currentMinIndex] = SelectionSort.list[i];
                SelectionSort.list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
    }
}

