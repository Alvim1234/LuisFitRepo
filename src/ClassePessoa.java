
public class ClassePessoa {
	
	int idAt;
	int idadeAt;
	String nomeAt;


public ClassePessoa(){
	
	}

public ClassePessoa(int idPar, int idadePar, String nomePar){
	
	this.idAt = idPar;
	this.idadeAt = idadePar;
	this.nomeAt = nomePar;
	
}

public int pegarid() {
    return idAt;
}

public void alterarid(int idPar) {
    this.idAt = idPar;
}

public int pegaridade() {
    return idadeAt;
}

public void alteraridade(int idadePar) {
    this.idAt = idadePar;
}

public String pegarnome() {
    return nomeAt;
}

public void alterarnome(String nomePar) {
    this.nomeAt = nomePar;
}

}