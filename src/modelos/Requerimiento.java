/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author juan-jolo
 */
public class Requerimiento {

    /**
     * @return the idRequerimiento
     */
    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    /**
     * @param idRequerimiento the idRequerimiento to set
     */
    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    /**
     * @return the nombreReq
     */
    public String getNombreReq() {
        return nombreReq;
    }

    /**
     * @param nombreReq the nombreReq to set
     */
    public void setNombreReq(String nombreReq) {
        this.nombreReq = nombreReq;
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
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the pagoEstimado
     */
    public double getPagoEstimado() {
        return pagoEstimado;
    }

    /**
     * @param pagoEstimado the pagoEstimado to set
     */
    public void setPagoEstimado(double pagoEstimado) {
        this.pagoEstimado = pagoEstimado;
    }

    /**
     * @return the RUC_emp
     */
    public String getRUC_emp() {
        return RUC_emp;
    }

    /**
     * @param RUC_emp the RUC_emp to set
     */
    public void setRUC_emp(String RUC_emp) {
        this.RUC_emp = RUC_emp;
    }

    /**
     * @return the cal_req
     */
    public String getCal_req() {
        return cal_req;
    }

    /**
     * @param cal_req the cal_req to set
     */
    public void setCal_req(String cal_req) {
        this.cal_req = cal_req;
    }

    /**
     * @return the com_pago
     */
    public String getCom_pago() {
        return com_pago;
    }

    /**
     * @param com_pago the com_pago to set
     */
    public void setCom_pago(String com_pago) {
        this.com_pago = com_pago;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the Cantidad_Productos
     */
    public int getCantidad_Productos() {
        return Cantidad_Productos;
    }

    /**
     * @param Cantidad_Productos the Cantidad_Productos to set
     */
    public void setCantidad_Productos(int Cantidad_Productos) {
        this.Cantidad_Productos = Cantidad_Productos;
    }
    private int idRequerimiento;
    private String nombreReq;
    private String descripcion;
    private Date fechaEntrega;
    private double pagoEstimado;
    private String RUC_emp;
    private String cal_req;
    private String com_pago;
    private Date fechaRegistro;
    private int Cantidad_Productos;
            
}
