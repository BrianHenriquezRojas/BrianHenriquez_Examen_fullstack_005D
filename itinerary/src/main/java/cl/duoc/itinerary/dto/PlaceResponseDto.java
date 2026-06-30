package cl.duoc.itinerary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaceResponseDTO {

    private Long id;
    private String nombre;
    private String tipo;

}
