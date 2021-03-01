package de.hybris.trainingSk277.core.customCommandService;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import org.springframework.beans.factory.annotation.Autowired;

public class ManufacturerDetailsCommandService
{

    ModelService modelService;

    public String executeSave(ManufacturerDetailsModel model)
    {
        getModelService().save(model);
        return "Data Successfully Inserted";
    }



    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
