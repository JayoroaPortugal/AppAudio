package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMegusta;
    private int clasificiacion;

    public void meGusta(){
        this.totalMegusta ++;
    }

    public void reproduce(){
        this.totalReproducciones ++;
    }


    //geeters and seters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalMegusta() {
        return totalMegusta;
    }

    public void setTotalMegusta(int totalMegusta) {
        this.totalMegusta = totalMegusta;
    }

    public int getClasificiacion() {
        return clasificiacion;
    }

    public void setClasificiacion(int clasificiacion) {
        this.clasificiacion = clasificiacion;
    }
}
