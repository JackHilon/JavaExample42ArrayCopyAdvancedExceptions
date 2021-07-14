package MyArray;

public class ArrayHelper {

    public static void ArrayCopy(int[] src, int srcIdx,
            int[] des, int desIndx, int numOfItems)
            throws NullPointerException, ArrayIndexOutOfBoundsException 
    {
        
        if(src==null || des ==null)
            throw new NullPointerException("Null-array: There is no array....");
        
        if(srcIdx<0 || (srcIdx+numOfItems)>src.length
                || desIndx<0 || (desIndx+numOfItems)>des.length)
            throw new ArrayIndexOutOfBoundsException("Index error....");

        int j=desIndx;
        for (int i = srcIdx; i < srcIdx+numOfItems; i++) {
            des[j]=src[i];
            j++;
        }
    }// end ArrayCopy()
    
    public static void PrintArray(int[] a)
            throws NullPointerException
    {
        if(a==null)
            throw new NullPointerException("Null-array: There is no array....");
        
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        
    }// end PrintArray()
}
