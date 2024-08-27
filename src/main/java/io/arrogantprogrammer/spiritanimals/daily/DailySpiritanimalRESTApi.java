package io.arrogantprogrammer.spiritanimals.daily;

import io.arrogantprogrammer.spiritanimals.daily.api.AssignSpiritAnimalCommand;
import io.arrogantprogrammer.spiritanimals.daily.api.DailySpiritAnimalApi;
import io.arrogantprogrammer.spiritanimals.daily.api.DailySpiritAnimalRecord;
import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/spiritanimal")
public class DailySpiritanimalRESTApi implements DailySpiritAnimalApi {

    @Inject
    DailySpiritAnimalService dailySpiritAnimalService;

    @Override
    public List<DailySpiritAnimalRecord> todaysSpiritAnimals() {
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public DailySpiritAnimalRecord assignSpiritAnimal(AssignSpiritAnimalCommand command) {
        Log.debugf("Assigning spirit animal for {}", command.name());
        return dailySpiritAnimalService.assignSpiritAnimal(command.name());
    }
}
