package io.arrogantprogrammer.spiritanimals.daily;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class DailySpiritAnimal extends PanacheEntity {

    String name;

    String spiritAnimal;

    @Column(name = "local_date", columnDefinition = "DATE")
    LocalDate date;

    protected DailySpiritAnimal() {
    }

    protected DailySpiritAnimal(String name, String spiritAnimal, LocalDate date) {
        this.name = name;
        this.spiritAnimal = spiritAnimal;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSpiritAnimal() {
        return spiritAnimal;
    }

    public LocalDate getDate() {
        return date;
    }
}
