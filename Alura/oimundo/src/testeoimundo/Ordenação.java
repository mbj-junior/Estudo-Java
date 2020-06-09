package testeoimundo;

public class Ordenação {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborgini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("fusca", 17000)
        };

        //selectionSort(produtos,produtos.length);
        novoSort(produtos,produtos.length);

        for (Produto produto : produtos) {
            System.out.println(produto.getName() + " custa " + produto.getPrice());
        }
    }

    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos; atual++) {
            int menor = buscarMenor(produtos, atual, quantidadeDeElementos - 1);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

    private static void novoSort (Produto[] produtos, int quantidadeDeElementos){
        for(int atual = 0; atual < quantidadeDeElementos; atual++){
            int analise = atual;
            while(analise > 0 && produtos[analise].getPrice() < produtos[analise-1].getPrice()){
                Produto produtoAnalise = produtos[analise];
                Produto produtoAnaliseMenos1 = produtos[analise -1];
                produtos[analise] = produtoAnaliseMenos1;
                produtos[analise -1] = produtoAnalise;
                analise--;
            }

        }
    }


    private static int buscarMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPrice() < produtos[maisBarato].getPrice()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }


}
