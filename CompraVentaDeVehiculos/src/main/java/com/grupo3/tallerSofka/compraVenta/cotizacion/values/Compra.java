package com.grupo3.tallerSofka.compraVenta.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Compra implements ValueObject<Double> {

    private Double valor;

    public Compra(Double valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    public Double value(){
        return this.valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compra)) return false;
        Compra compra = (Compra) o;
        return Objects.equals(valor, compra.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
