package Actividad2.Ejercicio1;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private int tamanioPulgadas;
    private boolean inteligente;

    public Televisor(String marcaAsignada,String modeloAsignado,int anioDeFabricacionAsignado, char tipoAsignado,int tamanioPulgadasAsignado,boolean inteligenteAsignado){
        this.marca=marcaAsignada;
        this.modelo=modeloAsignado;
        this.anioDeFabricacion=anioDeFabricacionAsignado;
        this.tipo=tipoAsignado;
        this.tamanioPulgadas=tamanioPulgadasAsignado;
        this.inteligente=inteligenteAsignado;
    }

    @Override
    public String toString() {
        return
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioDeFabricacion=" + anioDeFabricacion +
                ", tipo=" + tipo +
                ", tamanioPulgadas=" + tamanioPulgadas +
                ", inteligente=" + inteligente
                ;
    }
};

