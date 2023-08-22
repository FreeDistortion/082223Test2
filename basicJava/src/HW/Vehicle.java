package HW;

import java.util.Objects;

public class Vehicle {
	private Owner owner;
	private int price;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public boolean equals(Object obj) {
//		Owner isOkay=(Owner)obj;
//		if (owner.equals(obj))
//			return true;
//		return false;
//	}
	
	@Override
	public String toString() {
		return "소유주정보: 이름은" + owner.name + "이고, 핸드폰 정보는 " + owner.cellPhone + "입니다.\n차량정보: 가격은 "+price+"입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null&obj instanceof Vehicle) {
			Vehicle vehicle=(Vehicle)obj;
			if(this.owner.equals(vehicle.getOwner())) {
				return true;
			}
		}
		return false;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Vehicle))
//			return false;
//		Vehicle other = (Vehicle) obj;
//		return Objects.equals(owner, other.owner);
//	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
