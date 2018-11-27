package com.hiyia.se.sort;

/**
 * 冒泡排序
 * 
 * @author zjq
 *
 */
public class BubbleSort implements ISort
{
    @Override
    public void sort(int[] source)
    {
        for (int i = 0; i < source.length; i++)
        {
            for (int j = 0; j < source.length - i - 1; j++)
            {
                if (source[j] > source[j + 1])
                {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
    }
}
