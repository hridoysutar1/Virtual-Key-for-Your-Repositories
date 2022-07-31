package LockedMe.com;

public class display {
    public static void welcomeScreen(String applicationName, String developerDetails){
        System.out.println("--------------------------------------------------\n                    Welcome");
        System.out.println("This is "+applicationName+" application. It is developed by"+developerDetails);
        System.out.println(" You can perform here :");
        System.out.println("  See all files under main directory \n  File operation menu \n  Close the application");
        System.out.println("--------------------------------------------------");

    }
    public static void showMainMenu(){
        System.out.println("--------------------------------------------------------");
        System.out.println("                  Main Menu");
        System.out.println("        Enter any options number listed below           ");
        System.out.println(" 1. See all files under main directory \n 2. File operation menu \n 3. Close the application");
        System.out.println("----------------------------------------------------------");
    }
    public static void showFileOperationMenu(){
        System.out.println("---------------------------------------------------------");
        System.out.println("        Enter any options number listed below           ");
        System.out.println(" 1. Add a file to the existing directory list \n " +
                "2. Delete a user specified file from the main  directory list \n" +
                " 3. Search a user specified file from the main directory\n" +
                " 4. Previous menu \n" +
                " 5. Exit program");
        System.out.println("--------------------------------------------------------- ");
    }
}
