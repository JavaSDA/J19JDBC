package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "items")
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @Column(name = "qty_in_stock")
    private int qty;

    @Column(name = "price")
    private float price;

    public Item(String name, String desc, int qty, float price) {
        this.name = name;
        this.desc = desc;
        this.qty = qty;
        this.price = price;
    }
}
