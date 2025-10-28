package projeto_choose;
public class MainChoose {

    static void pularLinha(){
        System.out.println(" ");
    }
    public static void main(String[]args){
        // teste
        Cadastro usuario01 = new Cadastro();
        usuario01.cadastrar();
        pularLinha();
        usuario01.ExibirDadosDoUsuario();
    } 
}
