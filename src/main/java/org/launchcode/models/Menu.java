package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=20)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    //constructors
    public Menu() {

    }

    public Menu(String name) {
        this.name = name;
    }

    //methods
    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    public void delItem(Cheese item) { cheeses.remove(item);}

    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

}
