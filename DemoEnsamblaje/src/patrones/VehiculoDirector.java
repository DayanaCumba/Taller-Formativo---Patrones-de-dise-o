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
public class VehiculoDirector {
    private VehiculoBuilder builder;
 
    // Constructor que recibirá un Builder concreto y lo asociará al director
    public VehiculoDirector(VehiculoBuilder builder)
    {
        this.builder = builder;
    }
 
    public void ConstruirVehiculo() throws Exception
    {
        // Construimos el vehiculo definiendo el orden del proceso
        builder.DefinirVehiculo();
        builder.ConstruirHabitaculo();
        builder.ConstruirMotor();
        builder.DefinirExtras();
 
        // Se realizan comprobaciones y validaciones
        if ((builder.GetVehiculo().tipoCarroceria.tipoCarroceria == "deportivo") &&
            (builder.GetVehiculo().direccionAsistida == false))
            throw new Exception("Error en el ensamblado: Un deportivo no puede carecer de direccion asistida");
    }
 
    public Vehiculo GetVehiculo()
    {
        return builder.GetVehiculo();
    }
}
