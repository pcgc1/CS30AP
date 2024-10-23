import java.util.Scanner;

public class As4_BinarySearch {
    public static Scanner input = new Scanner(System.in);
    public static String[] allAnimals = {"Abalone", "Anemone", "Blue Whale", "Clownfish", "Dugong", "Geoduck", "Hermit Crab", "Jellyfish", "Kelp", "Shrimp"};
    public static String[] allTypes = {"Mollusk", "Invertebrate", "Whale", "Fish", "Whales", "Clam", "Crustacean", "Invertebrate", "Plant", "Crustacean"};
    public static boolean[] allEndanger = {true, false, true, false, true, false, false, false, true, true};


    public static void run(){

        for (String names: allAnimals) {
            System.out.println(names);
        }

        System.out.println("Enter a sea creature from the list above");
        String creature = input.nextLine();



    }//run


}//class
