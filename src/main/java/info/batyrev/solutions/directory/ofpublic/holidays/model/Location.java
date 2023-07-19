package info.batyrev.solutions.directory.ofpublic.holidays.model;

import org.springframework.util.StringUtils;

public class Location extends Entity {

    private Country country;

    private String region;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String toString() {
        return country.toString() + (
                StringUtils.hasLength(region) ? "/" + region : ""
        );
    }
}
