package modelo;

public class Item_card {

    int background;
    String nome_perfil;
    int foto_perfil;
    int seguidores;

    public Item_card() {
    }

    public Item_card(int background, String nome_perfil, int foto_perfil, int seguidores) {
        this.background  = background;
        this.nome_perfil = nome_perfil;
        this.foto_perfil = foto_perfil;
        this.seguidores  = seguidores;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getNome_perfil() {
        return nome_perfil;
    }

    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    public int getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(int foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
}
