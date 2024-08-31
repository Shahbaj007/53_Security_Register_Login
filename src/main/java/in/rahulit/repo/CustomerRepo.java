package in.rahulit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	public Customer findByUname(String uname);
	
}
