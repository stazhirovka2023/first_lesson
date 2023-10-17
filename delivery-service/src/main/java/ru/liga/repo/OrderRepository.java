package ru.liga.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.liga.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findOrderByStatus(String status);


    @Modifying
    @Transactional
    @Query("update Order ord set ord.status = :status where ord.id = :id")
    void updateOrderStatus(@Param("id") Long registryInfoId, @Param("status") String status);

    @Transactional(readOnly = true)
    @Query("select ord from Order ord where ord.status = :status")
    Order findOrderByStatusQuery(@Param("status") String status);
}
