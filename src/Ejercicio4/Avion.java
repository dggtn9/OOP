package Ejercicio4;

import EjercicioTres.MotorDeAvion;
import ejercicioUno.Ala;
import EjercicioDos.SistemaDeControlDeVuelo;

public class Avion {
    String marca;
    String modelo;
    int asientos;
    boolean entretenimientoAbordo;
    MotorDeAvion motor;
    SistemaDeControlDeVuelo sistema;
    Ala ala;

   public Avion(String marcaAsignada,String modeloAsignado,int asientosAsignados,Ala alaAsignada,boolean entretenimientoAbordoAsignado,MotorDeAvion motorAsignado,SistemaDeControlDeVuelo sistemaAsignado){
       this.marca=marcaAsignada;
       this.modelo=modeloAsignado;
       this.asientos=asientosAsignados;
       this.entretenimientoAbordo=entretenimientoAbordoAsignado;
       this.motor = motorAsignado;
       this.sistema = sistemaAsignado;
       this.ala=alaAsignada;

    }


    public void mostrarAvion() {
        System.out.println("Marca: "+marca);
        System.out.println();
        System.out.println("modelo: "+modelo);
        System.out.println();
        System.out.println("asientos: "+asientos);
        System.out.println();
        System.out.println("entretenimientoAbordo: "+entretenimientoAbordo);
        System.out.println();
        motor.mostrarMotor();
        System.out.println();
        sistema.mostrarSistema();
        System.out.println();
        ala.mostrarAla();
    }

    }




