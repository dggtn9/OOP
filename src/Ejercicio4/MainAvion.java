package Ejercicio4;

import EjercicioTres.MotorDeAvion;
import ejercicioUno.Ala;
import EjercicioDos.SistemaDeControlDeVuelo;

public class MainAvion {
    public static void main(String[] args) {
        Ala ala = new Ala();
        Ala ala2 = new Ala();
        MotorDeAvion motor = new MotorDeAvion();
        SistemaDeControlDeVuelo sistema = new SistemaDeControlDeVuelo();
        Avion avion1 = new Avion("Ford","xhv",44,ala,true,motor,sistema);
        Avion avion2 = new Avion("YUYU","xhy",46,ala2,false,motor,sistema);



        System.out.println("AVION 1");
        avion1.mostrarAvion();
        System.out.println();
        System.out.println("AVION 2");
        avion2.mostrarAvion();

    }}
