package co.id.mib.api.geocoding.api.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReverseGeoCodingRequest {
    @JsonProperty(value = "latlng")
    private String latlng;

    public String getLatlng() {
        return latlng;
    }

    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    @Override
    public String toString() {
        return "ReverseGeoCodingRequest{" +
                "latlng='" + latlng + '\'' +
                '}';
    }
}
