// abstract class Individual {

// }


// class Child extends Individual{

// }


// class Parent extends Child {

// }


class Parent {
	private String sex;
	private String eyeColor;
	private String hairColor;
	private String hairTexture;
	private double height;
	double penisSize;
	private boolean creditCard;

	String getSex() {
		return sex;
	}

	String getEyeColor() {
		return eyeColor;
	}

	String getHairColor() {
		return hairColor;
	}

	String getHairTexture() {
		return hairTexture;
	}

	double getHeight() {
		return height;
	}

	Parent() {
		sex = "Not defined";
		eyeColor = "Not defined";
		hairColor = "Not defined";
		hairTexture = "Not defined";
		height = -1;
		penisSize = -1;
		creditCard = false;
		showAll();
	} 

	Parent(String a, String b, String c, String d, double e, double f, boolean g) {
		sex = a;

		eyeColor = b;
		hairColor = c;
		hairTexture = d;
		height = e;

		if (sex == "male") {
			penisSize = f;
		}

		if (sex == "female") {
			penisSize = -1;
		}

		creditCard = g;

		showAll();
	}

	void showAll() {
		System.out.println(getSex());
		System.out.println(getEyeColor());
		System.out.println(getHairColor());
		System.out.println(getHairTexture());
		System.out.println(getHeight());
		System.out.println();
	}

	boolean randBool() {
		int random = (int) (Math.random() * 2) ;

		boolean b = (random != 0);
		
		return b;
	}



}

class Child  extends Parent{

	Child() {
		super();
	}

	Child(Parent ob0, Parent ob1) {

		sex =  randBool() ? "male" : "female";
		eyeColor = randBool() ? ob0.getEyeColor() : ob1.getEyeColor ;
		hairColor =  randBool() ? ob0.hairColor : ob1.hairColor ;
		hairTexture =  randBool() ? ob0.hairTexture : ob1.hairTexture;
		height =  randBool() ? ob0.height : ob1.height ;
		if( sex == "male"){
			penisSize = ob0.penisSize ;
		}
		else{
			penisSize = ob1.penisSize;

		}
		
		creditCard = false ;
		showAll();






	}

}


class Family {
	public static void main(String[] args) {
		
		Parent father = new Parent("male", "brown", "blond", "kinky", 69.5, 5.5, true);

		Parent mother = new Parent("female", "blue", "red", "straight", 64.0, 0, false);

		System.out.println(mother.penisSize);

		//Child ch1 = new Child(father,mother);

		//Child ch2 = new Child(father,mother);

		// for (int i = 0; i <= 20; i ++ ) {
		// 	mother.randBool();
			
		// }

		

		// if(0) {
		// 	System.out.println("hi");
		// }
	}
}