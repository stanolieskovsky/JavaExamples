
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liesko3
 */
public class Furniture {
    private boolean isIncluded;
    private int[] profile;
    private int height;
    private int width;
    private String name;
    private int weight;
    private int square;
    

    public Furniture() {
    }

    public int[] getProfile() {
        return profile;
    }

    public void setProfile(int[] profile) {
        this.profile = profile;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Arrays.hashCode(this.profile);
        hash = 43 * hash + this.height;
        hash = 43 * hash + this.width;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Furniture other = (Furniture) obj;
        if (!Arrays.equals(this.profile, other.profile)) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        return true;
    }

    public boolean isIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
    
    
}
