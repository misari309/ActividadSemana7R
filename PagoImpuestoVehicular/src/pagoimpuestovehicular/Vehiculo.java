/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoimpuestovehicular;

/**
 *
 * @author camil
 */
public class Vehiculo {
    private String marca;
    private String linea;
    private String agnio;
    private Float valorI;
    private int codigo;
    private float valorF;
    
    public Vehiculo(String marca, String linea, String agnio, int codigo, float valorI){
        this.marca = marca;
        this.linea = linea;
        this.agnio = agnio;
        this.codigo = codigo;
        this.valorI = valorI;
    }
    public Vehiculo(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getAgnio() {
        return agnio;
    }

    public void setAgnio(String agnio) {
        this.agnio = agnio;
    }

    public Float getValorI() {
        return valorI;
    }

    public void setValorI(Float valorI) {
        this.valorI = valorI;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
