package com.bridgelabz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class JSON_Reader_GSON {
    public  void readInventoryJsonFile() throws IOException, ParseException ,org.json.simple.parser.ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(".\\Data\\InventoryDetails.json");
        // Java Object variable
        Object obj = jsonparser.parse(reader);// THis is my Main Object i.e which includes JSONParser, JSONObject, JSONarray
        // JSON Object ( after type casting)
        JSONObject inventoryobj = (JSONObject) obj;// FIle InventoryDetails.json it will pasrse the object to JSONObject
        JSONArray ricearray = (JSONArray) inventoryobj.get("rice");// Will now change JSON Object to JSON Array.
        JSONArray wheatarray = (JSONArray) inventoryobj.get("wheat");
        JSONArray pulsesarray = (JSONArray) inventoryobj.get("pulses");
        System.out.println("Details of rice are:");
        for (int i = 0; i < ricearray.size(); i++) {
            JSONObject riceDetails = (JSONObject) ricearray.get(i);

            String name = (String) riceDetails.get("Name");
            long weight = (long) riceDetails.get("Weight");
            long price_per_kg = (long) riceDetails.get("Price_per_kg");

            System.out.println("Name: " + name);
            System.out.println("weight: " + weight);
            System.out.println("Price_per_kg: " + price_per_kg);

            long ricePrice = weight * price_per_kg;
            System.out.println("total price: "   +  ricePrice);
        }



         System.out.println("\nDetails of wheats are:");
        for (int i = 0; i < wheatarray.size(); i++) {
            JSONObject wheatDetails = (JSONObject) wheatarray.get(i);

            String name = (String) wheatDetails.get("Name");
            long weight = (long) wheatDetails.get("Weight");
            long price_per_kg = (long) wheatDetails.get("Price_per_kg");

            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight);
            System.out.println("Price_per_kg: " + price_per_kg);

            long wheatPrice = weight * price_per_kg;
            System.out.println("total price: " +wheatDetails.get("Name")+"is"+ wheatPrice);
        }



        System.out.println("\nDetails of pulses are:");

        for (int i = 0; i < pulsesarray.size(); i++) {
            JSONObject pulsesDetails = (JSONObject) pulsesarray.get(i);

            String name = (String) pulsesDetails.get("Name");
            long weight = (long) pulsesDetails.get("Weight");
            long price_per_kg = (long) pulsesDetails.get("Price_per_kg");

            System.out.println("Name: " + name);
            System.out.println("weight: " + weight);
            System.out.println("Price_per_kg: " + price_per_kg);

            long pulsesPrice = weight * price_per_kg;
            System.out.println("total price: "   +  pulsesPrice);
        }
    }
    public static void main(String[] args) throws IOException, ParseException,org.json.simple.parser.ParseException{
        JSON_Reader_GSON inventoryDetails = new JSON_Reader_GSON();
        inventoryDetails.readInventoryJsonFile();
    }

}
