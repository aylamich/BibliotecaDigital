import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Miss Peregrine's Home for Peculiar Children", "Ransom Riggs", "O livro narra o conto de um menino que, depois de uma tragédia familiar terrível, segue pistas que o levam a um orfanato abandonado em uma ilha galesa. A história é contada através de uma combinação de narrativa e fotografias vernaculares dos arquivos pessoais de colecionadores listados pelo autor.");
        VideoDigital video1 = new VideoDigital("Coraline", "Neil Gaiman", "Enquanto explora sua nova casa à noite, a pequena Coraline descobre uma porta secreta que contém um mundo parecido com o dela, porém melhor em muitas maneiras.");
        livro1.baixar();
        video1.baixar();
        video1.visualizar();

        ArrayList<ItemBibliotecaDigital> itens = new ArrayList<>();
        itens.add(livro1);
        itens.add(video1);

        for (ItemBibliotecaDigital item : itens) {
            System.out.println(item.descricao());
            if(item instanceof Baixavel) {
                Baixavel b = (Baixavel) item;
                b.baixar();
            }
        }
    }
}