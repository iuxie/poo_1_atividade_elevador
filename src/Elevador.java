// métodos: subir, descer, abrir e fechar a porta, indicar porta aberta ou fechada e mostrar o andar atual.
// restrição 1: O elevador não pode subir mais andares do que o está disponível.
// restrição 2: O elevador não pode descer mais andares do que o está disponível.
// restrição 3: O elevador não pode subir ou descer algum andar se a porta estiver aberta

public class Elevador {
    private int andarAtual;
    private boolean portaAberta;
    private final int quantidadeAndares;

    public Elevador(int quantidadeAndares) {
        this.andarAtual = 0;
        this.portaAberta = true;
        this.quantidadeAndares = quantidadeAndares;
    }

    public boolean situacaoPorta() {
        return portaAberta;
    }

    public int mostrarQuantidadeAndares() {
        return quantidadeAndares;
    }

    public int mostrarAndarAtual() {
        return andarAtual;
    }

    public void abrirPorta() {
        this.portaAberta = true;
    }

    public void fecharPorta() {
        this.portaAberta = false;
    }

    public void subir(int andar) {
        if (this.portaAberta){
            System.out.println("A porta está aberta, feche-a antes de subir.");
        } else if (andar < 0 || andar > this.quantidadeAndares) {
            System.out.println("Andar inválido.");
        } else if (andar == this.andarAtual) {
            System.out.println("O elevador já está nesse andar!");
        } else if (andar < andarAtual) {
            System.out.println("Não possível subir para um andar abaixo.");
        } else {
            System.out.println("Elevador subindo ao " + andar + "° andar.");
            this.andarAtual = andar;
        }
    }

    public void descer(int andar) {
        if (this.portaAberta) {
            System.out.println("A porta está aberta, feche-a antes de descer.");
        } else if (andar < 0 || andar > quantidadeAndares) {
            System.out.println("Andar inválido.");
        } else if (andar == this.andarAtual) {
            System.out.println("O elevador já está nesse andar!");
        } else if (andar > andarAtual) {
            System.out.println("Não é possível descer para um andar acima.");
        } else {
            System.out.println("Elevador descendo ao " + andar + "° andar.");
            this.andarAtual = andar;
        }
    }
}
