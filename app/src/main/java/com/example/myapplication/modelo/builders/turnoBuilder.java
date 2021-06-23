package com.example.myapplication.modelo.builders;

import com.example.myapplication.modelo.Turno;

import java.util.Date;

public class turnoBuilder {


    private Date horaInit ;
    private Date horaFin;
    private float nHoras;
    private float prop;
    private int repartos;

    public turnoBuilder (){

    }

    public turnoBuilder withHoraInit(Date h){
        this.horaInit=h;
        return this;
    }
    public turnoBuilder withHoraFin(Date h){
        this.horaFin=h;
        return this;
    }
    public turnoBuilder withNHoas(float h){
        this.nHoras=h;
        return this;
    }
    public turnoBuilder withProp(float h){
        this.prop=h;
        return this;
    }
    public turnoBuilder withRepartos(int h){
        this.repartos=h;
        return this;
    }

    public Turno build(){
        Turno t = new Turno();
        t.setHoraFin(this.horaFin);
        t.setHoraInit(this.horaInit);
        t.setProp(this.prop);
        t.setRepartos(this.repartos);
        t.setnHoras(this.nHoras);
        return t;
    }


}
