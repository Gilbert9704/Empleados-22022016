/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Estudiante
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado(1,0,100);
        Empleado e2 = new Empleado(2,0,100);
        Empleado e3 = new Empleado(3,0,100);
        System.out.println("Empleado a queine desea adicionar horas");
        int id = 1.nextInt();
        
        if (e1.obtenerIdentificacion() == id){
            e1.anadirHoras(100);
        } else if(obtenerIdentificacion() == id){
            e2.anadirHoras(100);
        } else if (){
            
        }
    }
    
}
