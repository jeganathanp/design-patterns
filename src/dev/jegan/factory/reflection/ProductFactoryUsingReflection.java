package dev.jegan.factory.reflection;

import dev.jegan.factory.model.product.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public class ProductFactoryUsingReflection {

    private static ProductFactoryUsingReflection factory = new ProductFactoryUsingReflection();

    private Map<Integer, Class<? extends Product>> map = new HashMap();
    public void registerProduct(Integer id, Class product){
        map.put(id, product);

    }

    public static ProductFactoryUsingReflection getInstance(){
        return  factory;
    }

    public Product getProduct(int id) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class productClass = map.get(id);
        Constructor productConstructor = productClass.getDeclaredConstructor(new Class[] {});
        return (Product)productConstructor.newInstance(new Object[] { });
    }
}
