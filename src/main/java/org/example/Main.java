package org.example;


public class Main {


    public static  void main(String[] args) {
        Product user = new Product();

        user.setprductId("product");
        user.setProductname("name");
        user.setprice("price");
        user.setquantity("quantity");

        String productId = user.getproductid();
        String name = user.getname;
        String price = user.getprice;
        String quantity = user.getquantity;

        System.outprintln(user.toString());

    }

}

