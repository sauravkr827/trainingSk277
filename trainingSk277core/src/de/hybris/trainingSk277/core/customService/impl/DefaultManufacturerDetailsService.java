package de.hybris.trainingSk277.core.customService.impl;

import de.hybris.trainingSk277.core.customDao.impl.DefaultManufacturerDetailsDao;
import de.hybris.trainingSk277.core.customService.ManufacturerDetailsService;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;

import java.util.List;

public class DefaultManufacturerDetailsService implements ManufacturerDetailsService {


   private DefaultManufacturerDetailsDao manufacturerDetailsDao;

    @Override
    public ManufacturerDetailsModel getManufacturerDetailsById(int id) {
        return getManufacturerDetailsDao().getManufacturerDetailsById(id);
    }


    @Override
    public List<ManufacturerDetailsModel> getListOfManufacturerData() {
        return getManufacturerDetailsDao().getListOfManufacturerData();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationEX(int currentPage) {
        return getManufacturerDetailsDao().paginationEX(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationAPi(int currentPage) {
        return getManufacturerDetailsDao().paginationAPi(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationApiSort(int currentPage) {
        return getManufacturerDetailsDao().paginationApiSort(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage) {
        return getManufacturerDetailsDao().paginationOrderByDesc(currentPage);
    }



    public DefaultManufacturerDetailsDao getManufacturerDetailsDao() {
        return manufacturerDetailsDao;
    }

    public void setManufacturerDetailsDao(DefaultManufacturerDetailsDao manufacturerDetailsDao) {
        this.manufacturerDetailsDao = manufacturerDetailsDao;
    }
}
