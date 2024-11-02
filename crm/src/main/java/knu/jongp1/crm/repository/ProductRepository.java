package knu.jongp1.crm.repository;

import knu.jongp1.crm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
