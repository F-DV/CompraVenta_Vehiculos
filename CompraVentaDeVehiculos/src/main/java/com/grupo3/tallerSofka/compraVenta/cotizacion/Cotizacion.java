package com.grupo3.tallerSofka.compraVenta.cotizacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.grupo3.tallerSofka.compraVenta.cotizacion.events.DatosModificados;
import com.grupo3.tallerSofka.compraVenta.cotizacion.events.IntencionModificada;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.*;

import java.util.List;
import java.util.Objects;

public class Cotizacion extends AggregateEvent<CotizacionId> {

    protected Compra compra;
    protected Venta venta;
    protected AtencionAlClienteId atencionAlClienteId;
    protected VehiculoId vehiculoId;

    public Cotizacion (CotizacionId entityId, Compra compra){
        super(entityId);
        appendChange(new DatosModificados(compra)).apply();
    }

    public Cotizacion (CotizacionId entityId, Venta venta){
        super(entityId);
        appendChange(new DatosModificados(venta)).apply();
    }

    private Cotizacion (CotizacionId entityId){
        super(entityId);
        subscribe(new CotizacionChange(this));
    }

    public static Cotizacion from(CotizacionId entityId, List<DomainEvent> events){
        Cotizacion cotizacion = new Cotizacion(entityId);
        events.forEach(cotizacion::applyEvent);
        return cotizacion;
    }

    public void modificarDatos(Compra compra){
        Objects.requireNonNull(compra);
        appendChange(new DatosModificados(compra)).apply();
    }

    public void modificarDatos(Venta venta){
        Objects.requireNonNull(venta);
        appendChange(new DatosModificados(venta)).apply();
    }

    public void modificarIntencion(boolean intencion){
        Objects.requireNonNull(intencion);
        appendChange(new IntencionModificada(intencion)).apply();
    }
}
