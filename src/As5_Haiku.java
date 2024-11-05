import java.util.Scanner;

public class As5_Haiku {

    public static Scanner input = new Scanner(System.in);
    public static String[] haiku1 = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem1.txt");
    public static String[] haiku2 = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem2.txt");
    public static String[] haiku3 = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem3.txt");

    public static void run(){
        System.out.println("Which Haiku do you wish to use? (1, 2, or 3)");
        String[] chosenHaiku = new String[2];
        String chosenFile = "";
        int answer = input.nextInt();
        input.nextLine();

        //choose which haiku to use
        if(answer == 1){
            chosenHaiku = haiku1;
            chosenFile = "IntelliJ_DataSet/HaikuPoem1.txt";
        }else if(answer == 2){
            chosenHaiku = haiku2;
            chosenFile = "IntelliJ_DataSet/HaikuPoem2.txt";
        }else if(answer == 3){
            chosenHaiku = haiku3;
            chosenFile = "IntelliJ_DataSet/HaikuPoem3.txt";
        }else{
            System.out.println("Haiku not found");
        }

        //printing normal and sorted haiku
        System.out.println("ORIGINAL HAIKU");
        for (int i = 0; i < chosenHaiku.length; i++) {
            System.out.println(chosenHaiku[i]);
        }
        MySort.insertionSortString(chosenHaiku);

        System.out.println("\nSORTED HAIKU BY INSERTION");
        for (int i = 0; i < chosenHaiku.length; i++) {
            System.out.println(chosenHaiku[i]);
        }

        //word replace
        System.out.println("What word do you want to replace?");
        String word = input.nextLine();

        System.out.println("What do you want to replace " + word + " with?");
        String replaceWith = input.nextLine();

        for (int i = 0; i < chosenHaiku.length; i++) {
            chosenHaiku[i] = chosenHaiku[i].replace(word, replaceWith);
            System.out.println(chosenHaiku[i]);
        }

        //saving new haiku
        System.out.println("Do you want to save this new haiku? (yes or no)");
        String ans = input.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            MyFiles.saveStringArray(chosenFile, chosenHaiku);
        }else{
            System.out.println("Okay! See you later alligator!");
        }

    }//run

}//class
