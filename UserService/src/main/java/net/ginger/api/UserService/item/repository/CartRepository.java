package net.ginger.api.UserService.item.repository;

import net.ginger.api.UserService.item.entity.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}