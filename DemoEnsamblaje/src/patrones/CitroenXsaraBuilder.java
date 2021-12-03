/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author dayana michelle
 */
public class CitroenXsaraBuilder extends VehiculoBuilder{


    public void DefinirVehiculo()
    {
        v = new Vehiculo();
        v.marca = "Citroen";
        v.modelo = "Xsara Picasso";
    }
 
    public void ConstruirMotor()
    {
        v.motor = new MotorDiesel();
    }
 
    // Método que construirá el habitaculo
    public void ConstruirHabitaculo()
    {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "monovolumen";
        v.tipoCarroceria.habitaculoReforzado = false;
        v.tipoCarroceria.material = "acero";
        v.color = "negro";
    }
 
    public void DefinirExtras()
    {
        v.direccionAsistida = false;
    }
}
    

