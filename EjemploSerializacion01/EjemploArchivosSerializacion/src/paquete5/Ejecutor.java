/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospitales.data";

        Hospital h1 = new Hospital("Isidro Ayora", 320, 230000.50);
        Hospital h2 = new Hospital("San Pablo", 215, 125570.80);

        Hospital[] lista = {h1, h2};

        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
