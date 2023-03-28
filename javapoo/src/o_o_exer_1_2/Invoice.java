package o_o_exer_1_2;


public class Invoice {
	
	private int codigoItem;
    private String descricaoItem;
    private int quantidadeItemComprada;
    private double precoItemUnidade;
    
    public Invoice(int codigoItem, String descricaoItem, int quantidadeItemComprada, double precoitemUnidade, double precoItemUnidade) {
        this.codigoItem= codigoItem;
        this.descricaoItem = descricaoItem;
        if(quantidadeItemComprada < 0)
            this.quantidadeItemComprada = 0;
            
        else this.quantidadeItemComprada = quantidadeItemComprada;
        
        if(precoItemUnidade < 0)
        	this.precoItemUnidade = 0.0;
         else this.precoItemUnidade = precoItemUnidade;
        
    }

    public int getcodigoItem() {
        return  codigoItem;
    }

    public void setcodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getquantidadeItemComprada() {
        return quantidadeItemComprada;
    }

    public void setQuantidadeItemComprada(int quantidadeItemComprada) {
        this.quantidadeItemComprada = quantidadeItemComprada;
    }

    public double getPrecoItemUnidade() {
        return  precoItemUnidade;
    }

    public void setPrecoItemUnidade(double precoItemUnidade) {
        this.precoItemUnidade=  precoItemUnidade;
    }

    public double getValorInvoice() {
        return getquantidadeItemComprada() *  getPrecoItemUnidade();
    }

        

}

        
