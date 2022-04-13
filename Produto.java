import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    ArrayList<Produto> estoque = new ArrayList<Produto>();
    Scanner input = new Scanner(System.in);

    int codigo, quantidade, preco_compra;
    char descricao;
    double lucro;
    double desconto;

    
    public void cadastrarProduto() {
        char controle = 'n';

        do {
            System.out.println();
            
            System.out.print("Codigo...: ");
            codigo = input.nextInt();
            System.out.print("Descricao...: ");
            descricao = input.next().charAt(0);
            
            Produto prod = new Produto();
            prod.codigo = codigo;
            prod.descricao = descricao;

            estoque.add(prod);

            System.out.print("Inserir mais itens? S/N: ");
            controle = input.next().charAt(0);
        } while(controle == 's' || controle == 'S');
    }
    
    public void verificar() {
        for(Produto i: estoque) {
            System.out.println(i);
        }
    }
    
    public void comprarProduto(int codigo, int quantidade) {
    
    }

    public void venderProduto(int codigo, int sabao) {
        
    }

    public void precoProduto() {

    }

    public void estoqueProduto(int codigo) {
        
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + "\nDescricao: " + this.descricao;
    }
}