public classe Frutas {
 
 private int quan;
 private float preco;
 private String nome;
 private String tipo;
 private String cor;

public Frutas(){

this.nome = "";
this.preco = "";
this.quan = "";
this.tipo = "";
this.cor = "";
}

public Frutas(Strings nome, String tipo, String cor, int quan, float preco){

this.nome  = nome;
this.tipo  = tipo;
this.cor   = cor;
this.quan  = quan;
this.preco = preco;
}
public String getNome(){
return nome;
}

public void setNome(String nome){
this.nome = nome;
}

public String getTipo(){
return tipo;
}

public void setTipo(String tipo){
this.tipo = tipo;
}

public String getcor(){
return cor;
}

public void setCor(String cor){
this.nome = cor;
}

public int getQuan(){
return quan;
}

public void setQuan(int quan){
this.quan = quan;
}

public float getPreco(){
return preco;
}

public void setPreco(float preco){
this.preco = preco;
}

public void imprimir(){
System.out.println("Nome: " + nome);
System.out.println("tipo: " + tipo);
System.out.println("cor: " + cor);
System.out.println("quantidade: " + quan);
System.out.println("Preço Unitário: " + preco + "R$" );
System.out.println("              " );
}