package de.hybris.trainingSk277.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSk277.facades.product.data.ManufacturerDetailsData;

public class ManufacturerDetailsPopulator implements Populator<ManufacturerDetailsModel, ManufacturerDetailsData> {


    Converter<CountryModel, CountryData> countryDataConverter;

    @Override
    public void populate(ManufacturerDetailsModel source, ManufacturerDetailsData target) throws ConversionException {

     target.setId(source.getId());
     target.setName(source.getName());
     target.setCity(source.getCity());
     target.setCountry(getCountryDataConverter().convert(source.getCountry()));

    }

    public Converter<CountryModel, CountryData> getCountryDataConverter() {
        return countryDataConverter;
    }

    public void setCountryDataConverter(Converter<CountryModel, CountryData> countryDataConverter) {
        this.countryDataConverter = countryDataConverter;
    }
}
