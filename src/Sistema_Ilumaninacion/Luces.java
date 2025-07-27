/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Ilumaninacion;

/**
 *
 * @author Gloriana
 */
public abstract class Luces {
    //se establece una variable de control utilizable en todas las luces del auto
    private boolean lucesActivas;

    public boolean isLucesActivas() {
        return lucesActivas;
    }
    protected void encenderLuz(){
       this.lucesActivas = false; 
    }
}
    
