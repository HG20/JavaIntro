package com.company;

/**
 * Created by HoreaGinsca20 on 04/11/2015.
 */
import java.util.ArrayList;
import java.util.List;

public class NameList {

    public static List<String> nameList;




    public static void main(String[] args) {

        nameList = new ArrayList<String>();

        addNameToList("Horea");
        addNameToList("Gigel");
        updateNametoList("Maria");

        printAllNames();

        removeNameFromList("Gigel");

        printAllNames();
        addNameToList("Gigel");
        changeNameInList("Gigel", "NewGigel");
        printAllNames();

    }

    public static void addNameToList(String name){
        nameList.add(name);
    }

    public static void removeNameFromList(String name){
        nameList.remove(name);
    }
    public static void updateNametoList (String name) {
        nameList.add(name);

    }

    public static void printAllNames(){
        System.out.println("-------------names begin-------------");
        for(String name : nameList) {
            System.out.println(name);
        }

    }

    public static void changeNameInList(String oldName, String newName){
        nameList.remove(oldName);
        nameList.add(newName);
    }

}