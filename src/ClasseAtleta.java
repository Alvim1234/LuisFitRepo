
public class ClasseAtleta extends ClassePessoa {

	String modalidadeAt;

public ClasseAtleta(){
	
	}

public ClasseAtleta(String modalidadePar){
	
	this.modalidadeAt = modalidadePar;
	
}

public int pegarmodalidade() {
    return idAt;
}

public void alterarmodalidade(String modalidadePar) {
    this.modalidadeAt = modalidadePar;
}
}
