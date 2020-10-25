package dev.jegan.behaviour.memento;

public class Main {
    public static void main(String[] args) {
        Originator org = new Originator("state 1");
        Caretaker ct = new Caretaker();
        ct.setState(org.save());

        org.setArticle("state2");
        ct.setState(org.save());
        System.out.println(String.format("Orignator: %s , Caretaker: %s",
                org.getArticle(), ct.getCurrentState()));

        org.setArticle("state3");
        ct.setState(org.save());
        System.out.println(String.format("Orignator: %s , Caretaker: %s",
                org.getArticle(), ct.getCurrentState()));

        org.setArticle("state4");
        ct.setState(org.save());
        System.out.println(String.format("Orignator: %s , Caretaker: %s",
                org.getArticle(), ct.getCurrentState()));

        org.restore(ct.undo());
        org.restore(ct.undo());
        System.out.println(String.format("Orignator: %s ",
                org.getArticle()));

        org.restore(ct.redo());
        System.out.println(String.format("Orignator: %s ",
                org.getArticle()));


    }



}
