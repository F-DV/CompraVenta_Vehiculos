package com.grupo3.tallerSofka.compraVenta.cotizacion.commands;

import co.com.sofka.domain.generic.Command;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.Compra;
import com.grupo3.tallerSofka.compraVenta.cotizacion.values.Venta;

public class ModificarDatos extends Command {

    private Compra compra;
    private Venta venta;

    public ModificarDatos(Compra compra) {
        this.compra = compra;
    }

    public ModificarDatos(Venta venta) {
        this.venta = venta;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
