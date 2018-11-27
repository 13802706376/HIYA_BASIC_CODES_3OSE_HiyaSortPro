package com.hiyia.se.sort;

public class SortFactory
{
    public static ISort getSortInstance(String type)
    {
         switch(type)
         {
             case "Bubble": return new BubbleSort();
             case "Choose": return new BubbleSort();
             case "Hill": return new HillSort();
             case "Insert": return new InsertSort();
             case "Fast": return new FastSort();
             default:return null;
         }
    }
}
