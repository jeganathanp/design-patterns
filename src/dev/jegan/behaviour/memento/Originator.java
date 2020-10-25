package dev.jegan.behaviour.memento;

import dev.jegan.behaviour.command.Order;

public class Originator {
    public String article;

    public Originator(String article) {
        this.article = article;
    }

    public void setArticle(String article){
        this.article = article;
    }
    public String getArticle(){
        return article;
    }

    public Memento save(){
        return new Memento(article);
    }

    public void restore(Memento memento){
        setArticle(memento.getState());
    }

}
