package ListaDeExerciciosExcecoes001;

import java.util.ArrayList;
import java.util.List;

public class BdListaDeCompras {

   private List<ListaDeCompras> listaDeCompras = new ArrayList<>();

   public BdListaDeCompras(){
       iniciarBancoCandidatos();
   }

   public void iniciarBancoCandidatos(){
       adicionarListaDeCompras(new ListaDeCompras(TiposDeAlimento.VERDURA,"alface",4.00));
       adicionarListaDeCompras(new ListaDeCompras(TiposDeAlimento.GRAOS,"castanha do pará",1.0));
       adicionarListaDeCompras(new ListaDeCompras(TiposDeAlimento.VERDURA,"xicoria", 3.5));
       adicionarListaDeCompras(new ListaDeCompras(TiposDeAlimento.LEGUMES,"Cenoura", 3.2));
       adicionarListaDeCompras(new ListaDeCompras(TiposDeAlimento.OUTROS,"Ramon",4.0));
   }

   public void adicionarListaDeCompras(ListaDeCompras listaDeCompras){
       this.listaDeCompras.add(listaDeCompras);
       System.out.println("lista adicionada");
   }

    public boolean listaDeComprasJaExistente(String listaDeCompras){
        for (ListaDeCompras nomeListaDeCompras : this.listaDeCompras) {
            if(nomeListaDeCompras.getNome().equalsIgnoreCase(listaDeCompras)){
                return true;
            }
        }
        return false;
    }

    public List<ListaDeCompras> listaDeCompras(){
        List<ListaDeCompras> listaDeCompras1 = new ArrayList<>();
        for (ListaDeCompras listaDeCompras : this.listaDeCompras) {
            listaDeCompras1.add(listaDeCompras);
        }
        System.out.println(listaDeCompras1);
       return listaDeCompras1;
    }

    public void excluirListaDeCompras(ListaDeCompras listaDeCompras){
        this.listaDeCompras.remove(listaDeCompras);
        System.out.println("lista removida");
    }


}
