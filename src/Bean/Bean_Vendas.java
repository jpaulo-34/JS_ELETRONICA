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
public class Bean_Vendas {
    private int js_ID;
    private int JS_Peças_avulsas;
    private int JS_Televisores;
    private int JS_Geladeiras;
    private int JS_Lavadoras;
    private int JS_Aparelho_de_som;
    
    /*public Bean_Vendas(int pecasavulsas, int televisores, int geladeiras, int lavadoras, int aparelhosdesom){
    this.JS_Peças_avulsas = pecasavulsas;
    this.JS_Televisores = televisores;
    this.JS_Geladeiras = geladeiras;
    this.JS_Lavadoras = lavadoras;  
    this.JS_Aparelho_de_som = aparelhosdesom;
    }*/
    public void setPecasAvulsas(int PecasAvulsas){
        this.JS_Peças_avulsas = PecasAvulsas;
    }
    public int getPecasAvulsas(){
        return this.JS_Peças_avulsas;
    }
    
    public void setTelevisores(int Televisores){
        this.JS_Televisores = Televisores;
    }
    public int getTelevisores(){
        return this.JS_Televisores;
    }
    
    public void setGeladeiras(int Geladeiras){
        this.JS_Geladeiras = Geladeiras;
    }
    public int getGeladeiras(){
        return this.JS_Geladeiras;
    }
    
    public void setLavadoras(int Lavadoras){
        this.JS_Lavadoras = Lavadoras;
    }
    public int getLavadoras(){
        return this.JS_Lavadoras;
    }
    
    public void setAparelhoDeSom(int AparelhoDeSom){
        this.JS_Aparelho_de_som = AparelhoDeSom;
    }
    public int getAparelhoDeSom(){
        return this.JS_Aparelho_de_som;
    }
    
    
}
