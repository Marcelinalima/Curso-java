package o_o_exer_1_2;

import java.text.DecimalFormat;

public class InvoiceTest {

	public static void main(String[] args) {
		
		  DecimalFormat df = new DecimalFormat();
		  df.applyPattern("R$ #,##0.00");

	       Invoice invoice = new Invoice(001, "Samsung A20", 1, 1300,00 );
		   
		   System.out.println("Descricao do Produto: " + invoice.getDescricaoItem());
		   System.out.println("Quantidade Comprada: " + invoice.getquantidadeItemComprada());
		   System.out.println("Preço Unitário: " + df.format(invoice.getPrecoItemUnidade()));
		   System.out.println("Valor da Nota: " + df.format(invoice.getValorInvoice()));
		   }
 	

	

}

