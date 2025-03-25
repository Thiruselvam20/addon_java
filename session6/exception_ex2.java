package session6;

public class exception_ex2 {
		public static void main(String[] args) {
			try {
				System.out.println("trying to divide by 8....");
				int res =10/0;
				System.out.println("Result"+res);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}finally {
				System.out.println("Finally block executed........");
			}
		}
}
