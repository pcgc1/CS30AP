public class MySearch {

    //Binary Search, only works with sorted lists
    //int
    public static int binarySearch(int[] arr, int searchTerm){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (searchTerm == arr[mid]) {
                return mid;
            }else if( searchTerm > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }//binary search

    //double
    public static int binarySearch(double[] arr, double searchTerm){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (searchTerm == arr[mid]) {
                return mid;
            }else if( searchTerm > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }//binary search


    //string
    public static int binarySearch(String[] arr, String searchTerm){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(searchTerm.equalsIgnoreCase(arr[mid])){
                return mid;
            }else if(searchTerm.compareToIgnoreCase(arr[mid]) > 0){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }//binary search




}//class