package com.grupo3.tallerSofka.compraVenta.cotizacion.values;

import co.com.sofka.domain.generic.Identity;

public class AtencionAlClienteId extends Identity {

    public AtencionAlClienteId(){

    }

    private AtencionAlClienteId(Long id){
        super(String.valueOf(id));
    }

    public static AtencionAlClienteId of(Long id){
        return new AtencionAlClienteId(id);
    }
}
