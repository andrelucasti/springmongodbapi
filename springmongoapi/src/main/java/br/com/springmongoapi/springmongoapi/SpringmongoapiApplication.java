package br.com.springmongoapi.springmongoapi;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springmongoapi.springmongoapi.Dao.DaoUser;
import br.com.springmongoapi.springmongoapi.models.User;

@SpringBootApplication
public class SpringmongoapiApplication implements  CommandLineRunner{

	private DaoUser mongoUser;

	private void loadUsers() {
		User u1 = new User("Andre", "andrelucasti", "123");
		User u2 = new User("Lucas", "lucasandreti", "321");
		
		this.mongoUser.save(Arrays.asList(u1,u2));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmongoapiApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		this.loadUsers();
		
	}
}
