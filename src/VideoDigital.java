public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor, String descricao) {
        super(titulo, autor, descricao);
    }

    public String descricao() {
        return descricao;
    }

    public void baixar(){
        System.out.println("Baixando " + titulo);
    }

    public void visualizar() {
    System.out.println("Visualizando " + titulo);
    }

}
