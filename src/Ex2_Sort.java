public class Ex2_Sort {
    public static void run() {

        System.out.println("Sorting Algorithms");

        String[] allCountries = MyFiles.loadStringArr("IntelliJ_DataSet/Populations/countries.txt");
        System.out.println(allCountries.length);
        int[] allPops = MyFiles.loadIntArr("IntelliJ_DataSet/Populations/populations.txt");

//        for (String country : allCountries) {
//            System.out.println(country);
//        }//for each

//        for (int pop : allPops) {
//            System.out.println(pop);
//        }//for each


        //find and print the country with the lowest population
        int lowestIndex = 0;

        for (int i = 0; i < allPops.length; i++) {
            if(allPops[i] < allPops[lowestIndex]){
                lowestIndex = i;
            }

        }//for i

//        System.out.println(allCountries[lowestIndex]);
//        System.out.println(allPops[lowestIndex]);

        MySort.selectionSortIntArray(allPops);

        for (int i = 0; i < allPops.length; i++) {
            System.out.println(allCountries[i] + "   " + allPops[i]);
        }

    }

}
