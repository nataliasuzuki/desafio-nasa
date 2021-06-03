import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner; 

public class MainClass  
{   
	public static void main(String[] args)   
	{   
		
		HashMap<Integer, String> listaItens = new HashMap<Integer, String>();
		listaItens.put(1, "1) Caixa de f�sforos");
		listaItens.put(2, "2) Alimento concentrado");
		listaItens.put(3, "3) 20m de corda nylon");
//		listaItens.put(4, "4) 1 paraquedas de seda");
//		listaItens.put(5, "5) aparelho port�til de aquecimento");
//		listaItens.put(6, "6) 2 pistolas calibre 45");
//		listaItens.put(7, "7) 1 caixa de leite em p�");
//		listaItens.put(8, "8) 2 tanques de oxig�nio cada um com 50kg");
//		listaItens.put(9, "9) mapa estelar da constela��o lunar");
//		listaItens.put(10, "10) b�ssola");
//		listaItens.put(11, "11) bote salva vida");
//		listaItens.put(12, "12) 20l de �gua");
//		listaItens.put(13, "13) sinais luminosos que funcionam no v�cuo");
//		listaItens.put(14, "14) 1 kit de primeiros socorros");
//		listaItens.put(15, "15) 1 transmissor receptor port�til, acionado por luz solar");
	    
		System.out.println("Itens dispon�veis: ");		
	    for (String i : listaItens.values()) 
		{
			  System.out.println(i);
		}
	    
	    System.out.println("\nDigite o n�mero de integrantes: ");
	    Scanner sc = new Scanner(System.in);
		Integer qntdPes = Integer.valueOf(sc.nextLine());
		
		for(int q = 0; q < qntdPes; q++)
		{
		    int tamLista = listaItens.size();
		    int[] novaOrdem = new int[tamLista];
			int nmr = q+1;
			System.out.println("\nIntegrante " + nmr + ", digite a nova ordem desejada separado por virgulas, exemplo: 3, 1, 2");
			Scanner sc2 = new Scanner(System.in);
			String ordemDesejada = sc2.nextLine();
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
	        
			System.out.println("\nOrdem do integrante " + nmr);
			for(String n : novaLista)
			{
				System.out.println(n);
			}
		}
		
	}  
}  