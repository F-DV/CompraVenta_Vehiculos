package com.grupo3.tallerSofka.compraVenta.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Venta implements ValueObject<Double> {

    private Double valor;

    public Venta(Double valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    public Double value(){
        return this.valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return Objects.equals(valor, venta.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
