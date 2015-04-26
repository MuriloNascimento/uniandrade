package debugar;

public class Main {

	public static void main(String[] args) {
		
		ExecutaCalculo ex = new ExecutaCalculo();
		try {
			int result = ex.executa(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.fillInStackTrace());
		}
		
	}

}