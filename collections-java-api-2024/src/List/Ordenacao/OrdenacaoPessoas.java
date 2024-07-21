package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> pesquisarPorNome(String nome){
        List<Pessoa> pesquisarNome = new ArrayList<>();
        if (!pessoaList.isEmpty()){
            for(Pessoa p: pessoaList){
                if(p.getNome().equalsIgnoreCase(nome)){
                    pesquisarNome.add(p);
                }
            }
            return pesquisarNome;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        }


    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(listaPorIdade);
            return listaPorIdade;
        }
        else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaPorAltura = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(listaPorAltura, new ComparatorPorAltura());
            return listaPorAltura;
        }
        else{
            throw new RuntimeException("Lista vazia!");
        }

    }


    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Joao",21,1.69);
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 16, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.pessoaList);
        /*System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());*/

        System.out.println(ordenacaoPessoas.pesquisarPorNome("David"));
    }
}
