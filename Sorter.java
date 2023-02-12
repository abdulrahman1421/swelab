public class Sorter{
    static void sel_sort(int numArray[]) 
    { 
        int n = numArray.length; 
   
        // traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (numArray[j] < numArray[min_idx]) 
                    min_idx = j; 
   
            // swap minimum element with compared element  
            int temp = numArray[min_idx]; 
            numArray[min_idx] = numArray[i]; 
            numArray[i] = temp; 
        } 
    } 
}