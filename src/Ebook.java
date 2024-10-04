public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    public Ebook(String titulo, String autor, String descricao) {
        super(titulo, autor, descricao);
    }

    public String descricao() {
        return descricao;
    }

    public void baixar(){
        System.out.println("Baixando " + titulo);

    }
}
