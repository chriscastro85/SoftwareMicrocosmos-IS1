/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="preciohistorico")
public class PrecioHistorico implements Serializable {
    
    @Id
    private int idPrecioHistorico;
    @Column
    private double precio;
    @Column
    private String fechaInicial;
    @Column
    private String fechaFinal;
    @Column
    private boolean activoPrecioHistorico;
    @Column
    private int idArticulo;

    public int getIdPrecioHistorico() {
        return idPrecioHistorico;
    }

    public void setIdPrecioHistorico(int idPrecioHistorico) {
        this.idPrecioHistorico = idPrecioHistorico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isActivoPrecioHistorico() {
        return activoPrecioHistorico;
    }

    public void setActivoPrecioHistorico(boolean activoPrecioHistorico) {
        this.activoPrecioHistorico = activoPrecioHistorico;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
   
    
}
