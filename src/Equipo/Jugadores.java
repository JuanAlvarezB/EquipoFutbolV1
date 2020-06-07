package Equipo;

import java.util.ArrayList;
import java.util.List;

public class Jugadores extends EquipoFutbol {

    private String nombreJugadorTitular;
    private String posicionJugadorTitular;
    private String nombreJugadorSuplente;
    private String posicionJugadorSuplente;
    private List<Jugadores> ListaJugadoresTitulares= new ArrayList<>();
    private List<Jugadores> ListaJugadoresSuplentes= new ArrayList<>();



    public Jugadores(){}

    public Jugadores(String nombreJugadorTitular, String posicionJugadorTitular, String nombreJugadorSuplente, String posicionJugadorSuplente) {
        this.nombreJugadorTitular = nombreJugadorTitular;
        this.posicionJugadorTitular = posicionJugadorTitular;
        this.nombreJugadorSuplente = nombreJugadorSuplente;
        this.posicionJugadorSuplente = posicionJugadorSuplente;
    }


    public String getNombreJugadorTitular() {
        return nombreJugadorTitular;
    }

    public void setNombreJugadorTitular(String nombreJugadorTitular) {
        this.nombreJugadorTitular = nombreJugadorTitular;
    }

    public String getPosicionJugadorTitular() {
        return posicionJugadorTitular;
    }

    public void setPosicionJugadorTitular(String posicionJugadorTitular) {
        this.posicionJugadorTitular = posicionJugadorTitular;
    }

    public String getNombreJugadorSuplente() {
        return nombreJugadorSuplente;
    }

    public void setNombreJugadorSuplente(String nombreJugadorSuplente) {
        this.nombreJugadorSuplente = nombreJugadorSuplente;
    }

    public String getPosicionJugadorSuplente() {
        return posicionJugadorSuplente;
    }

    public void setPosicionJugadorSuplente(String posicionJugadorSuplente) {
        this.posicionJugadorSuplente = posicionJugadorSuplente;
    }

    public void hastaLaVistaBaby() {
        System.out.println("Hasta la vista baby :v");
    }




    public void agregarJugadoresTitulares(Jugadores r1) {

        ListaJugadoresTitulares.add(r1);

    }
    public void agregarJugadoresSuplentes(Jugadores r1) {

        ListaJugadoresSuplentes.add(r1);

    }

    public void ReporteBasico(){
        int total = ListaJugadoresTitulares.size() +ListaJugadoresSuplentes.size();
        System.out.println("Nombre Equipo: " + getNombreEquipo() + " Titulos Ganados: " + getCantidadTitulos()
                +" Cantidad total de Jugadores: " + total );


    }

    public void ReporteDetallado(){


        System.out.println("Nombre del equipo: " + getNombreEquipo());
        System.out.println("Jugadores Titulares: " );
        MostrarJugadoresTitulares();
        System.out.println("Jugadores Suplentes: ");
        MostrarJugadoresSuplentes();
    }

    public void MostrarJugadoresTitulares(){

        if (ListaJugadoresTitulares.size() >0) {
    for (int i = 0; i < ListaJugadoresTitulares.size(); i++) {
        System.out.println("Nombre Jugador Titular: " + ListaJugadoresTitulares.get(i).getNombreJugadorTitular() +
                " Posicion Jugador Titular: " + ListaJugadoresTitulares.get(i).getPosicionJugadorTitular());
    }
}else{
    System.out.println("No ha añadido ningun jugador Titular");
}
    }

    public void MostrarJugadoresSuplentes() {

        if (ListaJugadoresSuplentes.size() > 0) for (int i = 0; i < ListaJugadoresSuplentes.size(); i++) {
            System.out.println("Nombre Jugador Titular: " + ListaJugadoresSuplentes.get(i).getNombreJugadorSuplente() +
                    " Posicion Jugador Titular: " + ListaJugadoresSuplentes.get(i).getPosicionJugadorSuplente());
        }
        else {
            System.out.println("No se ha agregado ningun jugador suplente");
        }
    }
}
