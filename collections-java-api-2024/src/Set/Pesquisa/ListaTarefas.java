package Set.Pesquisa;

import List.OperacoesBasicas.ListaTarefa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluido){
        tarefaSet.add(new Tarefa(descricao,concluido));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t:tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover=t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }
    }
    public void verificarStatus (boolean concluido){
        if(concluido == false){
            System.out.println("Pendente");
        } else {
            System.out.println("Concluido");
        }
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
             System.out.println(this.tarefaSet);
        }else {
             System.out.println("A lista de tarefas esta vazia");
        }

    }
    public int contarTarefas(){
        return tarefaSet.size();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tirar o lixo", false);
        listaTarefas.adicionarTarefa("tomar banho", false);
        listaTarefas.adicionarTarefa("tomar cafe", false);
        listaTarefas.adicionarTarefa("ir pra aula", false);

        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("tirar o lixo");

        System.out.println(listaTarefas.contarTarefas());
    }
}
