public class Vagas{
  private long tempoInicial;
  private long tempoFinal;
  private double tempo;
  private double tempo2;
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
    tempo = (tempoFinal - tempoInicial);
    tempo = tempo / 60000;
    tempo2 = tempo;
    for(int i = 0 ; i < tempo2 ; i++){
      if(tempo > 0){
        pagar = pagar + 5;
        tempo = tempo - 60;
      }else{
        break;
      }
    }
    ocupado = false;
    return pagar;
  }
  public boolean getOcupado(){
    return ocupado;
  }
}