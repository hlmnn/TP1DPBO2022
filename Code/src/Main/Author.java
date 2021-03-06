/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author LENOVO
 */
public class Author {
    private int id;
    private String name;
    
    // constructor
    public Author(){}
    public Author(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    // setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
