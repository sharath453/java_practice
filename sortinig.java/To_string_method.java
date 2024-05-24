package day5;

import java.util.Objects;

class phone_num
{
	int num;
	String name;
	String place;

@Override
	public int hashCode() {
		return Objects.hash(name, num, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		phone_num other = (phone_num) obj;
		return Objects.equals(name, other.name) && num == other.num && Objects.equals(place, other.place);
	}

	
@Override
	public String toString() {
		return "phone_num [num=" + num + ", name=" + name + ", place=" + place + "]";
	}


public class phone {
public static void main(String[] args) {
	
	phone_num mj=new phone_num();
	phone_num mj1=new phone_num();
	
	mj.name="sharath";
	mj.num=654321;
	mj.place="tumkur";
	
	
	mj1.name="sony";
	mj1.num=8765423;
	mj1.place="banglore";
	
	System.out.println(mj);
	System.out.println();
	System.out.println(mj1);
	System.out.println();
	System.out.println(mj.equals(mj1));
	
}
	
}
}
