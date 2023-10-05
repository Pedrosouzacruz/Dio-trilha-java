package msn;

import msn.apps.FacebookMessenger;
import msn.apps.MsnMenseger;
import msn.apps.ServidorMensagem;
import msn.apps.Telegram;

public class ComputadorPedrinho {
		public static void main(String[] args) {
			
			ServidorMensagem smi = null;
			
			/*
				NÃO SE SABE QUAL APP 
				MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
			 */
			String appEscolhido="msn"; 
			
			if(appEscolhido.equals("msn"))
				smi = new MsnMenseger();
			else if(appEscolhido.equals("fbm"))
				smi = new FacebookMessenger();
			else if(appEscolhido.equals("tlg"))
				smi = new Telegram();
			
				
			smi.enviarMensagem();
			smi.salvarHistoricoMensagem();
			smi.receberMensagem();
			
		
	}
}
