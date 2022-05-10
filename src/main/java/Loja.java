public class Loja {

    private Loja() {};
    private static Loja instance = new Loja();
    public static Loja getInstance()
    {
        return instance;
    }

    private String ramoAtuacao;
    private String proprietario;

    public String getRamoAtuacao() {
        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {
        this.ramoAtuacao = ramoAtuacao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
