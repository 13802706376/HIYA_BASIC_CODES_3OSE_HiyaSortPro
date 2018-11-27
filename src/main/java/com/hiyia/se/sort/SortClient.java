package com.hiyia.se.sort;


public class SortClient
{

    /**
     * 　(1)、插入排序：直接插入排序、二分法插入排序、希尔排序。
    　　(2)、选择排序：简单选择排序、堆排序。
    　　(3)、交换排序：冒泡排序、快速排序。
    　　(4)、归并排序
    　　(5)、基数排序
     * @param args
     */
    public static void main(String[] args)
    {
        
        //匿名实现类排序
        SortContext.sort(s -> {    }  ,  ISort.sourceArray);
        
        //冒泡排序
        SortContext.sort((ISort)new SortProxy<ISort>(SortFactory.getSortInstance("Bubble")).getProxy() , ISort.sourceArray);
        
        //选择排序
        SortContext.sort((ISort)new SortProxy<ISort>(SortFactory.getSortInstance("Choose")).getProxy() ,  ISort.sourceArray);
        
        //快速排序
        SortContext.sort((ISort)new SortProxy<ISort>(SortFactory.getSortInstance("Fast")).getProxy() ,  ISort.sourceArray);
        
        //插入排序
        SortContext.sort((ISort)new SortProxy<ISort>(SortFactory.getSortInstance("Insert")).getProxy() ,  ISort.sourceArray);
        
        //希尔排序
        SortContext.sort((ISort)new SortProxy<ISort>(SortFactory.getSortInstance("Hill")).getProxy() ,  ISort.sourceArray);
    }
}
