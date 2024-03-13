import javax.xml.stream.util.EventReaderDelegate;

public class aluno {
    
    private String nome;
    private String cpf;
    private int ra;
    private String data_nascimento;
    private String sexo;

  public aluno(String nome, String cpf, int ra, String data_nascimento, String sexo) {
    this.nome = nome;
    this.cpf = cpf;
    this.ra = ra;
    this.data_nascimento = data_nascimento;
    this.sexo = sexo;
  } 
    
  public aluno (){

  }

    public void setNome (String entrada){
        this.nome = entrada;
    }
    public void setCpf (String entrada){
        this.cpf = entrada;
    }
    public void setRA (int entrada){
        this.ra = entrada;
    }
    public void setData_nascimento (String entrada){
        this.data_nascimento = entrada;
    }
    public void setSexo (String entrada){
        this.sexo = entrada;
    }


    public String getNome (){
        return this.nome;
    }
    public String getCpf (){
        return this.cpf;
    }
    public int getRA (){
        return this.ra;       
    }
    public String getData_nascimento (){
        return this.data_nascimento;
    }
    public String getSexo (){
        return this.sexo;
    }



}
