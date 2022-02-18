package one.digitalinnovation.oo;

class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();//aqui foi instanciado o objeto

        Funcionario gerente = new Gerente(); //nessas 3 linhas ocorreu upcast
        Funcionario vendedor = new Vendedor();// Upcast é implicito.
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario(); //modo errado de fazer Downcast;
        Vendedor vendedor_ = (Vendedor) new Funcionario();//downcast ele é explicito
    }
}
