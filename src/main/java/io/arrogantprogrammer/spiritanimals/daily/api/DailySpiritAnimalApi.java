package io.arrogantprogrammer.spiritanimals.daily.api;

import java.util.List;

public interface DailySpiritAnimalApi {

    List<DailySpiritAnimalRecord> todaysSpiritAnimals();

    DailySpiritAnimalRecord assignSpiritAnimal(AssignSpiritAnimalCommand command);
}
