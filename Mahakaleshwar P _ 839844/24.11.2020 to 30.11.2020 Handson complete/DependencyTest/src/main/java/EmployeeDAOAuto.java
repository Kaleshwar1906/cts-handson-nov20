import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOAuto {
	 
	@Autowired
	private DBConfig db;
	
	public void storeEmployee() {
		System.out.println("This is from the autowired EmployeeDAO");
		System.out.println(db.getDbName()+" "+db.getDbUrl());
	}
}
