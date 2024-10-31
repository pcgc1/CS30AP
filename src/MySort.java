public class MySort {

    //Selection sort algorithms

    public static void selectionSortIntArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] < arr[lowestIndex]){
                        lowestIndex = j;
                    }
                }

            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }//end for i
    }//selection sort int



    public static void selectionSortStringArray(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if( arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0 ){
                    lowestIndex = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }
    }//selection sort string


//copy pasted from stack overflow https://www.geeksforgeeks.org/insertion-sort-algorithm/
    public static void insertionSortString(String[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }//insertion sort string


//    public static void selectionSortStringArray(String[] arr){
//        for(int i=0; i<arr.length-1; i++){
//            int lowestIndex = i;
//            for(int j=i+1; j<arr.length; j++){
//                if( arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0 ){
//                    lowestIndex = j;
//                }
//            }
//
//            String temp = arr[i];
//            arr[i] = arr[lowestIndex];
//            arr[lowestIndex] = temp;
//
//        }
//    }//selection sort string


}
