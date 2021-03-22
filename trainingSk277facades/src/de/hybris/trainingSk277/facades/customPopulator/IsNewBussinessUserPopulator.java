package de.hybris.trainingSk277.facades.customPopulator;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;

public class IsNewBussinessUserPopulator extends CustomerPopulator

{
    @Override
    public void populate(CustomerModel source, CustomerData target) {
        super.populate(source, target);


        target.setIsNewBussinessUser(source.getIsNewBussinessUser());
    }
}
