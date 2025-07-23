/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase;

/**
 *
 * @author umg
 */
public class Carta extends Documento {
    private String fecha;
    private String destinatario;
    public carta(String nombre,String fecha,String destinatario){
        super(nombre);
        this.fecha=fecha;
        this.destinatario=destinatario;
    }public void mostrarCarta(){
        System.out.println("Carta: "+ getNombre()+" fecha: "+fecha+" destinatario: "+destinatario);
    }
}
