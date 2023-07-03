package ListaDeExerciciosExcecoes001;


import java.util.Scanner;

public class MainListaDeCompras {
    public static void main(String[] args) {

        ListaDeComprasController listaDeComprasController = new ListaDeComprasController();

        int opcao=0;
        while(opcao!=-1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite uma das opçoes abaixo" +
                    "\n1- adicionar candidato no banco" +
                    "\n2- listar candidato" +
                    "\n3- excluir candidato" +
                    "\n-1 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                System.out.println("digite a o tipo de alimento");
                System.out.println(TiposDeAlimento.values());
                String tipoAlimento = sc.nextLine().toUpperCase();


                listaDeComprasController.verificaTipoAlimento(tipoAlimento);
                TiposDeAlimento tipoAlimentoV = TiposDeAlimento.valueOf(tipoAlimento);
                System.out.println("digite o nome do produto");
                String nome = sc.nextLine();
                listaDeComprasController.verificaNome(nome);
                System.out.println("digite a quantidade");
                double quantidade = sc.nextDouble();
                listaDeComprasController.verificaQuantidade(tipoAlimentoV,quantidade);
                ListaDeCompras listaDeCompras = new ListaDeCompras(tipoAlimentoV,nome,quantidade);
                listaDeComprasController.cadastraListaCompras(listaDeCompras);

            } else if (opcao == 2) {
                listaDeComprasController.listaDeCompras();
            } else if (opcao == 3) {
                System.out.println("digite o nome da lista para excluir");
                String listaDeComprasAExcluir = sc.nextLine();
                listaDeComprasController.excluirListaDeCompras(listaDeComprasAExcluir);
            }
        }


    }
}
