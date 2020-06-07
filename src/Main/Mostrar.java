package Main;

import Equipo.*;
import java.io.*;
import java.util.*;

public class Mostrar {
    public static void main(String[] args) {



         Jugadores t1 = new Jugadores();
        int opcion = 0;
        Scanner reader = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        String nomEquipo;


        while (opcion !=4) {
            System.out.println( "1 almacenar equipos de futbol" +
                    "\n2.Reporte Basico" +
                    "\n3.Reporte Detallado" +
                    "\n4.Salir");
            opcion = reader.nextInt();
            switch (opcion){
                case 1:
                    try {

                            System.out.println("Indique el nombre del equipo");
                            nomEquipo = bInput.readLine();
                            int canTitulos = getRespuesta(reader, "¿Cuantos Titulos(campeonatos) ha ganado el equipo?");
                            System.out.println("Indique el nombre del Estadio");
                            String nomEstadio = bInput.readLine();

                           t1.setNombreEquipo(nomEquipo);
                           t1.setCantidadTitulos(canTitulos);
                           t1.setEstadioEquipo(nomEstadio);

                            int respuesta = getRespuesta(reader, "¿Desea Agregar Jugadores titulares al equipo "
                                    + t1.getNombreEquipo() + "?"+
                                    "\n1. Si " +
                                    "\n2. No");
                            if(respuesta == 1) {
                                int cantidadJugadoresTitulares = getRespuesta(reader, "Indique la cantidad de jugadores titulares");
                                for (int i = 0; i < cantidadJugadoresTitulares; i++) {
                                    Jugadores r3 = new Jugadores();
                                    System.out.println("Indique nombre del jugador #" +i );
                                    String nombreTitula = bInput.readLine();
                                    System.out.println("Indique Posición del jugador #" + i);
                                    String posicionTitula = bInput.readLine();

                                    r3.setNombreJugadorTitular(nombreTitula);
                                    r3.setPosicionJugadorTitular(posicionTitula);

                                    t1.agregarJugadoresTitulares(r3);
                                }
                            }

                        int respuestaS = getRespuesta(reader, "¿Desea Agregar Jugadores Suplentes al equipo "
                                + t1.getNombreEquipo() + "?"+
                                "\n1. Si " +
                                "\n2. No");

                         if(respuestaS == 1){
                             int cantidadJugadoresSuplentes = getRespuesta(reader, "Indique la cantidad de jugadores suplentes");
                             for (int i = 0; i < cantidadJugadoresSuplentes; i++) {
                                 Jugadores r4 = new Jugadores();

                                 System.out.println("Indique nombre del jugador #" +i );
                                 String nombreSuplente = bInput.readLine();
                                 System.out.println("Indique Posición del jugador #" + i);
                                 String posicionSuplente = bInput.readLine();

                                 r4.setNombreJugadorSuplente(nombreSuplente);
                                 r4.setPosicionJugadorSuplente(posicionSuplente);

                                 t1.agregarJugadoresSuplentes(r4);
                             }
                         }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    t1.ReporteBasico();

                    break;
                case 3:

                    t1.ReporteDetallado();
                    break;

                case 4:
                    t1.hastaLaVistaBaby();
                    break;
                default:
                    System.out.println("Nel opción incorrecta we");
            }
        }
    }
    private static int getRespuesta(Scanner reader, String s) {
        System.out.println(s);
        return reader.nextInt();
    }
        
        
        
        
    }

