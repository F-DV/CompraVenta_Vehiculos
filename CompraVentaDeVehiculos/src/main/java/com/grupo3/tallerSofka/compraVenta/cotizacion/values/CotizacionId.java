package com.grupo3.tallerSofka.compraVenta.cotizacion.values;

import co.com.sofka.domain.generic.Identity;

public class CotizacionId extends Identity {

    public CotizacionId(){

    }

    private CotizacionId (Long id){
        super(String.valueOf(id));
    }

    public static CotizacionId of(Long id){
        return new CotizacionId(id);
    }
}
