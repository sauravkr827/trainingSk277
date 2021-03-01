package de.hybris.trainingSk277.core.customInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;

public class ManufacturerDetailsPrepareInterceptor implements PrepareInterceptor<ManufacturerDetailsModel> {
    @Override
    public void onPrepare(ManufacturerDetailsModel model, InterceptorContext interceptorContext) throws InterceptorException {

        String name=model.getName();
        String modifyName="Mr. "+name;

        model.setName(modifyName);

    }
}
