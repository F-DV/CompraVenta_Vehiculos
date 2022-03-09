package com.grupo3.tallerSofka.compraVenta.cotizacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.grupo3.tallerSofka.compraVenta.cotizacion.events.DatosModificados;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.*;

public class Cotizacion extends AggregateEvent<CotizacionId> {

    protected Compra compra;
    protected Venta venta;
    protected AtencionAlClienteId atencionAlClienteId;
    protected VehiculoId vehiculoId;

    public Cotizacion (CotizacionId entityId, Compra compra){
        super(entityId);
        appendChange(new DatosModificados(Compra compra)).apply();
    }

    public Cotizacion (CotizacionId entityId, Venta venta){
        super(entityId);
        appendChange(new DatosModificados(Venta venta)).apply();
    }
}
