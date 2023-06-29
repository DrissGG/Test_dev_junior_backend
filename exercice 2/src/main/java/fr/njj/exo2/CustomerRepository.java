package fr.njj.exo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByLastName(String lastName);

    @org.springframework.data.jpa.repository.Query("SELECT AVG(age) FROM Customer")
    double getAverageAge();
}