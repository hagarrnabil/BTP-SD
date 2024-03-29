package com.example.btpsd.repositories;

import com.example.btpsd.model.Currency;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

    @Query("select c from Currency c where lower(concat(c.code,' ', c.currencyCode,' ', c.description)) like lower(concat('%', ?1,'%'))")
    public List<Currency> search(String keyword);

}
