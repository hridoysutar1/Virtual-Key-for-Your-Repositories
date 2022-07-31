package LockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionPresent {
    public static void inputAfterWelcome(){
        boolean runornot=true;
        do {

        Scanner sc=new Scanner(System.in);

        try {
            display.showMainMenu();
            int userInput=sc.nextInt();
            switch (userInput) {
                case 1:
                    OperationOfFiles.showFiles("main");
                    break;
                case 2:
                  OptionPresent.fileMenu();
                    break;
                case 3:
                    System.out.println("You are Exited from program ");
                    runornot=false;
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(" OOPS! Select correct option");
            }

        }catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println("Wrong input type try again");
            inputAfterWelcome();
        }
        }while (runornot==true);


    }
    public static void fileMenu(){
        boolean runornot=true;

        do {

            Scanner scan=new Scanner(System.in);

            try {
                display.showFileOperationMenu();
                int option=scan.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Enter file name to be added in main folder");
                        String filename=scan.next();
                        OperationOfFiles.createFile(filename);

                        break;
                    case 2:
                        System.out.println("Enter file to be deleted from main");
                        String name= scan.next();
                        Boolean deletedornot =OperationOfFiles.deleteFile(name,"main");
                        if (deletedornot){
                            System.out.println("Deleted successfully");
                        }
                        else {
                            System.out.println("Unsuccessful to delete. File not found");
                        }
                        break;
                    case 3:
                        File mainfile=new File("main");
                        System.out.println("Enter file name to be searched from main folder");

                        String toBeSearched=scan.next();
                        String s=OperationOfFiles.getFile(toBeSearched,"main");
                        System.out.println(s);
                        break;
                    case 4:
                       return;

                    case 5:
                        System.out.println("You are Exited from program successfully ");
                        runornot=false;
                        scan.close();
                        System.exit(0);
                    default:
                        System.out.println(" Invalid option");
                }

            }catch (Exception e){
                System.out.println(e.getClass().getName());
                System.out.println(" Wrong input type try again");
                fileMenu();
            }

        }while (runornot==true);
    }

}
