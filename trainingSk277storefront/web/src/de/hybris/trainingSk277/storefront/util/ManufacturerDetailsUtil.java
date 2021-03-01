package de.hybris.trainingSk277.storefront.util;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSk277.storefront.customCommand.ManufacturerDetailsCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("manufacturerDetailsUtil")
public class ManufacturerDetailsUtil
{
    @Autowired
    ModelService modelService;
    public ManufacturerDetailsModel converterCommandToModel(ManufacturerDetailsCommand command)
    {
        ManufacturerDetailsModel model=modelService.create(ManufacturerDetailsModel.class);
        model.setId(command.getId());
        model.setName(command.getName());
        model.setCity(command.getCity());
        model.setCountry(command.getCountry());

        return model;


    }
}
