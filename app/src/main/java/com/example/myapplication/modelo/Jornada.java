package com.example.myapplication.modelo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Jornada {
    private Contrato contrato;
    private HashMap<Integer,Turno> turnos;
    private float horasJornada;
    private int repartosJornada;
    private float precioRepartoJornada;
    private float precioHorasJornada;
    private float prcioPropJornada;
    private float precioTotal;
    private Date fecha;

    public Jornada(){
        fecha=new Date();
    }
    public Jornada(Date j){
        fecha=j;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getHorasJornada() {
        actualizar();
        return horasJornada;
    }

    public float getPrecioHorasJornada() {
        actualizar();
        return precioHorasJornada;
    }

    public float getPrecioRepartoJornada() {
        actualizar();
        return precioRepartoJornada;
    }

    public float getPrecioTotal() {
        actualizar();
        return precioTotal;
    }

    public float getPrecioPropJornada() {
        actualizar();
        return prcioPropJornada;
    }
    private void actualizar(){
        for (Turno value : turnos.values()) {
            horasJornada=horasJornada+(value.getnHoras());
            repartosJornada=repartosJornada+ value.getRepartos();
            prcioPropJornada=prcioPropJornada+ value.getProp();
        }
        precioHorasJornada=horasJornada* contrato.getPrecHora();
        precioRepartoJornada=repartosJornada* contrato.getPrcioPorReparto();
        precioTotal=precioHorasJornada+precioRepartoJornada;
    }

    public int getRepartosJornada() {
        actualizar();
        return repartosJornada;
    }

    public HashMap<Integer,Turno> getTurnos() {
        return turnos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHorasJornada(float horasJornada) {
        this.horasJornada = horasJornada;
    }

    public void setPrecioHorasJornada(float precioHorasJornada) {
        this.precioHorasJornada = precioHorasJornada;
    }

    public void setPrecioRepartoJornada(float precioRepartoJornada) {
        this.precioRepartoJornada = precioRepartoJornada;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPropJornada(float propJornada) {
        this.prcioPropJornada = propJornada;
    }

    public void setRepartosJornada(int repartosJornada) {
        this.repartosJornada = repartosJornada;
    }

    public void setTurnos(HashMap<Integer,Turno> turnos) {
        this.turnos = turnos;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public boolean addTurno(Turno t){
        actualizar();
        if(turnos.containsKey(t.hashCode())){
            return false;
        }else {
            turnos.put(t.hashCode(), t);
            return true;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public boolean retirarTurno(Turno t){
        actualizar();
        if(turnos.containsKey(t.hashCode())){
            turnos.remove(t.hashCode());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        actualizar();
        return "Jornada{" +
                "turnos=" + turnos +
                ", horasJornada=" + horasJornada +
                ", propJornada=" + prcioPropJornada +
                ", repartosJornada=" + repartosJornada +
                ", precioRepartoJornada=" + precioRepartoJornada +
                ", precioHorasJornada=" + precioHorasJornada +
                ", precioTotal=" + precioTotal +
                ", fecha=" + fecha +
                '}';
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        actualizar();
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jornada jornada = (Jornada) o;
        return Float.compare(jornada.horasJornada, horasJornada) == 0 && Float.compare(jornada.prcioPropJornada, prcioPropJornada) == 0 && repartosJornada == jornada.repartosJornada && Float.compare(jornada.precioRepartoJornada, precioRepartoJornada) == 0 && Float.compare(jornada.precioHorasJornada, precioHorasJornada) == 0 && Float.compare(jornada.precioTotal, precioTotal) == 0 && Objects.equals(turnos, jornada.turnos) && Objects.equals(fecha, jornada.fecha);
    }

    @NonNull
    @NotNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        actualizar();
        return super.clone();
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        actualizar();
        return Objects.hash(turnos, horasJornada, prcioPropJornada, repartosJornada, precioRepartoJornada, precioHorasJornada, precioTotal, fecha);
    }
}
