package iphone;

import funcoes.aparelhoTelefonico.Telefone;
import funcoes.navegadorInternet.Navegador;
import funcoes.reprodutorMusical.Musical;

import java.util.Scanner;

import static java.lang.System.exit;

//Utilizando algumas teclas para navegação
public class Iphone {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****************************************** Bem-Vindo ao Iphone ******************************************");
        System.out.println();

        System.out.println("****************************************** Deseja conhecer qual funcao?**********************************");
        System.out.println("****************************************** 1 - Navegar na internet **************************************");
        System.out.println("****************************************** 2 - Reproduzir musicas ***************************************");
        System.out.println("****************************************** 3 - Funcoes Telefônicas **************************************");
        System.out.println("****************************************** 4 - Desligar o Iphone ****************************************");
        String escolha = scan.nextLine();

        do{
            if(escolha.equals("1")){
                Navegador navegador = new Navegador();
                navegador.usuario();
            }else if(escolha.equals("2")){
                Musical reprodutor = new Musical();
                reprodutor.usuario();
            }else if(escolha.equals("3")){
                Telefone telefone = new Telefone();
                telefone.usuario();
            }else if(escolha.equals("4")){
                System.out.println("Desligando o Iphone");
            }
        }while (!escolha.equals("4"));

        System.out.println();
        System.out.println("*******************************************************************************************************");
    }
}
