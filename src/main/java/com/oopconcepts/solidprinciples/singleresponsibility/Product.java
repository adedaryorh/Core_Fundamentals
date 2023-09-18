package com.oopconcepts.solidprinciples.singleresponsibility;
/*
       * The “S” in SOLID stands for Single Responsibility. The principle states that each class should only have one single responsibility. This serves a few purposes:

       1) To keep code loosely coupled
       2) It makes code easier to test. If a class has one single responsibility, it’s easier to write tests that cover one specific responsibility and can help identify bugs early on.
       3) Easier to maintain. When a class has multiple responsibilities, any changes that are made to the class can affect other parts of the class, leading to unexpected bugs
       4) Encourages code reuse. When you break the code up into different components, it allows it to be reused and not re-written over and over again

       Take a look at the product class within this package. Let’s say that we’re selling an online product, for example. For the class fields, each product has a name, price, and a weight. Each product has two methods:

       1) Calculate shipping costs
       2) calculate profit margin

       This example violates the single responsibility rule because the class has too many responsibilities. It holds the data of a product, calculates shipping, and the profit margin.

       It would be better to separate the two methods into separate classes, in keeping with SOLID principles. That way, if you need to make a change on how shipping is calculated, you would only need to go to the shipping calculator class and make those changes.

       *
       *
       *
       *
        */
public class Product {
    private String name;
    private int price;
    private double weight;


    Product(String name, int price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double calculateShipping(Product product, double weight, String destination, int numberOfUnits){
        //return the shipping cost based on the weight of the product and it's destination
        return 200.00;
    }

    public double calculateProfitMargin(Product product, int numberOfUnitsSold, double pricePerUnit, double TotalExpenses){
        //return the profit margin of the product based on the revenue  minus the expenses
        return 200.00;
    }

    public static void main(String[] args) {
    }

}
