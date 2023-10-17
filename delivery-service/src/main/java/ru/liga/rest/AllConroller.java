package ru.liga.rest;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.entities.Order;
import ru.liga.repo.OrderRepository;

@Tag(name = "FctReportController", description = "Api Сущности \"Общая информация по отчету\"")
@RestController
@RequiredArgsConstructor
@RequestMapping("/fct-report")
public class AllConroller {

    @Autowired
    OrderRepository orderRepository;

    @Operation(summary = "Создать заказ")
    @PostMapping(name = "/create-order")
    Order createOrder(Order order) {
        var savedOrder = orderRepository.save(order);
        return orderRepository.findById(savedOrder.getId()).get();
    }




}
