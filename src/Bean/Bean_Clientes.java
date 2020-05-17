package Bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 201816810
 */
public class Bean_Clientes {
   
    private int js_ID;
    protected String JS_Nome;
    protected int JS_CPF;
    protected int JS_RG;
    protected int JS_Telefone;
    protected String JS_Rua;
    protected String JS_Número_da_rua;
    protected String JS_Bairro;
    
    /*public Bean_Clientes(String Nome, int CPF, int RG, int Telefone, String Rua, String NumRua, String Bairro){
        this.JS_Nome = Nome;
        this.JS_CPF = CPF;
        this.JS_RG = RG;
        this.JS_Telefone = Telefone;
        this.JS_Rua = Rua;
        this.JS_Número_da_rua = NumRua;
        this.JS_Bairro = Bairro;      
    }
    */
    public void setNome(String Nome){
        this.JS_Nome = Nome;
    }
    public String getNome(){
        return this.JS_Nome;
    }
    
    public void setCPF(int CPF){
        this.JS_CPF = CPF;
    }
    public int getCPF(){
        return this.JS_CPF;
    }
    
    public void setRG(int RG){
        this.JS_RG = RG;
    }
    public int getRG(){
        return this.JS_RG;
    }
    
    public void setTelefone(int Telefone){
        this.JS_Telefone = Telefone;
    }
    public int getTelefone(){
        return this.JS_Telefone;
    }
    
    public void setRua(String Rua){
        this.JS_Rua = Rua;
    }
    public String getRua(){
        return this.JS_Rua;
    }
    
    public void setNumRua(String NumRua){
        this.JS_Número_da_rua = NumRua;
    }
    public String getNumRua(){
        return this.JS_Número_da_rua;
    }
    
    public void setBairro(String Bairro){
        this.JS_Bairro = Bairro;
    }
    public String getBairro(){
        return this.JS_Bairro;
    }
}