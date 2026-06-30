package cl.duoc.itinerary.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "place")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "itinerary_id")
    private Itinerary itinerary;
}