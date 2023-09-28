public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("38067593");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        
        return "38.037.593";
        
    }
}
