package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item t : itemList) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(t);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public int exibirQuantidadeItensCarrinho(){
        return itemList.size();
    }

    public double calcularValorTotal(CarrinhoDeCompras carrinhoDeCompras){
        double valorTotal=0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
        }


    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }

    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cimento",40.00,10);
        carrinhoDeCompras.adicionarItem("Argamassa",25.00,25);
        //carrinhoDeCompras.adicionarItem("Telhas",5,30);
        //carrinhoDeCompras.adicionarItem("Forro de Madeira",23,5);

        carrinhoDeCompras.exibirItens();
        System.out.println("A quantidade de itens no carrinho é: "+carrinhoDeCompras.exibirQuantidadeItensCarrinho());
        System.out.println("O valor total do carrinho é: "+carrinhoDeCompras.calcularValorTotal(carrinhoDeCompras));

        carrinhoDeCompras.removerItem("Argamassa");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Chapa 2.3mm", 30,3);
        carrinhoDeCompras.exibirItens();
        System.out.println("A quantidade de itens no carrinho é: "+carrinhoDeCompras.exibirQuantidadeItensCarrinho());
        System.out.println("O valor total do carrinho é: "+carrinhoDeCompras.calcularValorTotal(carrinhoDeCompras));

    }
}
