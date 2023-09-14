public class iPhone{

    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        System.out.println("Executando Reprodutor Musical");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.SelecionarMusica();
        System.out.println("Fechando Reprodutor Musical \n");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        System.out.println("Executando Telefone");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("Fechando Telefone \n");

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        System.out.println("Executando Navegador de Internet");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        System.out.println("Fechando Navegador de Internet\n");

    }
}
