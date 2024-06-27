package funcoes.navegadorInternet;
import java.util.Scanner;

import static java.lang.System.exit;

public class Navegador implements NavegadorInternet {
    Scanner scan = new Scanner(System.in);
     @Override
     public void usuario(){
         System.out.println("***** Bem vindo ao navegador *****");
         System.out.println("***** 1 - Abrir nova aba *****");
         System.out.println("***** 2 - Atualizar Pagina *****");
         System.out.println("***** 3 - Exibir Pagina *****");
         System.out.println("***** 4 - Desligar *****");
         String opcao = scan.nextLine();

         switch (opcao) {
             case "1":
                 adicionarNovaAba();
                 break;
             case "2":
                 atualizarPagina();
                 break;
             case "3":
                 exibirPagina();
                 break;
             case "4":
                 System.out.println("Desligando o Iphone...");
                 exit(0);
             default:
                 System.out.println("Opcao invalida");
                 break;
         }

     }
    @Override
    public void exibirPagina() {
        System.out.println("Informe a url da pagina que deseja acessar: ");
        String url = scan.nextLine();
        System.out.println("Acessando a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
        exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
        System.out.println("Pagina atualizada");
    }
}
