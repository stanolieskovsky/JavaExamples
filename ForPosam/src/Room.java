
import com.sun.org.apache.xpath.internal.functions.Function;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liesko3
 */
public class Room {
// pole o sirke a dlzke iba jedna instancia
    //ak tam bude # tak v danom mieste vytvorim na indexe hodnotu 
    // ak . - nula
    //ak #-1  a ak 
    //tam vlozim nabytok tak dam 2
    private List<Furniture> FurnitureList;
    private int heightR;
     private int width;
     private int count;
     private String name;
     private int number;
    public Room() {
    }
/*return list of objects type furniture*/
    public List<Furniture> getFurnitureList() {
        return FurnitureList;
    }

    /*set list of objects type furniture*/
    public void setFurnitureList(List<Furniture> FurnitureList) {
        this.FurnitureList = FurnitureList;
    }

    public int getHeightR() {
        return heightR;
    }

    public void setHeightR(int heightR) {
        this.heightR = heightR;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ListIterator<Furniture> listIterator() {
        return FurnitureList.listIterator();
    }

    public Room(List<Furniture> FurnitureList, int heightR, int width, int count) {
        this.FurnitureList = FurnitureList;
        this.heightR = heightR;
        this.width = width;
        this.count = count;
    }
    
    
}
