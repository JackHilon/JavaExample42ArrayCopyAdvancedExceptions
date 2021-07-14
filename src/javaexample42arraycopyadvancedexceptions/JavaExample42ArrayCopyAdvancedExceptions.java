
package javaexample42arraycopyadvancedexceptions;

import MyArray.ArrayHelper;


public class JavaExample42ArrayCopyAdvancedExceptions {

    
    public static void main(String[] args) {
        
        int[] v1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[]{11, 22, 33, 44};
        int[] v3 = new int[]{0, 0};
        int[] v4 = new int[]{100, 100, 100, 100, 100, 100};
        int[] v5 = null;
        
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v2, 1, v1, 3, 3);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v3, 6, v1, 2, 1);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v4, 2, v1, 15, 2);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v4, 2, v1, 1, 700);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v1, 1, v5, 3, 2);
        System.out.print("Array v5: ");
        PrintArray(v5);
        System.out.println("---");

        ArrayCopy(v3, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v5, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        ArrayCopy(v3, 300, v5, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v5);
        System.out.println("---");
        
    }
    private static void ArrayCopy(int[] src, int srcIdx,
            int[] des, int desIndx, int numOfItems)
    {
        try{
            ArrayHelper.ArrayCopy(src, srcIdx, des, desIndx, numOfItems);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            return;
        }
    }
    
    private static void PrintArray(int[] a)
    {
        try{
            ArrayHelper.PrintArray(a);
        } catch(Exception e)
        {
            System.out.println(e.toString());
            return;
        }
        
    }// end PrintArray()
    
}
