package exemplo01;

public class Principal {
		
	public static void main(String[] args) {
		Carro c = new Carro();
		c.setAno(2019);
		c.setModelo("HB20");
		c.setFabricante("Hyundai");
		
		System.out.println(c.getFabricante());
		System.out.println(c.getModelo());
		System.out.println(c.getAno());
		}

}
