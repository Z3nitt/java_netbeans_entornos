/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrochungo;

/**
 *
 * @author Medac
 */
public class Articulo {
    String item;
    int precio;
    int cantidad;

    public Articulo(String item, int precio, int cantidad) {
        this.item = item;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    @Override
    public String toString() {
        return "Item: "+item+'\n'+"Precio: "+precio+'\n'+"Cantidad: "+cantidad+'\n';
    }

    
    
    
}
