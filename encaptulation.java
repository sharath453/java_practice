package day5;

import java.io.ObjectInputStream.GetField;
import java.util.Objects;

class student {
	private int id;
	private String name;
	private String email;
	private int phone_num;;
	private char sec;
	private String school;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}

	public char getSec() {
		return sec;
	}

	public void setSec(char sec) {
		this.sec = sec;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

    //hashcode use to compare the objects

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phone_num, school, sec);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& phone_num == other.phone_num && Objects.equals(school, other.school) && sec == other.sec;
	}


    \\ To string method used to print the object values

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", email=" + email + ", phone_num=" + phone_num + ", sec=" + sec
				+ ", school=" + school + "]";
	}

	public class phno {
		public static void main(String[] args) {

			// object one
			student std = new student();
			std.setEmail("alsharath66@gmail.com");
			std.setId(87);
			std.setName("sharath");
			std.setSec('c');
			std.setPhone_num(98765432);

			System.out.println("first student details :");
			System.out.println(std);
			
//even we can print like this 
			
//	System.out.println(std.getEmail());
//	System.out.println(std.getId());
//	System.out.println(std.getName());
//	System.out.println(std.phone_num);

			// secound obj
			System.out.println();
			System.out.println("secound student details :");
			student jh = new student();

			jh.setEmail("mj@gmail.com");
			jh.setId(56);
			jh.setName("venketesh");
			jh.setPhone_num(9876543);
			jh.setSec('c');

			System.out.println();
			System.out.println("first student details :");
			System.out.println();
			System.out.println(jh);
			
// even we can print like
			
//	System.out.println(jh.getEmail());
//	System.out.println(jh.getId());
//	System.out.println(jh.getName());
//	System.out.println(jh.phone_num);
			
			System.out.println();
			System.out.println(std.equals(jh));   // To compare the properties of two objects  
			
			System.out.println(std.getId());

		}
	}
}
