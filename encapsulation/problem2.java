package day6;

class human {
	String name;
	int age, weight;
	String gender;
	String color;
	double height;


    //constructor 

	public human(String name, int age, double height2, int weight, String string, String color) {
		super();
		this.name = name;
		this.age = age;
		this.height = height2;
		this.weight = weight;
		this.gender = string;
		this.color = color;
	}


    //to-String method to print the values

	@Override
	public String toString() {
		return "human [name=" + name + ", age=" + age + ", weight=" + weight + ", gender=" + gender + ", color=" + color
				+ ", height=" + height + "]";
	}
}

class student extends human {
	int usn, semister;
	char sec;
	String college;


    //coonstructor 

	public student(String name, int age, double height, int weight, String string, String color, int usn, int semister,
			char sec, String college) {
		super(name, age, height, weight, string, color);  //super is used to access the parent 
		this.usn = usn;
		this.semister = semister;
		this.sec = sec;
		this.college = college;
	}


    //to-String method to print the values 

	@Override
	public String toString() {
		return "student [usn=" + usn + ", semister=" + semister + ", sec=" + sec + ", college=" + college + ", name="
				+ name + ", age=" + age + ", weight=" + weight + ", gender=" + gender + ", color=" + color + ", height="
				+ height + "]";
	}

}

//main method 

public class prob2 {
	public static void main(String[] args) {
		System.out.println("student details :");
		System.out.println();
		student std = new student("sharath", 20, 5.5, 55, "M", "white", 134, 6, 'c', "AIET");
		System.out.println(std);
		System.out.println();
		System.out.println("human details :");
		System.out.println();
		human hum = new human("sony", 5, 56, 34, "M", "white");
		
		System.out.println(hum);

	}
}
