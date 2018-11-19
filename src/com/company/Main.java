package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void selectionSort(int[] arr)
    {
        int start = 0;
        int lowest = 0;
        for(int i = 0; i < arr.length; i++)
        {
            start = i;
            lowest = arr[i];
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < lowest)
                {
                    lowest = arr[j];
                    start = j;
                }
            }
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
    }
    public static void swap(int[] arr, int idx, int idx2)
    {
        int temp = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = temp;
    }
    public static int[] intArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            int randInt = (int)(Math.random() * ((11)));
            arr[i] = randInt;
        }
        return arr;
    }
}
