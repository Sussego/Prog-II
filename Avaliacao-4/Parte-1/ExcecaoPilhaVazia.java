public class ExcecaoPilhaVazia extends Exception{

    public ExcecaoPilhaVazia(){
        super("Não há elementos para retirar na Pilha!");

    }
    public ExcecaoPilhaVazia (String t){
        super(t);
    }
}