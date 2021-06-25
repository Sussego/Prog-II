public class Vagas{
  private long tempoInicial;
  private long tempoFinal;
  private long tempo;
  private boolean ocupado;
  private float pagar;

  /*construtor*/
  Vagas(){
    ocupado = false;
    pagar = 0;
    tempo = 0;
  }

  /*metodos*/
  public void adicionarCarro(){
    ocupado = true;
    tempoInicial = System.currentTimeMillis();
  }
  public float removerCarro(){
    tempoFinal = System.currentTimeMillis();
    tempo = (tempoInicial - tempoFinal)/60000;
    for(int i = 0 ; i < 24 ; i++){
      tempo = tempo - 60;
      if(tempo <= 0){
        pagar = pagar + 5;
        break;
      }
      if(tempo > 0){
        pagar = pagar + 5;
        tempo = tempo - 60;
      }
    }
    ocupado = false;
    return pagar;
  }
  public boolean getOcupado(){
    return ocupado;
  }
}