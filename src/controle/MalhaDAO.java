package controle;
import java.util.ArrayList;

import modelo.IMalhaDAO;
import modelo.Malha;

	public class MalhaDAO implements IMalhaDAO {

		private static ArrayList<Malha> Malha;
		private static Malha instancia2;
		public static Malha getInstanciamalha() {

			if (instancia2 == null) {
				instancia2 = new Malha ();
				Malha = new ArrayList<>();
			}

			return instancia2;
		}
		
		@Override
		public boolean inserir(Malha malha) {
			if (malha != null) {
				Malha.add(malha);
				return true;
			}
			return false;
		}

		@Override
		public boolean alterar(Malha malhaAlterar, String codma) {
			for (Malha malha : Malha) {

				if (malha.getCodMalha() == codma) {
					malha.setCodMalha(codma);
					malha.setCodMalha(codma);
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean deletar(Malha malhaExcluir, String codma) {
			for (Malha malha : Malha) {
				if (malha.getCodMalha() == codma) {
				malha.remove(malhaExcluir);
					return true;
				}
			}

			return false;
		}

		@Override
		public ArrayList<Malha> listarMalhas() {
			return Malha;
		}

		public static MalhaDAO getInstancia() {
			
			return null;
		}

	}
	

