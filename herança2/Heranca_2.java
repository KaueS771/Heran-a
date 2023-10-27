public class Heranca_2 {
    public static void main(String [] arg){
        Gerente ger = new Gerente("Kaue", "52436043809", 3500.0, 12345);

        String representacao = ger.toString();
        System.out.println(representacao);
        int senhaDigitada = 12345;
        boolean autenticado = ger.autentica(senhaDigitada);
        if(autenticado){
            System.out.println("Autenticação bem-sucedida");
        }else{
            System.out.println("Falha na autenticação");
        }

    }
    
}
