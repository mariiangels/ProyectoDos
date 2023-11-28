/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mari1
 */
public class Actor {
  
    private String nombre;
    private String role;
    
    public Actor(String nombre, String role){
     this.nombre=nombre;
     this.role=role;
     
    }
 
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
 @Override
    public String toString() {
        return String.format("Informacion del actor: ", getNombre(), getRole());
    }  

    
   
    
    
    
    
}
