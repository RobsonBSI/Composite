public class Carro {
    private Modelo versao;

    public String getVersao() {
        if (this.versao == null) {
            throw new NullPointerException(" este carro não tem Modelo registrado");
        }
        return this.versao.getModelo();
    }

    public void setVersao(Modelo versao) {
        this.versao = versao;
    }
}

