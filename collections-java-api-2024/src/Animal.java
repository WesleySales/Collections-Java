import java.util.Random;

public class Animal {
    Random aleat = new Random();

    private String nome;
    private int forcaMordida;
    private int dano;



    public int calcularDano(){
        int danoTotal=getDano()+getForcaMordida();
        return danoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int i) {
        this.dano = dano;
    }

    public int getForcaMordida() {
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }
    public void gerarDanoAleatorio() {
        this.dano = aleat.nextInt(9) + 1;
    }
}
