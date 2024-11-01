public class As5_Haiku {

    public static String[] haiku = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem1.txt");

    public static void run(){
        System.out.println("ORIGINAL HAIKU");
        for (int i = 0; i < haiku.length; i++) {
            System.out.println(haiku[i]);
        }
        MySort.insertionSortString(haiku);

        System.out.println("\nSORTED HAIKU");
        for (int i = 0; i < haiku.length; i++) {
            System.out.println(haiku[i]);
        }

        MySort.insertionSortString(haiku);

    }//run

}//class
