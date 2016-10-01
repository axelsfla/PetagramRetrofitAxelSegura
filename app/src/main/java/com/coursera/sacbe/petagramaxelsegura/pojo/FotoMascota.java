package com.coursera.sacbe.petagramaxelsegura.pojo;

/**
 * Created by Sacbe on 10/09/2016.
 */
public class FotoMascota {

    private String id;
    private String nombreCompleto;
    private String urlFoto;
    private String urlFotoPerfil;
    private int likesFoto;

    public FotoMascota(String urlFoto, String urlFotoPerfil,String nombreCompleto, int likesFoto) {
        this.urlFoto = urlFoto;
        this.urlFotoPerfil = urlFotoPerfil;
        this.nombreCompleto = nombreCompleto;
        this.likesFoto = likesFoto;
    }

    public FotoMascota(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getLikesFoto() {
        return likesFoto;
    }

    public void setLikesFoto(int likesFoto) {
        this.likesFoto = likesFoto;
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil;
    }

    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil = urlFotoPerfil;
    }
}
