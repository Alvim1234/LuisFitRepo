
public class ClasseAtleta extends ClassePessoa {

	String modalidadeAt;

public ClasseAtleta(int idPar, int idadePar, String nomePar, String modalidadePar){
	
	super(idPar, nomePar, idadePar);
	
	this.modalidadeAt = modalidadePar;
	}


public String pegarmodalidade() {
    return modalidadeAt;
}

public void alterarmodalidade(String modalidadePar) {
    this.modalidadeAt = modalidadePar;
}

public void exibirInfo() {
    System.out.println("ID: " + idAt);
    System.out.println("Nome: " + nomeAt);
    System.out.println("Idade: " + idadeAt);
}
}
