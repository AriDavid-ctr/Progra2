/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase;

/**
 *
 * @author umg
 */
public class Memo extends Documento{
    private int numeroPaginas;
    public memo(String nombre,int numeroPaginas){
        super(nombre);
        this.nueroPaginas=numeroPaginas;
    }
    public void mostrarMemo(){
        System.out.println();
    }
}
