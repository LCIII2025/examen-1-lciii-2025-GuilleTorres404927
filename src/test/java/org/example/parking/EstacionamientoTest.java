package org.example.parking;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class EstacionamientoTest {

    @Test
    public void testRetirarVehiculo() throws Exception {
        //TODO test
        Estacionamiento estacionamiento = new Estacionamiento();
        Vehiculo vehiculo = new Vehiculo("TEP123", "Toyota", Vehiculo.Tipo.AUTO);
        estacionamiento.ingresarVehiculo("33456568", "Pedro López", vehiculo);
        estacionamiento.retirarVehiculo("TEP123");
        estacionamiento.retirarVehiculo("TEP123");
    }

    @Test
    public void testCalcularPrecio() throws Exception {
        // TODO test

    }

}