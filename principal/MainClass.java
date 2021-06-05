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
		
		//Table
		/*Output: 
		 * 0 1 2 
		 * 1 2 3 
		 * 2 3 4
		 * [[0, 1, 2], [1, 2, 3], [2, 3, 4]]*/
	    
		System.out.println("Itens disponíveis: ");		
	    for (String i : listaItens.values()) 
		{
			  System.out.println(i);
		}
	    
	    System.out.println("\nDigite o número de integrantes: ");
	    Scanner sc = new Scanner(System.in);
		Integer qntdPes = Integer.valueOf(sc.nextLine());
		int tamLista = listaItens.size();
		int[] somaPrioridades = new int[tamLista];
		String[][] tableData = new String[3][3]; //linha x coluna
		
		for(int q = 0; q < qntdPes; q++)
		{
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
			
//			for(int y = 3 + nmr; y < somaPrioridades.length; y++)
//			{
				System.out.println("\nDiferença pessoal do integrante " + nmr + ":");
				int diffInt01 = 0;
				for (int l : listaItens.keySet()) 
				{
					diffInt01 = l - novaOrdem[l-1];
					System.out.print(diffInt01 + ", ");
					somaPrioridades[l-1] = novaOrdem[l-1] + somaPrioridades[l-1];
//					tableData[l][y] = Integer.toString(somaPrioridades[l-1]);
				}
//			}
			
			System.out.println("\n\nOrdem do integrante " + nmr);
			for(String n : novaLista)
			{
				System.out.println(n);
			}
		}
		
		for(int y = 0; y < somaPrioridades.length; y++)
		{
			System.out.println("\nDecisão do grupo: ");
			for (int z = 0; z < tableData[y].length; z++) 
	    	{ 
				System.out.print(somaPrioridades[z] + ", ");
				tableData[z][y] = Integer.toString(somaPrioridades[z]);
	    	} 
			break;
		}
		for(int y = 2; y < somaPrioridades.length; y++)
		{
//			for (int z = 0; z < tableData[y].length; z++) 
//	    	{ 
				for(int l : listaItens.keySet())
				{
					tableData[l-1][y] = listaItens.get(l);
				}
//	    	} 
			break;
		}
		
		for(int y = 1; y < somaPrioridades.length; y++)
		{
			System.out.println("\n\nDiferença do grupo: ");
			for(int l : listaItens.keySet())
			{
				somaPrioridades[l-1] = somaPrioridades[l-1] - l;
				System.out.print(somaPrioridades[l-1] + ", ");
				tableData[l-1][y] =  Integer.toString(somaPrioridades[l-1]);
			}
			break;
		}
		
		new TableModel(tableData);
	}  
}  