package cl.duoc.itinerary.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "itinerary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "traveler_id")
    private Long travelerId;
    
    @Column(name = "nombre_viaje")
    private String nombreViaje;

    private String destino;

    @OneToMany(mappedBy = "itinerary", cascade = CascadeType.ALL)
    private List<Place> places;
}