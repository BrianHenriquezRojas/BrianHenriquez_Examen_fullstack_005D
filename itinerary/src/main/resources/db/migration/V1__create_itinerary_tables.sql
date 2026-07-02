CREATE TABLE itinerary (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    traveler_id BIGINT NOT NULL,
    nombre_viaje VARCHAR(255),
    destino VARCHAR(255)
);

CREATE TABLE place (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    tipo VARCHAR(255),
    itinerary_id BIGINT,
    CONSTRAINT fk_place_itinerary
        FOREIGN KEY (itinerary_id)
        REFERENCES itinerary(id)
        ON DELETE CASCADE
);