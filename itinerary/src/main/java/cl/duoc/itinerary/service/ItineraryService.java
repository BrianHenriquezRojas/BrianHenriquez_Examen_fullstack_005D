package cl.duoc.itinerary.service;

import cl.duoc.itinerary.model.Itinerary;
import cl.duoc.itinerary.repository.ItineraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraryService {

    private final ItineraryRepository repository;

    public ItineraryService(ItineraryRepository repository) {
        this.repository = repository;
    }

    public List<Itinerary> findAll() {
        return repository.findAll();
    }

    public Itinerary findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Itinerary save(Itinerary itinerary) {
        return repository.save(itinerary);
    }

    public Itinerary update(Long id, Itinerary itinerary) {
        itinerary.setId(id);
        return repository.save(itinerary);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}