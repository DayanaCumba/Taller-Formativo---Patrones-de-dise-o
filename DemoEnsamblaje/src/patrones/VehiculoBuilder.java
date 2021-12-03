/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author dayana michelle
 */
public abstract class VehiculoBuilder {
    // Declaramos la referencia del producto a construir
    protected Vehiculo v;
 
    // Declaramos el método que recuperará el objeto
    public Vehiculo GetVehiculo()
    {
        return v;
    }
 
    //region Métodos Abstractos
 
    public abstract void DefinirVehiculo();
    public abstract void ConstruirHabitaculo();
    public abstract void ConstruirMotor();
    public abstract void DefinirExtras();
 
    //endregion
}

