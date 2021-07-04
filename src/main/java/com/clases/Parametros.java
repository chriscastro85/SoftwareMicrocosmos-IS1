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
@Table(name="parametros")
public class Parametros implements Serializable {
    
    
    @Id
    private int idParametros;
    @Column
    private String cai;
    @Column
    private String fechaEmision;
    @Column
    private String fechaCaducidad;
    @Column
    private int facturaInicial;
    @Column
    private int facturaFinal;

    
    public int getIdParametros() {
        return idParametros;
    }

    public void setIdParametros(int idParametros) {
        this.idParametros = idParametros;
    }

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getFacturaInicial() {
        return facturaInicial;
    }

    public void setFacturaInicial(int facturaInicial) {
        this.facturaInicial = facturaInicial;
    }

    public int getFacturaFinal() {
        return facturaFinal;
    }

    public void setFacturaFinal(int facturaFinal) {
        this.facturaFinal = facturaFinal;
    }
    
    
    
    
}
