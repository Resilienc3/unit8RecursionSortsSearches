import java.util.Arrays;
/**
 * Write a description of class SelectionSorter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSorter
{
    public static void sort(int[] a)
    {
        // repeatedly scan the unsorted portion of the array for the next 
        // smallest value and swap it with the elemeht as the beginning
        // of the unsorted portion of the array
        for(int i = 0; i< a.length - 1; i++)
        {
            int smallestValue = a[i];
            int indexOfSmallestValue = i;

            // scan through unsorted portion of the array and find the
            // smallest value; update the smallest value and the index of
            // that elemnt
            for(int j = i; j < a.length; j++)
            {
                if( a[j] < smallestValue)
                {
                    smallestValue= a[j];
                    indexOfSmallestValue = j;
                }
            }
            int temp = a[i];
            a[i] = a[indexOfSmallestValue];
            a[indexOfSmallestValue] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[20];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int) (Math.random() * 100);
        }
        
        System.out.println(Arrays.toString(a));
        
        sort(a);
        
        System.out.println(Arrays.toString(a));

    }
}
