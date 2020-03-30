package Bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jpmsa
 */
public class Bean_Produtos {
    protected String JS_Titular;
    protected String JS_Modelo;
    protected String JS_Numero_de_Série;
    protected String JS_Condições_do_produto;
    protected String JS_Acessorios;
    protected int JS_Número_da_nota_fiscal;

    public Bean_Produtos(String titular, String modelo, String numerodeserie, String condicoesdoproduto, String acessorios, int numerodanotafiscal){
        this.JS_Titular = titular;
        this.JS_Modelo = modelo;
        this.JS_Numero_de_Série = numerodeserie;
        this.JS_Condições_do_produto = condicoesdoproduto;
        this.JS_Acessorios = acessorios;
        this.JS_Número_da_nota_fiscal = numerodanotafiscal;
    }

public void setTitular(String Titular){
    this.JS_Titular = Titular;
}
public String getTitular(){
    return this.JS_Titular;
}

public void setModelo(String Modelo){
    this.JS_Modelo = Modelo;
}
public String getModelo(){
    return this.JS_Modelo;
}

public void setNumDeSerie(String NumDeSerie){
    this.JS_Numero_de_Série = NumDeSerie;
}
public String getNumDeSerie(){
    return this.JS_Numero_de_Série;
}

public void CondicoesDoProduto(String CondicoesDoProduto){
    this.JS_Condições_do_produto = CondicoesDoProduto;
}
public String getCondicoesDoProduto(){
    return this.JS_Condições_do_produto;
}

public void setAcessorios(String Acessorios){
    this.JS_Acessorios = Acessorios;
}
public String getAceesorios(){
    return this.JS_Acessorios;
}

public void setNumNotaFiscal(int NumNotaFiscal){
    this.JS_Número_da_nota_fiscal = NumNotaFiscal;
}
public int getNumNotaFiscal(){
    return this.JS_Número_da_nota_fiscal;
}
}