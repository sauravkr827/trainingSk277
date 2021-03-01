package de.hybris.trainingSk277.core.customDao;

import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;

import java.util.List;

public interface ManufacturerDetailsDao
{
   public ManufacturerDetailsModel getManufacturerDetailsById(int id);
   public List<ManufacturerDetailsModel> getListOfManufacturerData();
   public List<ManufacturerDetailsModel> paginationEX(int currentPage);
   public List<ManufacturerDetailsModel> paginationAPi(int currentPage);
   public List<ManufacturerDetailsModel> paginationApiSort(int currentPage);
   public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage);


}
