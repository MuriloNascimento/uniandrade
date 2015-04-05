package locadora;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Edgar");
		cliente.setId(1);
		cliente.setEndereco("Av batel");
		cliente.setTelefone("41-88878788");
		
		System.out.println("Id: "+cliente.getId()+
						   "\nNome: "+cliente.getNome()+
						   "\nEndereço: "+cliente.getEndereco()+
						   "\nTelefone: "+cliente.getTelefone()
						   );
		
		System.out.println(".....................");
		
		Midia midia = new Midia();
		midia.setId(1);
		midia.setTitulo("Matrix");
		midia.setPreco(5.40);
		midia.setDescricao("Filme matrix");
		midia.setCategoria("Ficção ciêntifica");
		midia.setDiasDevolucao(3);
		
		System.out.println("Id: "+midia.getId()+
				   "\nTitulo: "+midia.getTitulo()+
				   "\nPreco: "+midia.getPreco()+
				   "\nDescricao: "+midia.getDescricao()+
				   "\nCategoria: "+midia.getCategoria()+
				   "\nDias para devolução: "+midia.getDiasDevolucao()
				   );
		
		
		System.out.println(".....................");
		
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, 2015);
		data.set(Calendar.MONTH, 3);
		data.set(Calendar.DAY_OF_MONTH,21);
		Item item = new Item();
		item.setId(1);
		item.setMidia(midia);
		item.setDiaPrevisto(data);
		item.setDiaEntregue(data);
		
		System.out.println("Id: "+item.getId()+
				   "\nTitulo da midia: "+item.getMidia().getTitulo()+
				   "\nDia previsto: "+item.getDiaPrevisto().get(Calendar.DAY_OF_MONTH)+"/"+item.getDiaPrevisto().get(Calendar.MONTH)+"/"+item.getDiaPrevisto().get(Calendar.YEAR)+
				   "\nDia entregue: "+item.getDiaEntregue().get(Calendar.DAY_OF_MONTH)+"/"+item.getDiaEntregue().get(Calendar.MONTH)+"/"+item.getDiaEntregue().get(Calendar.YEAR)
				   );
		
		System.out.println(".....................");
		
		List<Item> itens = new ArrayList<Item>();
		Calendar dataAtual = Calendar.getInstance();
		data.set(Calendar.YEAR, 2015);
		data.set(Calendar.MONTH, 3);
		data.set(Calendar.DAY_OF_MONTH,17);
		itens.add(item);
		
		Locacao locacao = new Locacao(1,cliente,itens,dataAtual);
		
		System.out.println("Id: "+locacao.getId()+
				   "\n"+locacao.getItens().get(0).getMidia().getTitulo()+
				   "\nCliente: "+locacao.getCliente().getNome()+
				   "\nDia da locação: "+locacao.getDataInicio().get(Calendar.DAY_OF_MONTH)+"/"+locacao.getDataInicio().get(Calendar.MONTH)+"/"+locacao.getDataInicio().get(Calendar.YEAR)
				   );
		
		
	}
	
}
