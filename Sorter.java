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

    public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){
  
          int j = i;
          
          while(j > 0 && sort_arr[j-1]>sort_arr[j]){
  
            int key = sort_arr[j];
            sort_arr[j] = sort_arr[j-1];
            sort_arr[j-1] = key;
            j = j-1; 
  
          }
        }
      }

      public static void sort(int array[]){
        sortInsertion(array);
      }

     public static void sortSelection(int array[]){
        sel_sort(array);
     }
}
