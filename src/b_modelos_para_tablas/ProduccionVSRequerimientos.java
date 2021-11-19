/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_modelos_para_tablas;

/**
 *
 * @author juan-jolo
 */
public class ProduccionVSRequerimientos {

    /**
     * @return the fechaProduccion
     */
    public String getFechaProduccion() {
        return fechaProduccion;
    }

    /**
     * @param fechaProduccion the fechaProduccion to set
     */
    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    /**
     * @return the urgencia
     */
    public String getUrgencia() {
        return urgencia;
    }

    /**
     * @param urgencia the urgencia to set
     */
    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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

    /**
     * @return the nombre_emp
     */
    public String getNombre_emp() {
        return nombre_emp;
    }

    /**
     * @param nombre_emp the nombre_emp to set
     */
    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    /**
     * @return the calidad_req
     */
    public String getCalidad_req() {
        return calidad_req;
    }

    /**
     * @param calidad_req the calidad_req to set
     */
    public void setCalidad_req(String calidad_req) {
        this.calidad_req = calidad_req;
    }

    /**
     * @return the cantidadproductos
     */
    public double getCantidadproductos() {
        return cantidadproductos;
    }

    /**
     * @param cantidadproductos the cantidadproductos to set
     */
    public void setCantidadproductos(double cantidadproductos) {
        this.cantidadproductos = cantidadproductos;
    }
    private int idProduccion;
    private int idReq;
    private String nomReq;
    private double montoR;
    private String RUC;
    
    private String fechaProduccion;
    private String urgencia;
    private String Descripcion;
    private String fechaEntrega;
    private String nombre_emp;
    private String calidad_req;
    private double cantidadproductos;
    
    
    //vista jefe de calidad
    
    
    
    //vista simplificada jefe produccion
    public ProduccionVSRequerimientos(int idProduccion, int idReq, String nomReq, double montoR, String RUC) {
        this.idProduccion = idProduccion;
        this.idReq = idReq;
        this.nomReq = nomReq;
        this.montoR = montoR;
        this.RUC = RUC;
    }

    public ProduccionVSRequerimientos(int idProduccion, 
                                    String fechaProduccion, 
                                    String urgencia, 
                                    String nomReq, 
                                    String Descripcion, 
                                    String fechaEntrega, 
                                    String nombre_emp, 
                                    String calidad_req, 
                                    double cantidadproductos) {
        this.idProduccion = idProduccion;
        this.nomReq = nomReq;
        this.fechaProduccion = fechaProduccion;
        this.urgencia = urgencia;
        this.Descripcion = Descripcion;
        this.fechaEntrega = fechaEntrega;
        this.nombre_emp = nombre_emp;
        this.calidad_req = calidad_req;
        this.cantidadproductos = cantidadproductos;
    }

    
    
    /**
     * @return the idProduccion
     */
    public int getIdProduccion() {
        return idProduccion;
    }

    /**
     * @return the idReq
     */
    public int getIdReq() {
        return idReq;
    }

    /**
     * @return the nomReq
     */
    public String getNomReq() {
        return nomReq;
    }

    /**
     * @return the montoR
     */
    public double getMontoR() {
        return montoR;
    }

    /**
     * @return the RUC
     */
    public String getRUC() {
        return RUC;
    }
    
    
    
}
