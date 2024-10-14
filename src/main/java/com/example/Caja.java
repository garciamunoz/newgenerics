package com.example;

import java.util.ArrayList;
import java.util.List;

public class Caja<T extends Number>{

    public List<T> lista;

    public Caja(){
        this.lista = new ArrayList<>();
    }

    public T getSum(){
        T sum = (T) new Double(0);
        for(T t : lista){
            sum = (T) new Double(sum.doubleValue() + t.doubleValue());
        }
        return sum;
    }
    //Method to receive a generic list as input parameter and return the first element
    public T getFirst(List<T> list ){
        return list.get(0);
    }
    //Method to accept a generic list of elements and return its average
    public double getAverage(List<? extends Number> list) {
        double sum = 0;
        for (Number t : list) {
            sum += t.doubleValue();
        }
        return list.isEmpty() ? 0 : sum / list.size();
    }

    public T getByIndex(int index){
        return lista.get(index);
    }

    public void setLista(List<T> lista){
        this.lista = lista;
    }

    public List<T> getLista(){
        return lista;
    }
}
