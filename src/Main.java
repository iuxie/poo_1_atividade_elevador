public class Main {
    public static void main(String[] args) {
        var elevador = new Elevador(8);

        System.out.println("Andar atual: " + elevador.mostrarAndarAtual());
        System.out.println("Quantidade de andares: " + elevador.mostrarQuantidadeAndares());

        elevador.fecharPorta();
        elevador.subir(5);
        elevador.subir(5); // essa linha vai dar erro.

        elevador.abrirPorta();
        elevador.descer(4); // porta aberta, então o elevador não se move.
        elevador.fecharPorta();
        elevador.descer(4);

        elevador.subir(9); // não irá subir já que ultrapassa o número de andares.
        System.out.println("Andar atual: " + elevador.mostrarAndarAtual() + "°");
    }
}
