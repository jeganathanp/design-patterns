package dev.jegan.creation.factory.simpleMap;

import dev.jegan.creation.factory.model.vechile.Vechile;

import java.util.HashMap;
import java.util.Map;

public class VechileFactory {
    private static VechileFactory vechileFactory = new VechileFactory();
    Map<String, Class<? extends Vechile>> factoryMap = new HashMap<>();

    private VechileFactory(){

    }
    public void registerVechile(String id , Class<? extends  Vechile> vechile){
        factoryMap.put(id,vechile);
    }

    public static VechileFactory getInstance(){
        return vechileFactory;
    }

    public Vechile getVechile(String id) throws IllegalAccessException, InstantiationException {
        Class type = factoryMap.get(id);

        return (Vechile) type.newInstance();
    }
}
