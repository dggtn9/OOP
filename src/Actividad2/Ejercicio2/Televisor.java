package Actividad2.Ejercicio2;

import Actividad2.Ejercicio2.Pantalla;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private int tamanioPulgadas;
    private boolean inteligente;
    public Pantalla pantalla;

    public Televisor(String marcaAsignada,String modeloAsignado,int anioDeFabricacionAsignado, char tipoAsignado,int tamanioPulgadasAsignado,boolean inteligenteAsignado,Pantalla pantallaAsignada){
        this.marca=marcaAsignada;
        this.modelo=modeloAsignado;
        this.anioDeFabricacion=anioDeFabricacionAsignado;
        this.tipo=tipoAsignado;
        this.tamanioPulgadas=tamanioPulgadasAsignado;
        this.inteligente=inteligenteAsignado;
        this.pantalla=pantallaAsignada;
    }

};


