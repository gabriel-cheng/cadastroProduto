import java.util.Scanner;

public class Produto {
    Produto[] vetor = new Produto[2];
    
    String nome;
    int codigo;

    /*
    int codigo, estoque;
    String descricao;
    float preco_compra, lucro, desconto;
    */
    
    
    public void cadastrarProduto() {
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = new Produto();
            Scanner input = new Scanner(System.in);

            System.out.print("Nome..: ");
            this.vetor[i].nome = input.next();
            System.out.print("Codigo..: ");
            this.vetor[i].codigo = input.nextInt();
            
            System.out.println();
        }

    }
    
    public void verificar() { /* Método para verificar itens armazenados no Array */
        
    }

    public void comprarProduto() {

    }

    public void venderProduto() {

    }

    public void precoProduto() {

    }

    public void estoqueProduto() {

    }
}