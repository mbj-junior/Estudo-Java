package testeoimundo;

public class Main {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborgini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("fusca", 17000)
        };




        int maisBarato = buscarMenor(produtos);


        System.out.println(maisBarato);
        System.out.println("O carro, " + produtos[maisBarato].getName() +
                ", mais Barato custa " + produtos[maisBarato].getPrice());

    }

    private static int buscarMenor(Produto[] produtos) {
        int maisBarato = 0;
        int termino = (produtos.length -1);
        for (int atual = 0; atual <=termino; atual++) {
            if (produtos[atual].getPrice() < produtos[maisBarato].getPrice()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }


}
