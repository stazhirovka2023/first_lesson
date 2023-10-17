package ru.liga.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_menu_item")
public class RestaurantMenuItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "res_menu_seq_gen")
    @SequenceGenerator(name = "res_menu_seq_gen", sequenceName = "res_menu_seq", allocationSize = 1)
    private Long id;

    @Column(name = "price")
    private Double price;

    private String description;

    private Byte image;

    @OneToOne
    @JoinColumn(name = "restaurant_item_id")
    private OrderItem orderItem;
}
