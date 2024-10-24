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
