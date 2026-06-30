package cl.duoc.itinerary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class ItineraryResponseDTO {

    private UUID id;
    private UUID travelerId;
    private String nombreViaje;
    private String destino;
    private List<PlaceResponseDTO> places;

}
