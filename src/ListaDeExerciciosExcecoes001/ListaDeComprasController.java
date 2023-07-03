package ListaDeExerciciosExcecoes001;

public class ListaDeComprasController {
    BdListaDeCompras bdListaDeCompras = new BdListaDeCompras();


    public void cadastraListaCompras(ListaDeCompras listaDeCompras){
        if(bdListaDeCompras.listaDeComprasJaExistente(listaDeCompras.getNome())){
            throw new IllegalArgumentException("lista de compras ja Existente");
        }
        bdListaDeCompras.adicionarListaDeCompras(listaDeCompras);
    }

    public void listaDeCompras(){
        bdListaDeCompras.listaDeCompras();

    }
    public void excluirListaDeCompras(String listaDeComprasAExcluir){

        for (ListaDeCompras p: bdListaDeCompras.listaDeCompras()) {
             if (p.getNome().equalsIgnoreCase(listaDeComprasAExcluir)){
                bdListaDeCompras.excluirListaDeCompras(p);

             }

        }

    }

    public void verificaQuantidade(TiposDeAlimento tiposDeAlimento, double quantidade) {

            if (quantidade == Double.NaN) {
                throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
            }
            if (quantidade<=0) {
                throw new IllegalArgumentException("Não é permitido inserir valores negativos para quantidades");
            }

            if (tiposDeAlimento== TiposDeAlimento.VERDURA || tiposDeAlimento == TiposDeAlimento.GRAOS){
                try {
                Double.parseDouble(String.valueOf(quantidade));
                }catch (NumberFormatException e) {

                    System.out.println("Para "+ tiposDeAlimento.name()+" a quantidade deve ser informada com ponto”.");
                }
            }

            if (tiposDeAlimento== TiposDeAlimento.LEGUMES || tiposDeAlimento == TiposDeAlimento.OUTROS) {
                if (quantidade == (int) quantidade){
                    throw new NumberFormatException("Para " + tiposDeAlimento.name() + " a quantidade deve ser informada em unidades inteiras.");
                }

            }

    }
    public void verificaNome(String nome){
        if( nome == null){
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

    }

    public void verificaTipoAlimento(String tipoDeAlimento) {

            if (tipoDeAlimento == null){
                throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
            }
            if (!tipoDeAlimento.equalsIgnoreCase(String.valueOf(TiposDeAlimento.VERDURA)) && !tipoDeAlimento.equalsIgnoreCase(String.valueOf(TiposDeAlimento.LEGUMES)) &&
                    !tipoDeAlimento.equalsIgnoreCase(String.valueOf(TiposDeAlimento.GRAOS)) && !tipoDeAlimento.equalsIgnoreCase(String.valueOf(TiposDeAlimento.OUTROS))){
                throw new IllegalArgumentException("Tipo de alimento inválido");
            }

    }
}
