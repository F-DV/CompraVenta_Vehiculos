package com.grupo3.tallerSofka.compraVenta.atencion_al_cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;
import com.grupo3.tallerSofka.compraVenta.atencion_al_cliente.Values.Atencion_Al_ClienteId;

public class Atencion_Al_Cliente extends AggregateEvent<Atencion_Al_ClienteId>{

    protected  Asesor asesor;
    protected Sucursal sucursal;
    protected PQRS pqrs;

    public Atencion_Al_Cliente(Atencion_Al_ClienteId entityId, Asesor asesor,Sucursal sucursal, PQRS pqrs) {
        super(entityId);
    }
}
