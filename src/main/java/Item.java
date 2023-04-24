public class Item extends  Modelo{
    private float valor;

    public Item(String descricao, float valor) {
        super(descricao);
        this.valor=valor;

    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String getModelo() {
        return "Item: " + this.getDescricao() + " - Valor Unitario: " + this.valor + "\n";
    }
}
