package com.hiyia.se.sort;

/**
 * 插入排序2
 * 
 * @author zjq
 *
 */
public class HillSort implements ISort
{
    @Override
    public void sort(int[] source)
    {
        int d = source.length;
        while (true)
        {
            d = d / 2;
            for (int x = 0; x < d; x++)
            {
                for (int i = x + d; i < source.length; i = i + d)
                {
                    int temp = source[i];
                    int j;
                    for (j = i - d; j >= 0 && source[j] > temp; j = j - d)
                    {
                        source[j + d] = source[j];
                    }
                    source[j + d] = temp;
                }
            }
            if (d == 1)
            {
                break;
            }
        }
    }
}
