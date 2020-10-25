package dev.jegan.creation.singleton;


import java.io.*;

public class Serialization implements Serializable {
    private static Serialization instance = new Serialization();
    private Serialization(){
        System.out.println("Single ton class");
    }

    public static Serialization getInstance(){
        return  instance;
    }

    public Object readResolve(){
        return  getInstance();
    }
    public void doSomething(){
        System.out.println("Some output");

    }
    public static void main(String args[]){
        Serialization object = Serialization.getInstance();
        System.out.println(object.toString());

        String filename = "file.ser";

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        Serialization object1 = null;
        // Deserialization
        try
        {
            /* Reading the object from a file */
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Serialization) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

        System.out.println(object);
        System.out.println(object1);
    }
}
