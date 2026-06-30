package cl.duoc.itinerary.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ItineraryRequestDTO {

    @NotNull(message = "El viaje es obligatorio")
    private UUID travelerId;

    @NotBlank(message = "El nombre del viaje es obligatorio")
    private String nombreViaje;

    @NotBlank(message = "El destino es obligatorio")
    private String destino;

    private List<ItineraryRequestDTO> places;

}