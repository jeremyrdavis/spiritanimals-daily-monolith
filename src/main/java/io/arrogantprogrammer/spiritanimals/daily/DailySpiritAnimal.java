package io.arrogantprogrammer.spiritanimals.daily;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class DailySpiritAnimal extends PanacheEntity {

    Date date;

    String name;

    SpiritAnimal spiritAnimal;
}
