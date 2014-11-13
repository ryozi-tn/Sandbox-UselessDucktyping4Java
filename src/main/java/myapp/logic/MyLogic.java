package myapp.logic;

import myapp.bean.MechanoidBean;
import myapp.bean.ProductBean;
import myapp.bean.UserBean;
import myapp.bean.base.Age;
import myapp.bean.base.Name;
import myapp.bean.base.ProductId;

public class MyLogic {
	public static <T extends Name> void printName(T name) {
		System.err.println("Name:" + name.getName());
	}

	public static <T extends Name & Age> void printUserDetail(T user) {
		System.err.println("my name is " + user.getName() + ". I'm "
				+ user.getAge() + " years old.");
	}

	public static <T extends Name & ProductId> void printProductDetail(T product) {
		System.err.println("" + product.getName() + " (ID="
				+ product.getProductId() + ")");
	}

	public static void main(String[] args) {
		UserBean user = new UserBean();
		user.setName("ryozi");
		user.setAge(24);

		printName(user);
		printUserDetail(user);

		ProductBean product = new ProductBean();

		product.setName("HogeHogeApp");
		product.setProductId("ID0001");

		printName(product);
		printProductDetail(product);

		MechanoidBean mecha = new MechanoidBean();

		mecha.setName("yoshio");
		mecha.setProductId("MC0001");
		mecha.setAge(2);

		printName(mecha);
		printProductDetail(mecha);
		printUserDetail(mecha);
	}
}
