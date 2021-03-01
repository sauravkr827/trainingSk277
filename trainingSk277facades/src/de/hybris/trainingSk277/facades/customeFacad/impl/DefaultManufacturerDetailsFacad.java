package de.hybris.trainingSk277.facades.customeFacad.impl;

import de.hybris.trainingSk277.core.customService.impl.DefaultManufacturerDetailsService;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSk277.facades.customeFacad.ManufacturerDetailsFacad;
import de.hybris.trainingSk277.facades.product.data.ManufacturerDetailsData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultManufacturerDetailsFacad implements ManufacturerDetailsFacad {


    Converter<ManufacturerDetailsModel,ManufacturerDetailsData> manufacturerDetailsDataConverter;
    DefaultManufacturerDetailsService manufacturerDetailsService;
    @Override
    public ManufacturerDetailsData getManufacturerDetailsById(int id) {

        ManufacturerDetailsModel detailsModel=getManufacturerDetailsService().getManufacturerDetailsById(id);
        ManufacturerDetailsData manufacturerDetailsData=getManufacturerDetailsDataConverter().convert(detailsModel);



        return manufacturerDetailsData;
    }

    @Override
    public List<ManufacturerDetailsData> getListOfManufacturerData() {

       List<ManufacturerDetailsModel> modelList=getManufacturerDetailsService().getListOfManufacturerData();
       List<ManufacturerDetailsData> detailsDataList=getManufacturerDetailsDataConverter().convertAll(modelList);



        return detailsDataList;
    }

    @Override
    public List<ManufacturerDetailsData> paginationEX(int currentPage) {
        List<ManufacturerDetailsModel> modelList=getManufacturerDetailsService().paginationEX(currentPage);
        List<ManufacturerDetailsData> dataList=getManufacturerDetailsDataConverter().convertAll(modelList);
        return dataList;
    }

    @Override
    public List<ManufacturerDetailsData> paginationAPi(int currentPage) {
        List<ManufacturerDetailsModel> modelList=getManufacturerDetailsService().paginationAPi(currentPage);
        List<ManufacturerDetailsData> dataList=getManufacturerDetailsDataConverter().convertAll(modelList);
        return dataList;
    }

    @Override
    public List<ManufacturerDetailsData> paginationApiSort(int currentPage) {
        List<ManufacturerDetailsModel> modelList=getManufacturerDetailsService().paginationApiSort(currentPage);
        List<ManufacturerDetailsData> dataList=getManufacturerDetailsDataConverter().convertAll(modelList);
        return dataList;
    }

    @Override
    public List<ManufacturerDetailsData> paginationOrderByDesc(int currentPage) {
        List<ManufacturerDetailsModel> modelList=getManufacturerDetailsService().paginationOrderByDesc(currentPage);
        List<ManufacturerDetailsData> dataList=getManufacturerDetailsDataConverter().convertAll(modelList);
        return dataList;
    }


    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsDataConverter() {
        return manufacturerDetailsDataConverter;
    }

    @Required
    public void setManufacturerDetailsDataConverter(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsDataConverter) {
        this.manufacturerDetailsDataConverter = manufacturerDetailsDataConverter;
    }

    public DefaultManufacturerDetailsService getManufacturerDetailsService() {
        return manufacturerDetailsService;
    }

    @Required
    public void setManufacturerDetailsService(DefaultManufacturerDetailsService manufacturerDetailsService) {
        this.manufacturerDetailsService = manufacturerDetailsService;
    }
}
