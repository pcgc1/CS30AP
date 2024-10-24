import java.util.Scanner;

public class As4_BinarySearch {
    public static Scanner input = new Scanner(System.in);
    public static String[] allAnimals = {"Abalone", "Anemone", "Blue Whale", "Clownfish", "Dugong", "Geoduck", "Hermit Crab", "Jellyfish", "Kelp", "Shrimp"};
    public static String[] allTypes = {"Mollusk", "Invertebrate", "Whale", "Fish", "Mammal", "Clam", "Crustacean", "Invertebrate", "Plant", "Crustacean"};
    public static boolean[] allEndanger = {true, false, true, false, true, false, false, false, true, true};


    public static void run(){

        for (String names: allAnimals) {
            System.out.println(names);
        }

        System.out.println("Enter a sea creature from the list above");
        String creature = input.nextLine();

        int foundIndex = MySearch.binarySearch(allAnimals, creature);
        if(foundIndex == -1){
            System.out.println("Sea creature not found. Try again");
        }else{
            System.out.println("Creature found! A " + allAnimals[foundIndex] + " is a " + allTypes[foundIndex]);
            if(allEndanger[foundIndex]){
                System.out.println("This species is endangered");
            }else{
                System.out.println("This species is not endangered");
            }
        }

    }//run


}//class
