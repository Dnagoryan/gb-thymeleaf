package ru.gb.gbthymeleaf.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbthymeleaf.entity.Cart;
import ru.gb.gbthymeleaf.entity.Product;

import java.util.List;

public interface CartDao  extends JpaRepository<Cart, Long> {


    Cart findCartsById(Long id);

}
