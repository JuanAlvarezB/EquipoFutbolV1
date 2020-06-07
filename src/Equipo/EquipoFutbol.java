package Equipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {

    private String nombreEquipo ="";
    private String estadioEquipo;
    private int cantidadTitulos;


public EquipoFutbol(){}


    public EquipoFutbol(String nombreEquipo, String estadioEquipo, int cantidadTitulos) {
        this.nombreEquipo = nombreEquipo;
        this.estadioEquipo = estadioEquipo;
        this.cantidadTitulos = cantidadTitulos;
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", estadioEquipo='" + estadioEquipo + '\'' +
                ", cantidadTitulos='" + cantidadTitulos + '\'' +
                '}';
    }

    public  String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEstadioEquipo() {
        return estadioEquipo;
    }

    public void setEstadioEquipo(String estadioEquipo) {
        this.estadioEquipo = estadioEquipo;
    }

    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }

}
