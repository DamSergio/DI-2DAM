/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopruebas;

import java.util.HashMap;
import java.util.Map;

public class RegistroVentas {
    private Map<String, Double> ventasPorProducto;

    public RegistroVentas() {
        this.ventasPorProducto = new HashMap<>();
    }

    public void registrarVenta(String producto, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("monto negativo");
        }
        
        if (producto.trim().length() <= 0) {
            throw new IllegalArgumentException("producto vacio");
        }
       
        if (ventasPorProducto.containsKey(producto)) {
            double montoExistente = ventasPorProducto.get(producto);
            ventasPorProducto.put(producto, montoExistente + monto);
        } else {
            ventasPorProducto.put(producto, monto);
        }
    }

    public double obtenerTotalVentas() {
        double total = 0.0;
        for (double monto : ventasPorProducto.values()) {
            total += monto;
        }
        return total;
    }

    public double obtenerVentasPorProducto(String producto) {
        if (!ventasPorProducto.containsKey(producto)) {
            throw new IllegalArgumentException("El producto no tiene ventas registradas.");
        }
        return ventasPorProducto.get(producto);
    }

    public int obtenerCantidadProductosVendidos() {
        return ventasPorProducto.size();
    }

    public boolean verificarProductoVendido(String producto) {
        return ventasPorProducto.containsKey(producto);
    }

    public void limpiarRegistroVentas() {
        ventasPorProducto.clear();
    }
}