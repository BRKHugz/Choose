package projeto_choose;

import java.util.Scanner;

public class Cadastro {

    private String nome;
    private String cpf;
    private String regiao;
    private int idade;
    private String email;

    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getRegiao() {
        return this.regiao;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getEmail() {
        return this.email;
    }

    public static void limparTela(){
        System.out.print("\033[H\033[2J"); // Limpar a tela
        System.out.flush();
    }

    public void cadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n**************************");
        System.out.println("  📲 ÁREA DE CADASTRO 📲");
        System.out.println("**************************\n");

        System.out.print("👤 Informe seu nome: "); 
        String nome = input.nextLine();
        this.nome = nome;

        System.out.print("🆔 Informe seu CPF: "); 
        String cpf = input.nextLine();
        this.cpf = cpf;

        System.out.print("📍 Informe seu região: "); 
        String regiao = input.nextLine();
        this.regiao = regiao;

        System.out.print("🎂 Informe seu idade: "); 
        int idade = input.nextInt();
        this.idade = idade;
        input.nextLine(); // apenas para consumir com o enter, porque o nextInt não consome

        System.out.print("📧 Informe seu e-mail: "); 
        String email = input.nextLine();
        this.email = email;

        System.out.println("\nUsuário cadastrado com sucesso! ✅\n");
        input.close();
    }

    public void ExibirDadosDoUsuario(){
        // limparTela();
        System.out.println("Nome: "+this.nome+" ✅");
        System.out.println("CPF: "+this.cpf+" ✅");
        System.out.println("E-mail: "+this.email+" ✅");
        System.out.println("Região: "+this.regiao+" ✅");
        System.out.println("Idade: "+this.idade+" ✅");
    }
}