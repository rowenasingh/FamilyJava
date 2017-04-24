// abstract class Individual {

// }


// class Child extends Individual{

// }


// class Parent extends Child {

// }


class Parent {
	String sex;
	String eyeColor;
	String hairColor;
	String hairTexture;
	double height;
	double penisSize;
	private boolean creditCard;

	Parent() {
		eyeColor = "Not defined";
		hairColor = "Not defined";
		hairTexture = "Not defined";
		height = -1;
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
		
		creditCard = g;


	}
}

class Child  extends Parent{

}