/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;
import java.util.Date;
public class Task {
    private String description;
    private boolean Done;
    private String title;
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String desription) {
        this.description = desription;
    }
    
    public boolean isDone() {
        return Done;
    }
    public void setDone(boolean isDone) {
        this.Done = isDone;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){
        return title + "#" + description;
    }
    
}
