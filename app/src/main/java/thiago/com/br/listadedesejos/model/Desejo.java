package thiago.com.br.listadedesejos.model;

/**
 * Created by Samsung on 12/03/2015.
 */
public class Desejo {

    private int _id;
    private String produto;
    private String categoria;
    private String lojas;
    private double precoMinimo;
    private double precoMaximo;


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLojas() {
        return lojas;
    }

    public void setLojas(String lojas) {
        this.lojas = lojas;
    }

    public double getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(double precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public double getPrecoMaximo() {
        return precoMaximo;
    }

    public void setPrecoMaximo(double precoMaximo) {
        this.precoMaximo = precoMaximo;
    }
}
