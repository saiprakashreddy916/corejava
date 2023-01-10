package StudentDataBase;

public class Student {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			throw new RuntimeException("Someting Error");
		}

	}

}
