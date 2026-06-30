package cl.duoc.itinerary.repository;

import cl.duoc.itinerary.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}