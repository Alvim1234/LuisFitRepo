
public class ClasseTreinador extends ClassePessoa{

	String especialidadeAt;


public ClasseTreinador(){
	
	}

public ClasseTreinador(String especialidadePar){
	
	this.especialidadeAt = especialidadePar;
	
}

public String pegarespecialidade() {
    return especialidadeAt;
}

public void alterarespecialidade(String especialidadePar) {
    this.especialidadeAt = especialidadePar;
}
}