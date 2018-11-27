package com.hiyia.se.sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SortProxy<T> implements InvocationHandler
{
    private T target;
    
    public SortProxy(T target)
    {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        ISort.printArrayBefore(target.getClass().getSimpleName(), args);
        if (!ISort.isArrayEmpty(args))
        {
            method.invoke(target, args);
            ISort.printArrayAfter(target.getClass().getSimpleName(), args);
            ISort.printBlankAfter();
        }
        return null;
    }
    
    public Object getProxy()
    {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
