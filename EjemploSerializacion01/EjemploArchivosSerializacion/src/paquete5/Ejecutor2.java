/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.Scanner;

public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "data/hospitales.data";
        System.out.println("Ingrese el hospital a buscar: ");
        String hospital_buscar = sc.nextLine();
        Hospital hospital_bus;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(hospital_buscar);
        lectura.establecerProfesorBuscado();
        hospital_bus = lectura.obtenerProfesorBuscado();
        if(hospital_bus!=null){
            System.out.println(hospital_bus);
        }else{
            System.out.println("Hospital no encontrado");
        }
    }
}
