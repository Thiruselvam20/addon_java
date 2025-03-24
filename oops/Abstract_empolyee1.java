package oops;

public class Abstract_empolyee1 extends AbstractEmployeeEx {
			public void futureDesignation() {
				System.out.println("FSD");
			}
			public static void main(String[] args) {
				Abstract_empolyee1 ae = new Abstract_empolyee1();
				ae.name();
				ae.designation();
				ae.futureDesignation();
			}
}
