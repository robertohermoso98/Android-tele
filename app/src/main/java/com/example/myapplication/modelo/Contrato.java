package com.example.myapplication.modelo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Contrato {

    private float precHora=0;
    private float nHoras=0;
    private float prcioPorReparto=0;

    public Contrato(){

    }
    public Contrato(float h, float nh, float pr){
        precHora=h;
        nHoras=nh;
        prcioPorReparto=pr;
    }

    public float getPrcioPorReparto() {
        return prcioPorReparto;
    }

    public void setPrcioPorReparto(float prcioPorReparto) {
        this.prcioPorReparto = prcioPorReparto;
    }

    public void setnHoras(float nHoras) {
        this.nHoras = nHoras;
    }

    public float getnHoras() {
        return nHoras;
    }

    public float getPrecHora() {
        return precHora;
    }

    public void setPrecHora(float precHora) {
        this.precHora = precHora;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "precHora=" + precHora +
                ", nHoras=" + nHoras +
                ", prcioPorReparto=" + prcioPorReparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Float.compare(contrato.precHora, precHora) == 0 && Float.compare(contrato.nHoras, nHoras) == 0 && Float.compare(contrato.prcioPorReparto, prcioPorReparto) == 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(precHora, nHoras, prcioPorReparto);
    }

    @NonNull
    @NotNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
