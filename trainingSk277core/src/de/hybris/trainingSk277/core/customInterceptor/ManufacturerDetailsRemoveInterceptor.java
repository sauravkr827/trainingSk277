/*
package de.hybris.trainingSk277.core.customInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsAuditEntryModel;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import java.util.Date;

public class ManufacturerDetailsRemoveInterceptor implements RemoveInterceptor<ManufacturerDetailsModel> {


    @Override
    public void onRemove(ManufacturerDetailsModel model, InterceptorContext ctx) throws InterceptorException
    {
       Manufac auditEntryModel=ctx.getModelService().create(ManufacturerDetailsAuditEntryModel.class);

        auditEntryModel.setId(model.getId());
        auditEntryModel.setName(model.getName());
        auditEntryModel.setCountry(model.getCountry());
        auditEntryModel.setRmvCreationTime(new Date());
        ctx.registerElement(auditEntryModel);


    }
}
*/
