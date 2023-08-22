package HW;

public class Owner {
	protected String name;
	protected String cellPhone;
	public Owner() {
		// TODO Auto-generated constructor stub
	}
	public Owner(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&obj instanceof Owner) {
			Owner owner=(Owner)obj;
			if (this.name.equals(owner.getName())) {
				return true;
			}
		}
		return false;
//		Owner isOkay = (Owner) obj;
//		if (this.name.equals(isOkay.name))
//			return true;
//		return false;
	}
	@Override
	public String toString() {
		return "이름은 " + name + "이고, 핸드폰 번호는" + cellPhone + "입니";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
