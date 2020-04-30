package co.id.mib.api.geocoding.api.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GeoCodingRequest {
    @JsonProperty(value = "alamat")
    private String alamat;

    @JsonProperty(value = "kelurahan")
    private String kelurahan;

    @JsonProperty(value = "kecamatan")
    private String kecamatan;

    @JsonProperty(value = "kota")
    private String kota;

    @JsonProperty(value = "kode_pos")
    private String kode_pos;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    @Override
    public String toString() {
        return alamat.replaceAll("\\s+","+").toLowerCase() +
                "+"+kelurahan.replaceAll("\\s+","+").toLowerCase() +
                "+Kec+" + kecamatan.replaceAll("\\s+","+").toLowerCase() +
                "+Kota+" + kota.replaceAll("\\s+","+").toLowerCase() +
                "+"+kode_pos;
    }
}
