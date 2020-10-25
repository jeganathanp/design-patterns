package dev.jegan.creation.factory.simple;

import dev.jegan.creation.factory.model.product.Product;
import dev.jegan.creation.factory.model.product.ProductOne;
import dev.jegan.creation.factory.model.product.ProductTwo;

public class SimpleFactory {
    private static  SimpleFactory factory = new SimpleFactory();

    private SimpleFactory(){

    }

    public static SimpleFactory getInstance(){
        return  factory;
    }

    public Product getProduct(int id){
        if (id == 1){
            return  new ProductOne();
        }
        else if (id == 2){
            return  new ProductTwo();
        }
        return  null;
    }
}
