package de.hybris.trainingSk277.storefront.customCommand;

import de.hybris.platform.core.model.c2l.CountryModel;

public class ManufacturerDetailsCommand
{
    private int id;
    private String name;
    private String city;
    private CountryModel country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }
}
