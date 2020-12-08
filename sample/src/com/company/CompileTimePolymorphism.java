package com.company;
class CompileTimePolymorphism
{
    int mul(int x, int y)
    {
        return x*y;
    }
    int mul(int x, int y, int z)
    {
        return x*y*z;
    }
}
class Demo
{
    public static void main(String[] args)
    {
        CompileTimePolymorphism c = new CompileTimePolymorphism();
        System.out.println(c.mul(4,5));
        System.out.println(c.mul(4,3,2));
    }
}
