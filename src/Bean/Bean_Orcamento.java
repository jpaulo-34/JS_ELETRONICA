/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author 201816810
 */
public class Bean_Orcamento {
    private int js_ID;
    protected double JS_Valor;
    protected int JS_Quantidade;
    protected String JS_Contratante;
    protected String JS_ServiçoPrestado;
    protected int JS_DataEmissao;
    protected int JS_Validade;

   /* public Bean_Orcamento(double valor, int quantidade, String contratante, String servicoprestado, int datadeemissao, int validade){
        
        this.JS_Valor = valor;
        this.JS_Quantidade = quantidade;
        this.JS_Contratante = contratante;
        this.JS_ServiçoPrestado = servicoprestado;
        this.JS_DataEmissao = datadeemissao;
        this.JS_Validade = validade;
    }
*/
public void setValor(double Valor){
    this.JS_Valor = Valor;
}
public double getValor(){
    return this.JS_Valor;
}

public void setQuantidade(int Quantidade){
    this.JS_Quantidade = Quantidade;
}
public int getQuantidade(){
    return this.JS_Quantidade;
}

public void setContratante(String  contratante){
    this.JS_Contratante = contratante;
}
public String getContratante(){
    return this.JS_Contratante;
}

public void setServicoPrestado(String ServicoPrestado){
    this.JS_ServiçoPrestado = ServicoPrestado;
}
public String getServicoPrestado(){
    return this.JS_ServiçoPrestado;
}

public void setDataDeEmissao(int DataDeEmissao){
    this.JS_DataEmissao = DataDeEmissao;
}
public int getDataDeEmissao(){
    return this.JS_DataEmissao;
}

public void setValidade(int Validade){
    this.JS_Validade = Validade;
}
public int getValidade(){
    return this.JS_Validade;
}

}
