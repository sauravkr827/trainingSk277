package de.hybris.trainingSk277.facades.customeFacad;

import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSk277.facades.product.data.ManufacturerDetailsData;

import java.util.List;

public interface ManufacturerDetailsFacad {

    public ManufacturerDetailsData getManufacturerDetailsById(int id);
    public List<ManufacturerDetailsData> getListOfManufacturerData();

    public List<ManufacturerDetailsData> paginationEX(int currentPage);
    public List<ManufacturerDetailsData> paginationAPi(int currentPage);
    public List<ManufacturerDetailsData> paginationApiSort(int currentPage);
    public List<ManufacturerDetailsData> paginationOrderByDesc(int currentPage);
}
