package edu.dio.uml.classes;

import edu.dio.uml.interfaces.IAparelhoTelefonico;
import edu.dio.uml.interfaces.IReprodutorMusical;
import edu.dio.uml.interfaces.INavegadorInternet;


public class AparelhoIPhone implements IAparelhoTelefonico, IReprodutorMusical, INavegadorInternet {


    // Métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.printf("Iniciando chamada telefônica para o numero %s.\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica.");
    }

    @Override
    public void iniciarcorreioDeVoz() {
        System.out.printf("Iniciando Correio de voz...\n");
    }

    // Métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Música em execução.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionada a música %s.\n", musica);
    }

    // Métodos do Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.printf("Abrindo a página %s.\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}
