package modelo;

import java.util.ArrayList;

public interface IMalhaDAO {
	
	public boolean inserir(Malha malha);

		public boolean alterar(Malha malha, String codma);

		public boolean deletar(Malha malha, String codma);

		public ArrayList<Malha> listarMalhas();
	}

	

