
public class ClasseTreinador extends ClassePessoa{

	String especialidadeAt;
	

public ClasseTreinador(int idPar, int idadePar, String nomePar, String especialidadePar){
	
	super(idPar, nomePar, idadePar);
	
	this.especialidadeAt = especialidadePar;
	
}

public String pegarespecialidade() {
    return especialidadeAt;
}

public void alterarespecialidade(String especialidadePar) {
    this.especialidadeAt = especialidadePar;
}
public void exibirInfo() {
    System.out.println("ID: " + idAt);
    System.out.println("Nome: " + nomeAt);
    System.out.println("Idade: " + idadeAt);
}
}