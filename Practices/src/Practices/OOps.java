package Practices;


// Textual Representation how an object will look like in the momery.
//Whatever we write in class is in actual the property of Object as we are describing the object
//If you want anything which should belong to class make it static !!
class Product{
	//Attributes(state)
	int Pid;
	String name;
	int price;
	//Constructor
		Product(){
		System.out.println(">> object constructed");
		}//Constructor
		
	//Methods(Behavior)
	// To write data in Product Object we have this method
	void SetProductDetails(int Pid,String name,int price) {
		this.Pid=Pid;
		this.name=name;
		this.price=price;
		System.out.println("data written in product Object");
		
	}
	//To read data from Product Object
	void ShowProductDwtails() {
		System.out.println("-------Product ID : "+Pid+"------");
		System.out.println("-------Name :"+name+"------");
		System.out.println("-------Price : "+price);
		
	}
}
class Product1{
	int number;
	String name;
	int age;
	}
public class OOps {
	//main is excuted by JVM  when my program will run!!
public static void main(String[] args) {
	//create an object :Product
	Product product=new Product();
	//product is not an object its a reference variable which holds the hashCode of the object in hexadecimal notation
	System.out.println("Product is "+product); //We get 5acf9800 as a hashCode, so product  is a ref var not an object
	Product product1=new Product();
	Product product2=new Product();
	//Writing data an object
	product.SetProductDetails(101,"iphoneX", 70000);
   product1.SetProductDetails(123,"jkh",99999);
	//Reading data from object
	product.ShowProductDwtails();
	product1.ShowProductDwtails();
	System.out.println("----------------------------------------------------------------");
	
	product2.Pid=213;
	product2.name="qwerty";
	product2.price=90012;
	product2.ShowProductDwtails();
	

}
}
