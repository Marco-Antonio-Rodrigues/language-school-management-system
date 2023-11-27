package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Boleto {
    private String numero;
    private double valor;
    private String beneficiario;
    private String dataVencimento;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void gerarBoleto(String nomeArquivo, String numero, double valor, String beneficiario, String dataVencimento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            // Escreve os dados do boleto no arquivo
            writer.write("Número do boleto: " + numero);
            writer.newLine();
            writer.write("Valor do boleto: " + valor);
            writer.newLine();
            writer.write("Beneficiário: " + beneficiario);
            writer.newLine();
            writer.write("Data de vencimento: " + dataVencimento);
        } catch (IOException e) {
            System.out.println("Erro ao gerar o boleto: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Erro de permissões: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }
    }
    
    // Outros métodos relevantes para a classe Boleto
    // ...
}

