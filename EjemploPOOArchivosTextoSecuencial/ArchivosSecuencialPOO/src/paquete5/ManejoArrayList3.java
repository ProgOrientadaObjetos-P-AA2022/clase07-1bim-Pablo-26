/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(8.5, "Programacion" );
        Calificacion c2 = new Calificacion(7.75, "Matemáicas");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        
        System.out.println("-----------------------------");
        
        // ArrayList
        //ArrayList <Profesor> profesores2 = new ArrayList<>();
        //profesores2.add(prof1);
        //profesores2.add(prof2);
        ArrayList <Calificacion> calificaciones2 = new ArrayList<>();
        calificaciones2.add(c1);
        calificaciones2.add(c2);
        
        
        for (int i = 0; i < calificaciones2.size(); i++) {
            //nombre del profe, nombre de la materia, nota
            //System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
            //        profesores2.get(i).obtenerTipo());
            Calificacion c = calificaciones2.get(i);
            System.out.printf("%s - %s - %.2f\n",
                    c.obtenerProfesor().obtenerNombre() , 
                    c.obtenerNombreMateria(),
                    c.obtenerNota());
        }
    }
}
