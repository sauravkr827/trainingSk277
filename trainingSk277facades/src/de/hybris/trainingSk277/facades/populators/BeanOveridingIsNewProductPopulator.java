package de.hybris.trainingSk277.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class BeanOveridingIsNewProductPopulator extends ProductBasicPopulator<ProductModel, ProductData>
{


    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        super.populate(productModel, productData);

        productData.setIsNewProduct(productModel.getIsNewProduct());
    }
}
