/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Encendido;

/**
 *
 * @author Braya
 */
public class Sistema_Encendido {
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }
    
    public Sistema_Encendido() {
        this.encendido = false;
    }
    
    public void encender(){
        this.encendido = true;
    }
    
    public void apagar(){
        this.encendido = false;
    }     
}
