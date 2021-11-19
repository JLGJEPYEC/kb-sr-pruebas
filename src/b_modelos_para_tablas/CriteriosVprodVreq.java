/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_modelos_para_tablas;

/**
 *
 * @author jolo
 */
public class CriteriosVprodVreq {

    /**
     * @return the IDCriterioProduccion
     */
    public int getIDCriterioProduccion() {
        return IDCriterioProduccion;
    }

    /**
     * @param IDCriterioProduccion the IDCriterioProduccion to set
     */
    public void setIDCriterioProduccion(int IDCriterioProduccion) {
        this.IDCriterioProduccion = IDCriterioProduccion;
    }

    /**
     * @return the nombreCriterio
     */
    public String getNombreCriterio() {
        return nombreCriterio;
    }

    /**
     * @param nombreCriterio the nombreCriterio to set
     */
    public void setNombreCriterio(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    /**
     * @return the esAceptable
     */
    public boolean isEsAceptable() {
        return esAceptable;
    }

    /**
     * @param esAceptable the esAceptable to set
     */
    public void setEsAceptable(boolean esAceptable) {
        this.esAceptable = esAceptable;
    }

    /**
     * @return the nombreRequerimiento
     */
    public String getNombreRequerimiento() {
        return nombreRequerimiento;
    }

    /**
     * @param nombreRequerimiento the nombreRequerimiento to set
     */
    public void setNombreRequerimiento(String nombreRequerimiento) {
        this.nombreRequerimiento = nombreRequerimiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaEntrega
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public CriteriosVprodVreq(int IDCriterioProduccion,String nombreCriterio, boolean esAceptable, String nombreRequerimiento, String descripcion, String fechaEntrega) {
        this.IDCriterioProduccion=IDCriterioProduccion;
        this.nombreCriterio = nombreCriterio;
        this.esAceptable = esAceptable;
        this.nombreRequerimiento = nombreRequerimiento;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }
    
    public CriteriosVprodVreq(){
        
    }
    
    
    private int IDCriterioProduccion;
    private String nombreCriterio;
    private boolean esAceptable;
    private String nombreRequerimiento;
    private String descripcion;
    private String fechaEntrega;
}
