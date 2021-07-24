package com.bridgelabz;


public class InventoryDetails {
    String name;
    long weight;
    long price_per_kg;

    public InventoryDetails(String name, long weight, long price_per_kg)
    {
        this.name = name;
        this.weight = weight;
        this.price_per_kg = price_per_kg;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getWeight()
    {
        return weight;
    }
    public void setWeight(long weight) {this.weight = weight; }
    public long getPrice_per_kg()
    {
        return price_per_kg;
    }
    public void setPrice_per_kg(long price_per_kg) { this.price_per_kg = price_per_kg; }
}
