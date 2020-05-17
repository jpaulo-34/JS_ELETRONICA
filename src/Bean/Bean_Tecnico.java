/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author jpmsa
 */

public class Bean_Tecnico extends Bean_Funcionarios{

    private int id;
    private String nome;
    private String CPF ;
    private String especializacao;
    private String datadenascimento;
    private double salario;
    private String formacaoescolar;
    
    /*public Bean_Tecnico(String nome, String cpf, String especializacao, String datadenascimento, double salario, String formacaoescolar) {
        this.JS_Nome =  nome;
        this.JS_CPF =  cpf;
        this.JS_Especializacao = especializacao;
        this.JS_Data_de_Nascimento = datadenascimento;
        this.JS_Salario = salario;
        this.JS_Formacao = formacaoescolar;
    
    }
    */
    
    
 private String JS_Especializacao;   
 
 public void setEspecializacao(String Especializacao){
     this.JS_Especializacao = Especializacao;
 }
 public String getEspecializacao(){
     return this.JS_Especializacao;
 }
    
public void setName(String Nome){
    this.JS_Nome =  Nome;
}
public String getName(){
    return this.JS_Nome;
}

public void setCPF(String CPF){
    this.JS_CPF = CPF;
}
public String getCPF(){
    return this.JS_CPF;
}

public void setDataNasc(String DataNasc){
    this.JS_Data_de_Nascimento = DataNasc;
}
public String getDataNasc(){
    return this.JS_Data_de_Nascimento;
}

public void setSalario(double Salario){
    this.JS_Salario = Salario;
}
public double getSalario(){
    return this.JS_Salario;
}

public void setFormacao(String Formacao){
    this.JS_Formacao = Formacao;
    }
public String getFormacao(){
    return this.JS_Formacao;
}

    
    
    
}
