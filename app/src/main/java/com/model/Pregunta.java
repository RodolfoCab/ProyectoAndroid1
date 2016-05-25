package com.model;

/**
 * Created by Cab Mtz on 19/05/2016.
 */
public class Pregunta {
    private Integer mldResTexto;
    private boolean mRespuestaVerdadera;
    public Pregunta(Integer idResTexto,boolean respuestaVerdadera){
        this.mldResTexto=idResTexto;
        this.mRespuestaVerdadera=respuestaVerdadera;
    }

    public void setldResTexto(Integer idResTexto) {}

    public Integer getIdResTexto() {
        return mldResTexto;
    }

    public void setRespuestaVerdadera(boolean RespuestaVerdadera) {}

    public boolean isRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }
}
