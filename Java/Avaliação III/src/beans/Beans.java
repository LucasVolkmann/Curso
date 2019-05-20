package beans;

public class Beans {

	private String Nome,Cargo;
	
	private double SalarioBruto,ImpostoRenda,SalarioLiquido;
	
	private boolean ValeTransporte,clubeFidelidade,PlanoSaude;
	
	private int faltas;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public double getSalarioBruto() {
		return SalarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		SalarioBruto = salarioBruto;
	}

	public double getImpostoRenda() {
		return ImpostoRenda;
	}

	public void setImpostoRenda(double impostoRenda) {
		ImpostoRenda = impostoRenda;
	}

	public double getSalarioLiquido() {
		return SalarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		SalarioLiquido = salarioLiquido;
	}

	public boolean isValeTransporte() {
		return ValeTransporte;
	}

	public void setValeTransporte(boolean valeTransporte) {
		ValeTransporte = valeTransporte;
	}

	public boolean isClubeFidelidade() {
		return clubeFidelidade;
	}

	public void setClubeFidelidade(boolean clubeFidelidade) {
		this.clubeFidelidade = clubeFidelidade;
	}

	public boolean isPlanoSaude() {
		return PlanoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		PlanoSaude = planoSaude;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	
	
}
