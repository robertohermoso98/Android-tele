package com.example.myapplication.modelo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Objects;

public class Turno {

    private Contrato c;
    private Date horaInit ;
    private Date horaFin;
    private float nHoras;
    private float prop;
    private int repartos;

    public Turno (){
        horaInit = new Date();
        horaFin = new Date();
        nHoras=0;
        prop=0;
        repartos=0;
    }

    public Turno(Date hi, Date horaF){

    }

    public Date getHoraFin() {
        return horaFin;
    }

    public Date getHoraInit() {
        return horaInit;
    }

    public float getnHoras() {
        return nHoras;
    }

    public float getProp() {
        return prop;
    }

    public int getRepartos() {
        return repartos;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public void setHoraInit(Date horaInit) {
        this.horaInit = horaInit;
    }

    public void setnHoras(float nHoras) {
        this.nHoras = nHoras;
    }

    public void setProp(float prop) {
        this.prop = prop;
    }

    public void setRepartos(int repartos) {
        this.repartos = repartos;
    }


    public boolean anadirReparto(){
        repartos++;
        return true;
    }

    public boolean eliminarRepato(){
        if(repartos>0){
            repartos--;
            return true;
        }else{
            return false;
        }
    }
    public boolean anadirPropina(float x){
        prop=prop+x;
        return true;
    }
    public boolean elinarPropina(float x){
        if(prop>=x){
            prop= prop-x;
            return true;
        }
        else{
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
        Turno turno = (Turno) o;
        return Float.compare(turno.nHoras, nHoras) == 0 && Float.compare(turno.prop, prop) == 0 && repartos == turno.repartos && Objects.equals(horaInit, turno.horaInit) && Objects.equals(horaFin, turno.horaFin);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(horaInit, horaFin);
    }

    @Override
    public String toString() {
        return "Turno{" +
                "horaInit=" + horaInit +
                ", horaFin=" + horaFin +
                ", nHoras=" + nHoras +
                ", prop=" + prop +
                ", repartos=" + repartos +
                '}';
    }

}
