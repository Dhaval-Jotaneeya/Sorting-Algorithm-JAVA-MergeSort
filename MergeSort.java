
class Merge
{
    void MergeTwoArray(int left[], int right[] , int Array[] )
    {
        int leftLength = left.length;
        int rightlength = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < leftLength && j < rightlength )  
        {
            if ( left[i] <= right[j] ) 
            {
                Array[k] = left[i];
                i++;
                k++;    
            } 
            else 
            {
                Array[k] = right[j];
                j++;
                k++;    
            }
        }
        while ( i < leftLength ) 
        {
            Array[k] = left[i];
            i++;
            k++;     
        }
        while ( j < rightlength ) 
        {
            Array[k] = right[j];
            j++;
            k++;    
        }
    }

    int[] sorting( int Array[] )
    {
        int length = Array.length;

        if ( length < 2 ) 
        {
            return Array;
        }
        else
        {
            int middle = length/2 ;

            int left[] = new int[middle];
            int right[] = new int[length - middle];
    
            for (int i = 0; i < middle; i++) {
                left[i] = Array[i];
            }
    
            for (int i = middle; i < length ; i++) {
                right[i-middle] = Array[i];
            }
    
            sorting(left);
            sorting(right);
            MergeTwoArray(left, right, Array);
            
            return Array;
        }
        
    }
}

/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        
        int Array[] = {1,5,9,2,6,3,4,8,7};
        Merge m1 = new Merge();
        long startTime = System.nanoTime();
        int sortedArray[] = m1.sorting(Array);
        long endTime = System.nanoTime();
        for (int i = 0; i < 9; i++) 
        {
            System.out.println(sortedArray[i]);
        }        
        System.out.println("Total Time in Neno Second: "+ (endTime-startTime));


    }
}