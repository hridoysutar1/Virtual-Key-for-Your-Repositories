package LockedMe.com;

import java.io.*;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;


public class OperationOfFiles {
    public static void mainFolder(){
        File file=new File("main");
        if (!file.exists()){
            file.mkdir();
        }
    }
    public static void showFiles(String path){
         OperationOfFiles.mainFolder();
        System.out.println("All files under main folder are displayed below ascending order");


        File dir = new File(path);
        File[] files = dir.listFiles();
        List<File> filesList = Arrays.asList(files);

        Collections.sort(filesList);
        for (File file:filesList){
            System.out.println(file.getName());
        }
        System.out.println();
    }

    public static void createFile(String name){
        OperationOfFiles.mainFolder();
        Scanner sc=new Scanner(System.in);
        File myFile=new File("main",name);
        try {
            myFile.createNewFile();
            System.out.println(name+" file created successfully");

        }catch (Exception e){
            System.out.println("Operation Unsuccessful. Failed to create file");
        }

    }

    public static String getFile(String toBeSearched, String path){

        File f=new File(path );

        File [] files=f.listFiles();

        if (files.length>0&&files!=null){
            for (File file: files){
                if (file.getName().equals(toBeSearched)){
                    return ("File "+ toBeSearched+" found at following path \n"+file.getAbsolutePath());
                }
            }
        }
           return "Unsuccessful. File not found";
    }

    public static Boolean deleteFile(String toBeDelete, String path){
        File f=new File(path );

        File [] files=f.listFiles();
        if (files.length>0&&files!=null){
            for(File file:files){
                if (file.getName().equals(toBeDelete)){
                    file.delete();
                   return true;
                }
            }
        }
        return false;
    }

}
