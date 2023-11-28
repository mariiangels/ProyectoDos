
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mari1
 */
public class Reparto {
    
    private List<Actor> actores;
    
    public Reparto(){
    actores= new ArrayList<>();
    }
      
    public List<Actor> getActores(){
        return actores;
        
    }
    
    public void addActor(Actor actor){
    actores.add(actor);
    
    }
    
    
    
}
