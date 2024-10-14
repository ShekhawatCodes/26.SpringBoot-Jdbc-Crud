package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringBootApplication5Application implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	User user1 = new User("Sumit Singh","sumit@gmail.com","male","bikaner");
	//	User user1 = new User("sunil suman","sunil@gmail.com","male","jaipur");
		
//		---------------------------------INSERTION------------------------------------------------------
//		boolean status = userDao.insertUser(user1);
//		
//		if(status) {
//			System.out.println("inserted succesfully");
//		}
//		else {
//			System.out.println("insertion failed");
//		}
		
//		----------------------------------UPDATION---------------------------------------------------------------------
//		User user = new User("Harsh","harsh@gmail.com","male","gurgawa");
//		boolean status = userDao.updateUser(user);
//		
//		if(status) {
//			System.out.println("updated succesfully");
//		}
//		else {
//			System.out.println("not updated");
//		}
		
//		-------------------------------------UPDATION 2 ---------------------------------------------------------------
		
//		User user = userDao.getUserByEmail("sumit@gmail.com");
//		user.setName("shekhawat");
//		
//		boolean status = userDao.updateUser(user);
//		if(status) {
//			System.out.println("update sucessful");
//		}
//		else
//		{
//			System.out.println("not updated");
//		}
		
	//------------------------------------	DELETION--------------------------------------------------------------
//		boolean status = userDao.deleteUserByEmail("sunil@gmail.com");
//		
//		if(status) {
//			System.out.println("deleted succesfully");
//		}
//		else {
//			System.out.println("not deleted");
//		}
//	
	//----------------------------------SINGLE USER---------------------------------------------------------------
		
//		User user = userDao.getUserByEmail("harsh@gmail.com");
//		System.out.println("Name : " + user.getName());
//		System.out.println("Email : " + user.getEmail());
//		System.out.println("Gender : " + user.getGender());
//		System.out.println("City " + user.getCity());
		
		//-----------------------------MULTIPLE USER--------------------------------------------------
		List<User> list = userDao.getAllUsers();
		
		for (User user : list) {
			System.out.println("Name : " + user.getName());
			System.out.println("Email : " + user.getEmail());
			System.out.println("Gender : " + user.getGender());
			System.out.println("City " + user.getCity());
			System.out.println("---------------------------------------------------");
		}
	}

}
