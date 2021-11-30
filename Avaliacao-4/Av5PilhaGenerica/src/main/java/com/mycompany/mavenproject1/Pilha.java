package com.mycompany.mavenproject1;
import java.util.ArrayList;


public class Pilha <E> {
    ArrayList<E> elementos; 
    int tamanho;
    
    public Pilha(int tamanho){
        elementos = new ArrayList();
        this.tamanho = tamanho;
    }
    
    public void empilhar(E e) throws ExcecaoPilhaCheia{
        if(elementos.size() == tamanho - 1){
            throw new ExcecaoPilhaCheia();
        }
        elementos.add(e); 
        
    }
    
    public E desempilhar() throws ExcecaoPilhaVazia{
        if (elementos.isEmpty()){
            throw new ExcecaoPilhaVazia();
        }
        E aux = elementos.get(elementos.size() - 1); 
        elementos.remove(elementos.size() - 1);
        return aux;
    }
    
    @Override
    public String toString(){
        return elementos.toString();
    }

    public ArrayList<E> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<E> elementos) {
        this.elementos = elementos;
    }
    
}