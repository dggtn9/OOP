package Actividad1.Ejercicio4;

import Actividad1.EjercicioTres.MotorDeAvion;
import Actividad1.ejercicioUno.Ala;
import Actividad1.EjercicioDos.SistemaDeControlDeVuelo;

public class MainAvion {
    public static void main(String[] args) {
        Ala ala = new Ala();
        Ala ala2 = new Ala();
        MotorDeAvion motor = new MotorDeAvion();
        SistemaDeControlDeVuelo sistema = new SistemaDeControlDeVuelo();
        Avion avion1 = new Avion("Ford","xhv",44,ala,true,motor,sistema);
        Avion avion2 = new Avion("YUYU","xhy",46,ala2,false,motor,sistema);

        ala.asignarEnvergadura(25);
        ala2.asignarEnvergadura(35);
        ala.cambiarColor("rojo");
        ala2.cambiarColor("verde");
        ala.asignarMaterial("aluminio");
        ala2.asignarMaterial("concreto");


        motor.asignarMarca("vhc");
        motor.asignarCaballosFuerza(1235);

        sistema.cambiarModo("manual");
        sistema.asignarFabricante("USA");


        System.out.println("AVION 1");
        avion1.mostrarAvion();
        System.out.println();
        System.out.println("AVION 2");
        avion2.mostrarAvion();

    }}
