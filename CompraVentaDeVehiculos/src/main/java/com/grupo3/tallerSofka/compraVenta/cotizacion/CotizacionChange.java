package com.grupo3.tallerSofka.compraVenta.cotizacion;

import co.com.sofka.domain.generic.EventChange;
import com.grupo3.tallerSofka.compraVenta.cotizacion.events.DatosModificados;
import com.grupo3.tallerSofka.compraVenta.cotizacion.events.IntencionModificada;

public class CotizacionChange extends EventChange {
    public CotizacionChange(Cotizacion cotizacion) {
        apply((DatosModificados event) ->{
            try {
                cotizacion.compra = event.getCompra();
                cotizacion.venta = event.getVenta();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        apply((IntencionModificada event) ->{
            try {
                cotizacion.modificarIntencion(event.isIntencion());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
