package com.grupo3.tallerSofka.compraVenta.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.Compra;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.Venta;

import java.util.Objects;

public class DatosModificados extends DomainEvent {

    private Compra compra;
    private Venta venta;

    public DatosModificados(Compra compra){
        super("compraVenta.cotizacion.datosModificados");
        this.compra = compra;
    }

    public DatosModificados(Venta venta){
        super("compraVenta.cotizacion.datosModificados");
        this.venta = venta;
    }

    public Compra getCompra() throws Exception {
        if (Objects.isNull(this.compra)){
            throw new Exception("No se ha asignado una compra");
        }
        return this.compra;
    }

    public Venta getVenta() throws Exception{
        if(Objects.isNull((this.venta))){
            throw new Exception("No se ha asignado una venta");
        }
        return this.venta;
    }
}
