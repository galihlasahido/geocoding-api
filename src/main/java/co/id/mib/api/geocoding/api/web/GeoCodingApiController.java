package co.id.mib.api.geocoding.api.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@RestController
public class GeoCodingApiController {
    private static final Logger log = LoggerFactory.getLogger(GeoCodingApiController.class);
    private static final String GEOCODING_URI = "https://maps.googleapis.com/maps/api/geocode/json";

    @Autowired
    private Environment env;

    @PostMapping(value = "/geocode", consumes = "application/json", produces = "application/json")
    public Map<String, Object> getGeoCodingForLoc(@RequestBody GeoCodingRequest address) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI)
                .queryParam("address", address.toString())
                .queryParam("components", "country:ID")
                .queryParam("key", env.getProperty("apiKey"));

        Map geoCoding = restTemplate.getForObject(builder.toUriString(), Map.class);
        return geoCoding;
    }

    @PostMapping(value = "/reversegeocode", consumes = "application/json", produces = "application/json")
    public Map<String, Object> getReverseGeoCodingForLoc(@RequestBody ReverseGeoCodingRequest address) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI)
                .queryParam("latlng", address.toString())
                .queryParam("key", env.getProperty("apiKey"));

        Map geoCoding = restTemplate.getForObject(builder.toUriString(), Map.class);
        return geoCoding;
    }

    @GetMapping(value = "/place_id")
    public Map<String, Object> getPlace_idGeoCodingForLoc(@RequestParam String place_id) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI)
                .queryParam("place_id", place_id)
                .queryParam("key", env.getProperty("apiKey"));

        Map geoCoding = restTemplate.getForObject(builder.toUriString(), Map.class);
        return geoCoding;
    }
}
