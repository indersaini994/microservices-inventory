package wipro.io.repository;

import org.springframework.data.repository.CrudRepository;

import wipro.io.model.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, String> {

}
