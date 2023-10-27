public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome,String cpf,double salario, int senha){
        super(nome,cpf,salario);
        this.senha = senha;

    }
    public boolean autentica(int senhaDigitada){
        return senha ==(senhaDigitada);
    }
    public String toString(){
        String str = "Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + getSalario() + ", Senha: " + senha;
        return str;
    }
}
