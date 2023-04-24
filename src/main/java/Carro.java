public class Carro {
    private Modelo versao;

    public String getVersao() {
        if (this.versao == null) {
            throw new NullPointerException("Este carro não tem Versão registrado");
        }
        return this.versao.getModelo();
    }

    public void setVersao(Modelo versao) {
        this.versao = versao;
    }
}

