package com.hiyia.se.sort;

/**
 * 快速排序
 * 
 * @author zjq
 *
 */
public class FastSort implements ISort
{
    @Override
    public void sort(int[] source)
    {
        quickSort(source, 0, source.length - 1);
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivotKey = arr[left];
        int pivotPointer = left;
        while (left < right)
        {
            while (left < right && arr[right] >= pivotKey)
                right--;
            while (left < right && arr[left] <= pivotKey)
                left++;
            swap(arr, left, right);
        }
        swap(arr, pivotPointer, left);
        return left;

    }

    private static void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left >= right)
            return;
        int pivotPos = partition(arr, left, right);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);

    }
}
