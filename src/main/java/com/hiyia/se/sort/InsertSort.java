package com.hiyia.se.sort;

/**
 * 插入排序 
 * @author zjq 
 *
 */
public class InsertSort implements ISort
{
    @Override
    public void sort(int[] source)
    {
        for (int i = 1; i < source.length; i++)
        {
            int temp = source[i];
            int j;
            for (j = i - 1; j >= 0; j--)
            {
                if (source[j] > temp)
                {
                    source[j + 1] = source[j];
                } else
                {
                    break;
                }
            }
            source[j + 1] = temp;
        }
    }
}
