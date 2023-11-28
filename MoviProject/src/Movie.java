/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mari1
 */
public class Movie {

    private Reparto reparto;
    private String titulo;
    private String genero;
    private int fecha;
    
    public Movie(Reparto reparto, String titulo, String genero, int fecha){
        this.reparto=reparto;
        this.titulo=titulo;
        this.genero=genero;
        this.fecha=fecha;
    }
    
   
    
     @Override
    public String toString() {
        return String.format("Informacion de la pelicula: ", getTitulo(),
                getReparto().getActores(), getGenero(), getFecha());
    }  

    /**
     * @return the reparto
     */
    public Reparto getReparto() {
        return reparto;
    }

    /**
     * @param reparto the reparto to set
     */
    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
}
