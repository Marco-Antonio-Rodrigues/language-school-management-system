import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.AgendamentoAulas;
import classes.Aluno;
import classes.Boleto;
import classes.ExemploCorConsole;
import classes.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        ExemploCorConsole exemploCorConsole = new ExemploCorConsole();
        System.out.println("\u001B[32m"+"Bem-vindo ao Sistema de Gerenciamento de Escolas de Idioma!"+ "\u001B[0m");
        
        // Criação dos objetos
        List<Aluno> alunos = new ArrayList<>();
        Turma turma1 = null;
        AgendamentoAulas agendamento = null;
        Boleto boleto = new Boleto();
        
        
        // Menu de seleção de ações
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("Selecione a ação:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Criar turma");
            System.out.println("3. Agendar aulas");
            System.out.println("4. Gerar boleto");
            System.out.println("5. Visualizar alunos cadastrados");
            System.out.println("6. Sair");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    // Cadastrar aluno
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do aluno:");
                    String nomeAluno = scanner.nextLine();
                    
                    System.out.println("Digite a idade do aluno:");
                    int idadeAluno = scanner.nextInt();
                    
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nível do aluno:");
                    String nivelAluno = scanner.nextLine();
                    
                    System.out.println("Digite o Matrícula do aluno:");
                    int matriculaAluno = scanner.nextInt();
                    
                    Aluno alunoNovo = new Aluno(nomeAluno, idadeAluno, nivelAluno, matriculaAluno);
                    alunos.add(alunoNovo);
                    try {
                        PrintWriter writer = new PrintWriter(new FileWriter("alunos.txt"));
                        for (Aluno aluno : alunos) {
                            writer.println(aluno.toString());
                        }

                        writer.close();
                        System.out.println("Dados dos alunos salvos no arquivo com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar os dados dos alunos no arquivo: " + e.getMessage());
}
                    System.out.println("\u001B[32m"+"Aluno cadastrado com SUCESSO!"+ "\u001B[0m");
                    
                    break;
                case 2:
                    // Criar turma
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o código da turma:");
                    String codigoTurma = scanner.nextLine();
                    
                    System.out.println("Digite a capacidade da turma:");
                    int capacidadeTurma = scanner.nextInt();
                    
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite a disciplina da turma:");
                    String disciplinaTurma = scanner.nextLine();
                    
                    turma1 = new Turma(codigoTurma, capacidadeTurma, disciplinaTurma);
                    System.out.println("\u001B[32m"+"Turma criada com SUCESSO!"+ "\u001B[0m");
                    
                    break;
                case 3:
                    // Agendar aulas
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do professor:");
                    String nomeProfessor = scanner.nextLine();
                    
                    System.out.println("Digite a disciplina da aula:");
                    String disciplinaAula = scanner.nextLine();
                    
                    System.out.println("Digite a data da aula (dd/mm/aaaa):");
                    String dataAula = scanner.nextLine();
                    
                    System.out.println("Digite o horário da aula (hh:mm):");
                    String horarioAula = scanner.nextLine();
                    
                    agendamento = new AgendamentoAulas(nomeProfessor, disciplinaAula, dataAula, horarioAula);
                    System.out.println("\u001B[32m"+"Aula agendada com SUCESSO!"+ "\u001B[0m");
                    
                    break;
                case 4:
                    // Gerar boleto
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o número do boleto:");
                    String numeroBoleto = scanner.nextLine();

                    System.out.println("Digite o valor do boleto:");
                    double valorBoleto = scanner.nextDouble();
                    
                    System.out.println("Digite a data de vencimento do boleto (dd/mm/aaaa):");
                    String dataVencimento = scanner.nextLine();
                    
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do Pagador:");
                    String beneficiarioBoleto = scanner.nextLine();
            
                    
                    boleto.gerarBoleto("boleto.txt", numeroBoleto, valorBoleto, beneficiarioBoleto, dataVencimento);
                    System.out.println("\u001B[32m"+"Boleto gerado com SUCESSO!"+ "\u001B[0m");
                    
                    break;
                case 5:
                    // Visualizar alunos cadastrados
                    if (alunos.isEmpty()) {
                        System.out.println("\u001B[33m" + "Nenhum aluno cadastrado." + "\u001B[0m");
                    }else {
                        System.out.println("\u001B[32m" + "Alunos cadastrados:" + "\u001B[0m");
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno.toString());
                        }
                    }
                    break;
                case 6:
                    // Sair do programa
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Selecione uma opção válida.");
                    break;
            }
            
            System.out.println(); 
        }
        
        scanner.close();
    }
}