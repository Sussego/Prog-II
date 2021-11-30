package com.mycompany.mavenproject1;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField campoEntrada;
    @FXML
    private TextField respostaTexto;
    @FXML
    private TextArea areaPilha;
    private String leitura;
    private final Pilha pilha;
    
    public PrimaryController(){
        pilha = new Pilha(10);  
    }
    
    @FXML
    public void lerEntrada() throws ExcecaoPilhaCheia{
        leitura = "\n" + campoEntrada.getText();
        try{
            pilha.empilhar(leitura);
            campoEntrada.clear();
            respostaTexto.setText("Elemento Empilhado");
            areaPilha.setText(pilha.toString()+"\n");
        }catch(Exception e){
            respostaTexto.setText("Pilha Cheia!");
            campoEntrada.clear();
        }
    }
    
    @FXML
    public void botaoDesempilha () throws ExcecaoPilhaVazia{
        try{
            pilha.desempilhar();
            respostaTexto.setText("Elemento Desempilhado!");
            areaPilha.setText(pilha.toString()+"\n");
        }catch(Exception e){
            respostaTexto.setText("Pilha Vazia!");
        }
    }
}
