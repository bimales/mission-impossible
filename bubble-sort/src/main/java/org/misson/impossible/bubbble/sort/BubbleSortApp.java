package org.misson.impossible.bubbble.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class BubbleSortApp {

    public static void main(String[] args) {
        int[] array = {1, 7, 3, 2, 6, 5, 4};
        int[] sortedArray = bubbleSort( array);
        Arrays.stream(sortedArray).boxed().forEach(System.out::println);
    }

    private static int[] bubbleSort(int[] array) {
        for(int i=0; i < array.length-1; i++){
            for (int j=i+1; j <= array.length-1; j++){
                if (array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
