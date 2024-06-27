package funcoes.aparelhoTelefonico;
import java.util.Scanner;

import static java.lang.System.exit;

public class Telefone implements AparelhoTelefonico {
    Scanner scan = new Scanner(System.in);

    @Override
    public void usuario(){
        System.out.println("************** Telefone **************");
        System.out.println("***** 1 - Fazer Ligacao *****");
        System.out.println("***** 2 - Atender chamada *****");
        System.out.println("***** 3 - Correio de Voz *****");
        System.out.println("***** 4 - Desligar *****");
        String escolha = scan.nextLine();

        switch (escolha){
            case "1":
                ligar();
                break;
            case "2":
                atender();
                break;
            case "3":
                iniciarCorreioVoz();
                break;
            case "4":
                System.out.println("Desligando o Iphone");
                exit(0);
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
    @Override
    public void ligar() {
        System.out.println("Informe o numero que deseja ligar: ");
        String numero = scan.nextLine();
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
