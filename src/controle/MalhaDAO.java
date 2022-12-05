package controle;
import java.util.ArrayList;

import modelo.IMalhaDAO;
import modelo.Malha;

	public class MalhaDAO implements IMalhaDAO {

		private static ArrayList<Malha> Malha;
		private static MalhaDAO instancia1;
		public static MalhaDAO getInstanciamalha() {

			if (instancia1 == null) {
				instancia1 = new MalhaDAO ();
				Malha = new ArrayList<>();
			}

			return instancia1;
		}
		
		@Override
		public boolean inserir(Malha malha) {
			if (malha != malha) {
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





	}
	

