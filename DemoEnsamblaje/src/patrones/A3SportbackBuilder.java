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
public class A3SportbackBuilder extends VehiculoBuilder{
    public  void DefinirVehiculo()
    {
        v = new Vehiculo();
        v.marca = "Audi";
        v.modelo = "A3 Sportback";
    }
 

 
    // Método que construirá el motor
    public void ConstruirMotor()
    {
        v.motor = new MotorDiesel();
    }
 
    // Método que construirá el habitaculo
    public void ConstruirHabitaculo()
    {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "deportivo";
        v.tipoCarroceria.habitaculoReforzado = true;
        v.tipoCarroceria.material = "fibra de carbono";
        v.color = "plata cromado";
    }
 
    public void DefinirExtras()
    {
        v.direccionAsistida = true;
        v.direccionAsistida = true;
    }

}
