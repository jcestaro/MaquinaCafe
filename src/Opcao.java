import java.math.BigDecimal;

public class Opcao {

    private BigDecimal valor;
    private String descricao;
    private int codigo;
    Receita novaReceita;

    public Opcao(Receita novaReceita){
        this.novaReceita = novaReceita;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return codigo +" - " + descricao + " - valor R$: " + valor;

    }

}
