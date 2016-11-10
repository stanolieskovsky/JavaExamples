
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liesko3
 */
public class FilesReader {
private File fileR;
private File fileB;

/*
clas for reading file
*/
    public FilesReader() {
 }
    /*method for reading list of boxes from file */
   public void readBoxes(){}
   /*method for reading of object Room from file*/
   public void readRoom(){}

    public File getFileR() {
        return fileR;
    }

    public void setFileR(File fileR) {
        this.fileR = fileR;
    }

    public File getFileB() {
        return fileB;
    }

    public void setFileB(File fileB) {
        this.fileB = fileB;
    }

    String[] string;

    public static final String PROP_STRING = "string";

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String[] getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String[] string) {
        String[] oldString = this.string;
        this.string = string;
        propertyChangeSupport.firePropertyChange(PROP_STRING, oldString, string);
    }

    /**
     * Get the value of string at specified index
     *
     * @param index the index of string
     * @return the value of string at specified index
     */
    public String getString(int index) {
        return this.string[index];
    }

    /**
     * Set the value of string at specified index.
     *
     * @param index the index of string
     * @param string new value of string at specified index
     */
    public void setString(int index, String string) {
        String oldString = this.string[index];
        this.string[index] = string;
        propertyChangeSupport.fireIndexedPropertyChange(PROP_STRING, index, oldString, string);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
    

