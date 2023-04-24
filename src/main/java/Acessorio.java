import java.util.ArrayList;
import java.util.List;

public class Acessorio extends Modelo {
    private List<Modelo> modelos;

    public Acessorio(String descricao) {
        super(descricao);
        this.modelos= new ArrayList<Modelo>();
    }

    public void addModelo(Modelo modelo) {
        this.modelos.add(modelo);
    }

    @Override
    public String getModelo() {
        String informacao = "";
        informacao = "Acessorio: " + this.getDescricao() + "\n";
        for (Modelo modelo : modelos) {
            informacao += modelo.getModelo();
        }
        return informacao;
    }
}
