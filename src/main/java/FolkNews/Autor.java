package FolkNews;

public class Autor {
    private String nome;
    private String email;
    private String password;
    private String profissao;
    private String dataNascimento;
    private String temaPreferencial;
    
    public Autor() {
        this.nome=null;
        this.email=null;
        this.password=null;
        this.profissao=null;
        this.dataNascimento=null;
        this.temaPreferencial=null;
    }
    
    public Autor(String nome, String email, String password, String profissao, String dataNascimento, String temaPreferencial) {
        this.nome=nome;
        this.nome=email;
        this.nome=password;
        this.profissao=profissao;
        this.dataNascimento=dataNascimento;
        this.temaPreferencial=temaPreferencial;
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTemaPreferencial() {
        return this.temaPreferencial;
    }

    public void setTemaPreferencial(String temaPreferencial) {
        this.temaPreferencial = temaPreferencial;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", profissao='" + getProfissao() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", temaPreferencial='" + getTemaPreferencial() + "'" +
            "}";
    }
   
}
