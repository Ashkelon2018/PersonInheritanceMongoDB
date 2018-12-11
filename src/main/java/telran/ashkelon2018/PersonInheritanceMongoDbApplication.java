package telran.ashkelon2018;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Child;
import telran.ashkelon2018.person.domain.Employee;
import telran.ashkelon2018.person.domain.Person;
import telran.ashkelon2018.person.service.PersonService;

@SpringBootApplication
public class PersonInheritanceMongoDbApplication implements CommandLineRunner {
	
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(PersonInheritanceMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Person> persons = new ArrayList<>();
//		Address[] addresses = {
//				new Address("Ashkelon", "Bar Kohva", 209, 100500),
//				new Address("Rehovot", "Plaut", 10, 3),
//				new Address("Holon", "Herzl", 3, 15)
//		};
//		persons.add(new Child("peter@gmail.com", "Peter",
//				LocalDate.of(2014, 4, 12), addresses[2], "Shalom"));
//
//		persons.add(new Child("vasya@gmail.com", "Vasya",
//				LocalDate.of(2014, 4, 12), addresses[2], "Shalom"));
//		
//		persons.add(new Employee("john@gmail.com", "John",
//				LocalDate.of(1996, 6, 12), addresses[1], "Motorola", 16000));
//		
//		persons.add(new Employee("jane@gmail.com", "Jane",
//				LocalDate.of(1999, 11, 8), addresses[0], "IBM", 21000));
//		personService.addPersons(persons);


	}
}
