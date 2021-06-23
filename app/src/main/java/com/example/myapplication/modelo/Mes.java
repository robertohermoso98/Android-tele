package com.example.myapplication.modelo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Objects;

public class Mes {

    private HashMap<Integer, Jornada> jornadas;
    private float horasMes=0;
    private float propMes=0;
    private int repartosMes=0;
    private float precioRepartoMes=0;
    private float precioHorasMes=0;
    private float precioTotalMes=0;
    private String nombre;

    public Mes(){

    }
    public Mes(String n){
        nombre=n;
    }

    public float getPrecioHorasMes() {
        return precioHorasMes;
    }

    public float getHorasMes() {
        return horasMes;
    }

    public float getPrecioRepartoMes() {
        return precioRepartoMes;
    }

    public float getPrecioTotalMes() {
        return precioTotalMes;
    }

    public float getPropMes() {
        return propMes;
    }

    public HashMap<Integer, Jornada> getJornadas() {
        return jornadas;
    }

    public int getRepartosMes() {
        return repartosMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHorasMes(float horasMes) {
        this.horasMes = horasMes;
    }

    public void setJornadas(HashMap<Integer, Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioHorasMes(float precioHorasMes) {
        this.precioHorasMes = precioHorasMes;
    }

    public void setPrecioRepartoMes(float precioRepartoMes) {
        this.precioRepartoMes = precioRepartoMes;
    }

    public void setPrecioTotalMes(float precioTotalMes) {
        this.precioTotalMes = precioTotalMes;
    }

    public void setPropMes(float propMes) {
        this.propMes = propMes;
    }

    public void setRepartosMes(int repartosMes) {
        this.repartosMes = repartosMes;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public boolean addJornada(Jornada j){
        if(jornadas.containsKey(j.hashCode())){
            return false;
        }else{
            jornadas.put(j.hashCode(),j);
            return true;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public boolean eliminarJornada(Jornada j){
        if(jornadas.containsKey(j.hashCode())){
            jornadas.remove(j.hashCode());
            return true;
        }else{
            return false;
        }
    }

    @NonNull
    @NotNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mes mes = (Mes) o;
        return Float.compare(mes.horasMes, horasMes) == 0 && Float.compare(mes.propMes, propMes) == 0 && repartosMes == mes.repartosMes && Float.compare(mes.precioRepartoMes, precioRepartoMes) == 0 && Float.compare(mes.precioHorasMes, precioHorasMes) == 0 && Float.compare(mes.precioTotalMes, precioTotalMes) == 0 && Objects.equals(jornadas, mes.jornadas) && Objects.equals(nombre, mes.nombre);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(jornadas, horasMes, propMes, repartosMes, precioRepartoMes, precioHorasMes, precioTotalMes, nombre);
    }

    @Override
    public String
    toString() {
        return "Mes{" +
                "jornadas=" + jornadas +
                ", horasMes=" + horasMes +
                ", propMes=" + propMes +
                ", repartosMes=" + repartosMes +
                ", precioRepartoMes=" + precioRepartoMes +
                ", precioHorasMes=" + precioHorasMes +
                ", precioTotalMes=" + precioTotalMes +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
