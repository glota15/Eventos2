/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

public class Empresa {
    
    private int numeroDeSillas;
    private string nombreDeLaEmpresa;
    private boolean tienePermisos;

    public Empresa(int numeroDeSillas, string nombreDeLaEmpresa, boolean tienePermisos) {
        this.numeroDeSillas = numeroDeSillas;
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
        this.tienePermisos = tienePermisos;
    }
    
    public void seHaceElEvento (){
        tienePermisos = true;
    }
    
    public void cantidadDeClientes(){
        numeroDeSillas += 10;
    }
    
    public void identidad(){
        nombreDeLaEmpresa = new eventos;
    }

    public void cantidadDeClientes(int nuevaCantidadDeClientes){
        if(nuevaCantidadDeClientes<=this.numeroDeSillas){
            System.out.println("");
        }
    }
   
    public static void main(String[] args) {
       
    }
    
}
