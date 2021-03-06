package entidades;

public class Administrativo extends Empleado{

	private int hsExtra;
	private int hsMes;
	
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	@Override
	public double getSueldo(){
		//sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
		return getSueldoBase()*((getHsExtra()*1.5)+getHsMes())/getHsMes();
	}
	
}
