/*

In order to win the prize for most cookies sold, my friend Alice and I are going
to merge our Girl Scout Cookies orders and enter as one unit.
Each order is represented by an "order id" (an integer).

We have our lists of orders sorted numerically already, in arrays. Write a 
function to merge our arrays of orders into one sorted array.

For example:

int[] myArray     = new int[]{3, 4, 6, 10, 11, 15};
int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

System.out.println(mergeArrays(myArray, alicesArray));
prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]

 */
package mergesortedarrays;

/**
 *
 * @author Ali
 */
public class MergeSortedArrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] myArray     = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
        
        int[] merged = mergeArrays(myArray, alicesArray);
        
        for (int i : merged)
        {
            System.out.print(i+" ");
        }
    }
    
    private static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1+len2];
        
        if (len1 == 0 && len2 == 0)
            return result;
        else if (len1 == 0)
            return arr2;
        else if(len2 == 0)
            return arr1;
        
        int j = 0;
        int k = 0;
        for (int i=0; i<result.length; i++)
        {
            if (j<len1 && k<len2 && arr1[j] < arr2[k])
            {
                result[i] = arr1[j];
                j++;
            }
            else
            {
                result[i] = arr2[k];
                k++;
            }
        }
        
        return result;
    }
    
}
