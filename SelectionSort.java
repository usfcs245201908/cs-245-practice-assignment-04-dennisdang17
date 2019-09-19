public class SelectionSort implements SortingAlgorithm
{
    public void sort(int[]a)
    {   
        for (int i=0; i<a.length;i++)
        {
            swap(a,i,findMin(a, i));
        }
    }
    
    public void swap(int[] a, int i, int j)
    {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int findMin(int[] a, int start)
    {
        int min = start;
        for (int i=start; i< a.length; i++)
        {
            if (a[i] < a[min])
            {
                min = i;
            }
        }
        return min;
    }
}