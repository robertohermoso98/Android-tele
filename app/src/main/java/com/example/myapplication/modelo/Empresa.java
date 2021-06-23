package com.example.myapplication.modelo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Objects;

public class Empresa {

    private LinkedList<Mes> meses;
    private Contrato contrato;
    private String nombre;
    public  String[] m;

    public Empresa(){
        m=new String [12];
        m[0]="Enero";
        m[1]="Febrero";
        m[2]="Marzo";
        m[3]="Abril";
        m[4]="Mayo";
        m[5]="Junio";
        m[6]="Julio";
        m[7]="Agosto";
        m[8]="Septiembre";
        m[9]="Octubre";
        m[10]="Noviembre";
        m[11]="Diciembre";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public LinkedList< Mes> getMeses() {
        return meses;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void setMeses(LinkedList< Mes> meses) {
        this.meses = meses;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void generarMes(){
        if(meses.get(meses.size()).equals("Diciembre")){
            String[] s = meses.get(meses.size()).getNombre().split(" ");
            String nuevo="Enero "+String.valueOf(Integer.parseInt(s[1])+1);
            meses.add(new Mes(nuevo));
        }else{
            String[] s = meses.get(meses.size()).getNombre().split(" ");
           int cont=0;
           boolean fin=false;
            while(cont<12 && !fin){
                if(s[0].equals(m[cont])){
                    String nuevo=m[cont+1]+" "+String.valueOf(Integer.parseInt(s[1]));
                    meses.add(new Mes(nuevo));
                }
                else{
                    cont++;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "meses=" + meses +
                ", contrato=" + contrato +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(meses, empresa.meses) && Objects.equals(contrato, empresa.contrato) && Objects.equals(nombre, empresa.nombre);
    }

    @NonNull
    @NotNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(meses, contrato, nombre);
    }
}
