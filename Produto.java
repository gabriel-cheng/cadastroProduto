import java.util.Scanner;

public class Produto {
    int codigo, estoque;
    String nome, descricao;
    double preco, lucro, desconto;

    Produto[] vetor = new Produto[3];
    Scanner input = new Scanner(System.in);
    int cod, quantidade, resp;

    public void menu() {
        System.out.println();
        System.out.println("Seja bem-vindo ao cadastro de produtos...");
        System.out.println();
        cadastrarProduto();
        comprarProduto();
        venderProduto();
        precoProduto();
        estoqueProduto();
    }

    public void cadastrarProduto() {
        for(int i = 0; i < vetor.length; ++i) {
            vetor[i] = new Produto();

            System.out.print("Infome o codigo do produto..: ");
            vetor[i].codigo = input.nextInt();
            System.out.print("Informe o nome do produto..: ");
            vetor[i].nome = input.next();
            System.out.print("Informe a descricao do produto..: ");
            vetor[i].descricao = input.next();
            System.out.print("Informe o preco do produto..: ");
            vetor[i].preco = input.nextDouble();
            System.out.print("Informe o lucro do produto..: ");
            vetor[i].lucro = input.nextDouble();
            System.out.print("Informe o desconto do produto..: ");
            vetor[i].desconto = input.nextDouble();
            System.out.print("Informe o estoque do produto..: ");
            vetor[i].estoque = input.nextInt();

            System.out.println();
        }
    }

    public void comprarProduto() {
        System.out.print("Deseja comprar um produto (1 - S / 0 - N)..: ");
        resp = input.nextInt();

        if(resp == 1) {
            System.out.println();
            System.out.println("Escolha o produto...: ");

            for(int i = 0; i < vetor.length; ++i) {
                System.out.print(
                    "Cod..: " + vetor[i].codigo
                    + " - " + vetor[i].nome
                    + " - " + vetor[i].estoque
                    );
                System.out.println();
            }
            System.out.println();

            System.out.print("Informe o codigo do produto que deseja comprar..: ");
            cod = input.nextInt();
            System.out.print("Informe a quantidade que deseja compra..: ");
            quantidade = input.nextInt();

            for(int i = 0; i < vetor.length; ++i) {
                if(vetor[i].codigo == cod) {
                    vetor[i].estoque = vetor[i].estoque + quantidade;
                }
            }
            System.out.println();
        }
        else {
            System.out.println();
            System.out.print("Saindo do programa...");
            System.exit(0);
        }
        System.out.println("ESTOQUE ATUAL..");

        for(int i = 0; i < vetor.length; ++i) {
            System.out.print(
                "Cod: " + vetor[i].codigo
                + " - " + vetor[i].nome
                + " - " + vetor[i].estoque
                + " unidade(s)\n"
            );
        }
        System.out.println();
    }

    public void venderProduto() {
        int i = 0;
        System.out.print("Informe o codigo do produto que deseja vender..: ");
        cod = input.nextInt();
        System.out.print("Informe a quantidade que deseja vender..: ");
        quantidade = input.nextInt();
        if(cod != vetor[i].codigo) {
            System.out.println("Voce inseriu um código diferente...");
        }
        if(quantidade > vetor[i].estoque) {
            System.out.println("A quantidade inserida é maior do que a existente no estoque...");
        }
        else {
            for(i = 0; i < vetor.length; ++i) {
                if(vetor[i].codigo == cod) {
                    vetor[i].estoque = vetor[i].estoque - quantidade;
                    System.out.println("Produto vendido!");
                }
            }
            System.out.println();
        }
        System.out.println("ESTOQUE ATUAL..");
        for(i = 0; i < vetor.length; ++i) {
            System.out.print(
                "Cod: " + vetor[i].codigo
                + " - " + vetor[i].nome
                + " - " + vetor[i].estoque
                + " unidades(s)\n"
            );
        }
        System.out.println();
    }

    public void precoProduto() {
        System.out.print("Informe o codigo do produto que deseja procurar o preco..: ");
        cod = input.nextInt();
        System.out.println();
        for(int i = 0; i < vetor.length; ++i) {
            if(vetor[i].codigo == cod) {
                System.out.println(
                    "Cod: " + vetor[i].codigo
                    + " - " + vetor[i].nome
                    + " - " + vetor[i].preco
                    + " real(s)"
                );
            }
        }
        System.out.println();
    }

    public void estoqueProduto() {
        String user;

        System.out.print("Deseja ver como ficou o estoque final (S/N)..: ");
        user = input.next();
        
        if(user == "s" || user == "S") {
            for(int i = 0; i < vetor.length; ++i) {
                if(vetor[i].codigo == cod) {
                    System.out.print(
                        "Cod: " + vetor[i].codigo
                        + " - " + vetor[i].nome
                        + " - " + vetor[i].estoque
                        + " unidade(s)\n"
                    );
                }
            }
        }
        else {
            System.out.print("Saindo do programa...");
        }
    }
}