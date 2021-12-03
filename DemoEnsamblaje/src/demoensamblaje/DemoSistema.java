/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoensamblaje;

import java.io.Console;
import patrones.A3SportbackBuilder;
import patrones.CitroenXsaraBuilder;
import patrones.VehiculoDirector;
import sinpatron.Vehiculo;
import sun.tools.java.Environment;

/**
 *
 * @author dayana michelle
 */
public class DemoSistema {

    public static void main(String[] args) throws Exception {
        // Definimos un director, pasándole un constructor de Audi como parámetro
        VehiculoDirector directorAudi = new VehiculoDirector(new A3SportbackBuilder());

// El director construye el vehiculo, delegando en el constructor la tarea de
// creación de cada una de las piezas
        directorAudi.ConstruirVehiculo();

// Obtenemos el vehículo directamente del director, aunque la instancia del vehículo
// se encuentra en el constructor.
        Vehiculo audiA3 = directorAudi.GetVehiculo();

// Repetimos el proceso con un constructor distinto.
        VehiculoDirector directorCitroen = new VehiculoDirector(new CitroenXsaraBuilder());
        directorCitroen.ConstruirVehiculo();
        Vehiculo citroen = directorCitroen.GetVehiculo();

// Mostramos por pantalla los dos vehiculos:

        System.out.println("PRIMER VEHICULO:" + directorAudi);
        System.out.println(audiA3.getPrestaciones());

        System.out.println("SEGUNDO VEHICULO:" + citroen);
        System.out.println(citroen.getPrestaciones());

        
    }
}
