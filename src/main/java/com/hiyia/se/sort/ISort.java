package com.hiyia.se.sort;

import java.util.Arrays;

@FunctionalInterface
public interface ISort
{
    static int[] sourceArray = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
    
    void sort(int []  source);
    
    default boolean isArrayEmpty2(int[] source)
    {
        if (source == null || source.length == 0)
        {
            return true;
        }
        return false;
    }
    
    static boolean isArrayEmpty(Object[] source)
    {
        if (source == null || source.length == 0)
        {
            return true;
        }
        return false;
    }
    
    static void printArrayBefore(String name,Object[] args)
    {
        System.out.println("--------"+name+"排序之前：" + Arrays.toString((int[])args[0]));
    }
    
    static void printArrayAfter(String name,Object[] args)
    {
        System.out.println("--------"+name+"排序之后：" + Arrays.toString((int[])args[0]));
    }
    
    static void printBlankAfter()
    {
        System.out.println();
    }
}
