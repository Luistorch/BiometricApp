package com.lbelmar.biometric;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Medida {

    String medicion_valor;
    LocalDateTime fechaConFormato;
    double latitud;
    double longitud;
    String sensor_id;

    /**
     * Constructor de un objeto Medida
     * @param medicion_valor medicion CO2
     * @param latitud en grados
     * @param longitud en grados
     * @param sensor_id UUID
     */
    public Medida(String medicion_valor, double latitud, double longitud, String sensor_id) {
        this.fechaConFormato = LocalDateTime.now();
        this.medicion_valor = medicion_valor;
        this.latitud = latitud;
        this.longitud = longitud;
        this.sensor_id = sensor_id;
    }

    /**
     * Convierte el objeto en texto
     *
     * @return json en texto
     */
    @Override
    public String toString() {
        String res = "{" +
                "\"valor\":\""+this.medicion_valor+ "\", " +
                "\"fecha\":\""+fechaConFormato+"\", " +
                "\"latitud\":\""+this.latitud+"\", " +
                "\"longitud\":\""+this.longitud+"\", " +
                "\"sensor_id\":\""+this.sensor_id+"\"" +
                "}";
        return res;
    }
}
