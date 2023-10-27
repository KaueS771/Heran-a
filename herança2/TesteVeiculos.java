public class TesteVeiculos {
    public static void main(String[]arg){
        Veiculos meuCarro = new Veiculos("olm852", 2012);
        Caminhao meuCaminhao = new Caminhao("qwe741", 2017,6);
        Onibus meuOnibus = new Onibus("kau852",2005,24);


        System.out.println("Informações do Carro:");
        meuCarro.exibirDados();

        System.out.println("\n Informações do Caminhão:");
        meuCaminhao.exibirDados();

        System.out.println("\n Informações do Onibus:");
        meuOnibus.exibirDados();
    }
    
}
