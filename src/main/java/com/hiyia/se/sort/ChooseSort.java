package com.hiyia.se.sort;

/**
 * 选择排序
 * 
 * @author zjq
 *
 */
public class ChooseSort implements ISort
{
    @Override
    public void sort(int[] source)
    {
        for (int i = 0; i < source.length; i++)
        {
            int min = source[i];
            int n = i; 
            for (int j = i + 1; j < source.length; j++)
            {
                if (source[j] < min)
                { 
                    min = source[j];
                    n = j;
                }
            }
            source[n] = source[i];
            source[i] = min;
        }
    }
}
