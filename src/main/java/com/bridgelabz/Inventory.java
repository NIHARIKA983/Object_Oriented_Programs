package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Inventory {
    public static void main(String[] args)
    {
        try
        {
            //Create a new Gson object
            Gson gson = new Gson();

            //Read the InventoryDetails.json file
            BufferedReader br = new BufferedReader(
                    new FileReader(".\\Data\\InventoryDetails.json"));

            //convert the json to  Java object (InventoryDetails)
            InventoryDetails inventory = gson.fromJson(br, InventoryDetails.class);

            //Printing the Inventory Details
            System.out.println("****Inventory Details****");
            System.out.println(" Name    : "+inventory.getName());
            System.out.println(" Weight      : "+inventory.getWeight());
            System.out.print(" Price_Per_Kg: "+inventory.getPrice_per_kg());
            long value = inventory.getWeight() * inventory.getPrice_per_kg();
            System.out.println("\nvalue for Inventory is"+value);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
