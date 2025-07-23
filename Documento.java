/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase;

/**
 *
 * @author umg
 */
public class Documento {
   private string nombre;
   public Documento(String nombre){
       this.nombre=nombre;
   }
   public void escribir(String texto){
       System.out.println("Escribiendo\"+nombre\\: "+texto );
   }
   public void imprimir(){
       System.out.println("imprimiendo "+nombre );
   }public String getNombre(){
       return nombre;
   }
}
