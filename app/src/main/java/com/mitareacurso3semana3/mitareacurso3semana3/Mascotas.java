package com.mitareacurso3semana3.mitareacurso3semana3;

/**
 * Created by kanjyr0 on 26.6.2016.
 */
public class Mascotas {


    private String mascotaNombre;
    private int votos;
    private int mascota_id;
    private int foto;


    public Mascotas(int foto,String mascotaNombre, int votos, int mascota_id ) {
        this.mascotaNombre = mascotaNombre;
        this.votos = votos;
        this.mascota_id = mascota_id;
        this.foto = foto;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(int mascota_id) {
        this.mascota_id = mascota_id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
