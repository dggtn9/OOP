package Actividad2.Ejercicio3;

import Actividad2.Ejercicio3.Pantalla;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private int tamanioPulgadas;
    private boolean inteligente;
    public Pantalla pantalla;
    private boolean estado;

    public Televisor(String marcaAsignada, String modeloAsignado, int anioDeFabricacionAsignado, char tipoAsignado, int tamanioPulgadasAsignado, boolean inteligenteAsignado, Pantalla pantallaAsignada){
        this.marca=marcaAsignada;
        this.modelo=modeloAsignado;
        this.anioDeFabricacion=anioDeFabricacionAsignado;
        this.tipo=tipoAsignado;
        this.tamanioPulgadas=tamanioPulgadasAsignado;
        this.inteligente=inteligenteAsignado;
        this.pantalla=pantallaAsignada;
        this.estado=false; //apagado
    }

    public void encender(){
        this.estado=true;

    }

    public void apagar(){
        this.estado=false;

    }

    public void conocerEstado(){
        if(estado){
            System.out.println("La tele esta encendida");
        } else{
            System.out.println("La tele esta apagada");
        }
    }

};


