package com.example;

import java.util.ArrayList;
import java.util.List;

public class Par <T>{

    private List<T> lista;

    public  Par(){
        this.lista = new ArrayList<>();
    }
    public void setLista(List<T> lista){
        this.lista = lista;
    }
    public List<T> getLista(){
        return lista;
    }

    public T getFirst(){
        return lista.get(0);
    }

    public T getSecond(){
        return lista.get(1);
    }
}
