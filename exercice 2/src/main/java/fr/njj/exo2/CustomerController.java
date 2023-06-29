package fr.njj.exo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import fr.njj.exo2.Customer;
import fr.njj.exo2.CustomerRepository;

import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("")
    public ResponseEntity<List<Customer>> getCustomersByLastName(@RequestParam("last_name") String lastName) {
        Optional<Customer> customers = customerRepository.findByLastName(lastName);

        if (customers.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customers.get());
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<String> updateCustomer(@PathVariable("customerId") Long customerId,
                                                 @RequestHeader("key") String key,
                                                 @RequestBody Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById(customerId).orElse(null);

        if (existingCustomer == null) {
            return ResponseEntity.notFound().build();
        }

        if (!key.equals("Magic_Key")) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("La force n'est pas avec toi !");
        }

        if (updatedCustomer.getAge() < 18) {
            return ResponseEntity.badRequest().body("Le client doit être majeur (+ de 18 ans).");
        }

        existingCustomer.setFirstName(updatedCustomer.getFirstName());
        existingCustomer.setAge(updatedCustomer.getAge());
        customerRepository.save(existingCustomer);

        return ResponseEntity.ok("Mise à jour effectuée avec succès.");
    }

    @GetMapping("/age/average")
    public ResponseEntity<Double> getAverageAge() {
        Double averageAge = customerRepository.getAverageAge();

        if (averageAge == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(averageAge);
    }
}

