
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**s
 *
 * @author liesko3
 */
public class Program {
 private Floor flor;

    public Program(Floor flor) {
        this.flor = flor;
    }
    public Program() {
    }
    /*
    
    */
    public void isSaved(){}
     public void start(){}
     public void isValid(){}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.flor);
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
        final Program other = (Program) obj;
        if (!Objects.equals(this.flor, other.flor)) {
            return false;
        }
        return true;
    }
     
     
}
