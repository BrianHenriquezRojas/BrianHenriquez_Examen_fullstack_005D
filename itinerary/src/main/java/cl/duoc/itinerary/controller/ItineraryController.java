package cl.duoc.itinerary.controller;

import cl.duoc.itinerary.model.Itinerary;
import cl.duoc.itinerary.service.ItineraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/itinerary")
public class ItineraryController {

    private final ItineraryService itineraryService;

    public ItineraryController(ItineraryService itineraryService) {
        this.itineraryService = itineraryService;
    }

    @GetMapping
    public List<Itinerary> getAll() {
        return itineraryService.findAll();
    }

    @GetMapping("/{id}")
    public Itinerary getById(@PathVariable Long id) {
        return itineraryService.findById(id);
    }

    @PostMapping
    public Itinerary save(@RequestBody Itinerary itinerary) {
        return itineraryService.save(itinerary);
    }

    @PutMapping("/{id}")
    public Itinerary update(@PathVariable Long id,
                            @RequestBody Itinerary itinerary) {
        return itineraryService.update(id, itinerary);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itineraryService.delete(id);
    }
}