import jdbc.DbConnection;

class Main {
	public static void main(String ... args) {
		try {
			DbConnection conn = new DbConnection();
			conn.executeQuery("select * from DATOS where id=1");
			while (conn.getResult().next()) {
				System.out.println("This is the first link: " + conn.getResult().getString("direccion"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
