package com.grupo3.tallerSofka.compraVenta.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class IntencionModificada extends DomainEvent {

    private final boolean intencion;

    public IntencionModificada(boolean intencion){
        super("compraVenta.cotizacion.datosModificados");
        this.intencion = intencion;
    }

    public boolean isIntencion() throws Exception{
        if(Objects.isNull(this.intencion)){
            throw new Exception("No se ha establecido la intención de comprar o vender");
        }
        return intencion;
    }
}
