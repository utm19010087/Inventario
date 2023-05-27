package com.vm.registro;

public class Articulo {
    private int id;
    private String nombre, categoria, sku,stock;
    public Articulo(int id, String nombre, String categoria, String sku,String stock){
        this.id = id;
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.sku = sku;
    }

    public int getId() {
        return id;
    }

    public String getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSku() {
        return sku;
    }
}
