package funcoes.reprodutorMusical;
import java.util.Scanner;

import static java.lang.System.exit;

public class Musical implements ReprodutorMusical {
    Scanner scan = new Scanner(System.in);

    @Override
    public void usuario(){
        System.out.println();
        System.out.println("***** O que deseja fazer? *****");
        System.out.println("***** 1 - Tocar *****");
        System.out.println("***** 2 - Pausar *****");
        System.out.println("***** 3 - Selecionar Musica *****");
        System.out.println("***** 4 - Desligar *****");
        String escolha = scan.nextLine();

        switch (escolha) {
            case "1":
                tocar();
                break;
            case "2":
                pausar();
                break;
            case "3":
                selecionarMusica();
                break;
            case "4":
                System.out.println("Desligando o Iphone");
                exit(0);
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    @Override
    public void tocar() {
        System.out.println("Qual musica deseja ouvir? ");
        String musica = scan.nextLine();
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        tocar();
    }

}
