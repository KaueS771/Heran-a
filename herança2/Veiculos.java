public class Veiculos {
    private String placa;
    private int ano;


    public Veiculos(){

    }

    public Veiculos(String placa,int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirDados(){
        System.out.println("Placa:" + placa);
        System.out.println("Ano:" + ano);

    }
    

}   
