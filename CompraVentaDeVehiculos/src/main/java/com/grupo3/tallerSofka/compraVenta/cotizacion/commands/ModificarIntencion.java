package com.grupo3.tallerSofka.compraVenta.cotizacion.commands;

import co.com.sofka.domain.generic.Command;

public class ModificarIntencion extends Command {

    private final boolean intencion;

    public ModificarIntencion(boolean intencion) {
        this.intencion = intencion;
    }

    public boolean isIntencion() {
        return this.intencion;
    }
}
