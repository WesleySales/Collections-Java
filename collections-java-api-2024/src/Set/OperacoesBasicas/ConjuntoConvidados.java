package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) { //se a lista de convidados NÃO estiver vazia ela será percorrida em busca do elemento indicado
            for (Convidado c : convidadoSet) { //cria um objeto para iniciar a busca
                if (c.getCodigoConvite() == codigoConvite) { //compara o objeto aos existentes na lista e realiza a ação definida caso encontre
                    convidadoParaRemover = c; //guarda a informação do convite deletado
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);//remove o convite indicado
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if(!convidadoSet.isEmpty()){
            System.out.println(convidadoSet);
        } else {
            System.out.println("A lista de convidados está vazia");
        }
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Joao",1010);
        conjuntoConvidados.adicionarConvidado("Douglas",3300);
        conjuntoConvidados.adicionarConvidado("Italo",4000);
        conjuntoConvidados.adicionarConvidado("Marta",1102);

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(4000);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());

    }
}
