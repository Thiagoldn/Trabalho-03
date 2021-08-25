package br.com.musica.musicaws.shared;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class MusicaDto {

    private String id;
  

    @NotBlank(message = "O campo Titulo deve ser preenchido")
    private String titulo;
    
    @NotBlank(message = "O campo Genero deve ser preenchido, por favor corrija")
    private String genero;

    @NotBlank(message = "O campo album deve ser preenchido, por favor corrija")
    private String album;

    @NotBlank(message = " O campo artista deve ser preenchido, por favor preencha novamente")
    private String artista;

    @NotBlank(message = "O campo Compositor deve ser preenchido, por favor corrija")
    private String compositor;

    @Positive(message = " O ano não pode estar em branco")
    private Integer anoLancamento;
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
    

    
}
