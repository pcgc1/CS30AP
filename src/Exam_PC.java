import java.util.Scanner;

public class Exam_PC {
    public static Scanner input  = new Scanner(System.in);
    public static String[] abbreviation = {"CHF", "CZK", "EUR", "JPY", "MOD"};
    public static String[] longName = {"Swiss Franc", "Czech Koruna", "Euro", "Japanese Yen", "Moroccan Dirham"};
    public static double[] value = {0.65,  13.47,  0.68,  109.97,  7.40};

    public static void run(){

        System.out.println("World Currencies Database");

        while(true){

            System.out.println("\nPress 1 for print all\nPress 2 for find average\nPress 3 for search by value\nPress 4 for search by abbreviation\nPress 5 for filter long names\nPress 6 for sort by values\nPress 7 for print unofficial abbreviations\nPress 8 to exit");
            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                for (int i = 0; i < longName.length; i++) {
                    System.out.println( abbreviation[i] + " " + longName[i] + " " + value[i]);
                }
            }//choice 1

            if(choice == 2){
                double average = 0;
                double total = 0;
                for (int i = 0; i < value.length; i++) {
                    total += value[i];
                }
                average = total/5;
                System.out.println(average);
            }//choice 2

            if(choice == 3){
                System.out.println("What currency do you want to find?");
                double answer = input.nextDouble();
                input.nextLine();

                int foundIndex = searchVal(answer);

                if(foundIndex == -1){
                    System.out.println("Currency not found");
                }else{
                    System.out.println("One Canadian dollar is worth " + value[foundIndex] + " " + abbreviation[foundIndex]);
                }

            }//choice 3

            if(choice == 4){
                System.out.println("What currency do you want to find?");
                String answer = input.nextLine();

                int foundIndex = MySearch.binarySearch(abbreviation, answer);

                if(foundIndex == -1){
                    System.out.println("Currency not found");
                }else{
                    System.out.println("One Canadian dollar is worth " + value[foundIndex] + " " + abbreviation[foundIndex]);
                }
            }//choice 4

            if(choice == 5){
                System.out.println("What do you want to find?");
                String answer = input.nextLine();

                filterSearch(answer);
            }//choice 5

            if(choice == 6){
                selectionSortDouble(value);

                System.out.println("Data sorted by value");
            }//choice 6

            if(choice == 7){
                String[] unofficialAbbreviation = new String[5];

                for (int i = 0; i < longName.length; i++) {
                    unofficialAbbreviation[i] = longName[i].substring(0,3);

                    System.out.println(abbreviation[i] + " " + longName[i] + " " + value[i] + " " + unofficialAbbreviation[i]);
                }
            }//choice 7

            if(choice == 8){
                break;
            }//choice 8

        }//while loop

    }//run

    public static int searchVal(double searchTerm){
        for (int i = 0; i < value.length; i++) {
            if(value[i] ==  searchTerm){
                return i;
            }
        }
        return -1;
    }//linear search for value


    public static void filterSearch(String searchTerm){
        for (int i = 0; i < longName.length; i++) {
            if(longName[i].toLowerCase().contains( searchTerm.toLowerCase() )){
                System.out.println(longName[i]);
            }
        }
    }//filtered search


    public static void selectionSortDouble(double[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int lowestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[lowestIndex]){
                    lowestIndex = j;
                }
            }

            double temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

            String temp2 = longName[i];
            longName[i] = longName[lowestIndex];
            longName[lowestIndex] = temp2;

            String temp3 = abbreviation[i];
            abbreviation[i] = abbreviation[lowestIndex];
            abbreviation[lowestIndex] = temp3;

        }
    }//selection sort for doubles

}//class
