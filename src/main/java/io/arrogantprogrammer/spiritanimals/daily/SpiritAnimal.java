package io.arrogantprogrammer.spiritanimals.daily;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class SpiritAnimal extends PanacheEntity {

    String name;
}
