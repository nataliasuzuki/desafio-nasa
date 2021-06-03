import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner; 

public class MainClass  
{   
	public static void main(String[] args)   
	{   
		
		HashMap<Integer, String> listaItens = new HashMap<Integer, String>();
		listaItens.put(1, "1) Caixa de fósforos");
		listaItens.put(2, "2) Alimento concentrado");
		listaItens.put(3, "3) 20m de corda nylon");
//		listaItens.put(4, "4) 1 paraquedas de seda");
//		listaItens.put(5, "5) aparelho portátil de aquecimento");
//		listaItens.put(6, "6) 2 pistolas calibre 45");
//		listaItens.put(7, "7) 1 caixa de leite em pó");
//		listaItens.put(8, "8) 2 tanques de oxigênio cada um com 50kg");
//		listaItens.put(9, "9) mapa estelar da constelação lunar");
//		listaItens.put(10, "10) bússola");
//		listaItens.put(11, "11) bote salva vida");
//		listaItens.put(12, "12) 20l de água");
//		listaItens.put(13, "13) sinais luminosos que funcionam no vácuo");
//		listaItens.put(14, "14) 1 kit de primeiros socorros");
//		listaItens.put(15, "15) 1 transmissor receptor portátil, acionado por luz solar");
	    
		System.out.println("Itens disponíveis: ");		
	    for (String i : listaItens.values()) 
		{
			  System.out.println(i);
		}
	    
	    int tamLista = listaItens.size();
	    int[] novaOrdem = new int[tamLista];
		
		System.out.println("\nDigite a nova ordem desejada separado por virgulas, exemplo: 15, 14, 13, 1, 7, ...\n");
		Scanner sc = new Scanner(System.in);
		String ordemDesejada = sc.nextLine();
		String[] ordemArray = ordemDesejada.split(",");
		
		int temp = 0;
		for(String aux : ordemArray)
		{
			Integer i = Integer.parseInt(aux);  
			novaOrdem[temp] = i;
			temp++;
		}
		
		List<String> novaLista = new ArrayList<String>();
		for (int k : novaOrdem) 
		{
			 novaLista.add(listaItens.get(k));
		}
        
		System.out.println("\nNova ordem");
		for(String n : novaLista)
		{
			System.out.println(n);
		}
		
	}  
}  