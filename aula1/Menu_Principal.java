import java.util.Scanner;

public class Menu_Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String caminhoArquivo = "arquivo_251.txt";
        int opcao = 0;
        // MetodosTexto trabTexto = new MetodosTexto

        while(opcao!=4){
            System.out.println("\n########-MENU-########");
            System.out.println("1 - Gravar Texto: ");
            System.out.println("2 - Ler Texto: ");
            System.out.println("3 - Mostrar Ordenado: ");
            System.out.println("4 - Sair: ");
            System.out.println("Escolha uma Opção: ");
            opcao = leia.nextInt();

            switch (opcao){
                case 1 :
                    //trabTexto.gravarTexto(caminhoArquivo);
                    break;
                case 2:
                    //trabTexto.lerTexto(caminhoArquivo);
                    break;
                case 4:
                    System.out.println("Encerrando Programa...");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente");
            }

        }
    }
}
