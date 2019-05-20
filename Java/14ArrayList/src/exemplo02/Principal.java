package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
			//Curso 01
					Cursos c1 = new Cursos();
					c1.setNomeCurso("Java");
					c1.setAreaCurso("Desenvolvimento");
					c1.setValorCurso(2300);
			//Curso 01
					Cursos c2 = new Cursos();
					c2.setNomeCurso("C#");
					c2.setAreaCurso("Desenvolvimento");
					c2.setValorCurso(1900);
			//Curso 01
					Cursos c3 = new Cursos();
					c3.setNomeCurso("Photoshop");
					c3.setAreaCurso("Gráfica");
					c3.setValorCurso(600);
					
			//ArrayList
					ArrayList<Cursos> cursos = new ArrayList<Cursos>();
					cursos.add(c1);
					cursos.add(c2);
					cursos.add(c3);
			
			//Listar
					for(int i=0;i<cursos.size();i++) {
						System.out.println(cursos.get(i).getNomeCurso());
					}
		
	}

}
