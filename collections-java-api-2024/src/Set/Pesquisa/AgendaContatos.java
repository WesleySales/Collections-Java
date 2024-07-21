package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome,telefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato c:contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    pesquisaPorNome.add(c);
                }
            }
            return pesquisaPorNome;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setTelefone(novoNumero);
                    contatoAtualizado = c;
                }
            }
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao",998740);
        agendaContatos.adicionarContato("Maria",452158);
        agendaContatos.adicionarContato("Mateus",358912);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Mateus"));
        agendaContatos.atualizarNumeroContato("Joao",121315);

        agendaContatos.exibirContatos();

    }
}
