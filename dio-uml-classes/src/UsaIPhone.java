import edu.dio.uml.classes.AparelhoIPhone;

public class UsaIPhone {
    public static void main(String[] args) throws Exception {
        AparelhoIPhone novoIphone = new AparelhoIPhone();

        System.out.println("Usando como telefone");
        
        novoIphone.ligar("38866-4758");
        novoIphone.atender();
        novoIphone.iniciarcorreioDeVoz();

        System.out.println("\nUsando como IPod");

        novoIphone.selecionarMusica("Thunderstruck - AC/DC");
        novoIphone.tocar();
        novoIphone.pausar();
        novoIphone.tocar();

        System.out.println("\nUsando como Navegador de Internet");
        
        novoIphone.exibirPagina("http://www.apple.com");
        novoIphone.adicionarNovaAba();
        novoIphone.exibirPagina("http://www.samsung.com");
        novoIphone.atualizarPagina();


    }
}
