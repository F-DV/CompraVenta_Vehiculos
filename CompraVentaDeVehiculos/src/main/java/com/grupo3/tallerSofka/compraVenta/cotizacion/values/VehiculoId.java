package com.grupo3.tallerSofka.compraVenta.cotizacion.values;

import co.com.sofka.domain.generic.Identity;

public class VehiculoId extends Identity {

    public VehiculoId(){

    }

    private VehiculoId(Long id){
        super(String.valueOf(id));
    }

    public static VehiculoId of(Long id){
        return new VehiculoId(id);
    }
}
