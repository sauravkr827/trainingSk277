package de.hybris.trainingSk277.core.customDao.impl;

import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.constants.SearchConstants;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingSk277.core.customDao.ManufacturerDetailsDao;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultManufacturerDetailsDao  implements ManufacturerDetailsDao {

    FlexibleSearchService flexibleSearchService;
    PaginatedFlexibleSearchService paginatedFlexibleSearchService;

    @Override
    public ManufacturerDetailsModel getManufacturerDetailsById(int id)
    {
        HashMap<String , Object> hashMap=new HashMap<>();

        String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"} WHERE {"+ManufacturerDetailsModel.ID+"}=?id";

        hashMap.put("id",id);

        SearchResult<ManufacturerDetailsModel> searchResult=getFlexibleSearchService().search(query,hashMap);


        return searchResult.getResult().get(0);
    }





    @Override
    public List<ManufacturerDetailsModel> getListOfManufacturerData()
    {
        String str="SELECT {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";

        SearchResult<ManufacturerDetailsModel> searchResult=getFlexibleSearchService().search(str);

        return searchResult.getResult();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationEX(int currentPage) {
        int range = 10;
        int start = currentPage;
        start = start * range;

        String query = "SELECT {" + ManufacturerDetailsModel.PK + "} FROM{" + ManufacturerDetailsModel._TYPECODE + "}";
        FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        fQuery.setCount(range);
        fQuery.setNeedTotal(true);
        fQuery.setStart(start);
        SearchResult<ManufacturerDetailsModel> searchResult = getFlexibleSearchService().search(fQuery);

        return searchResult.getResult();
    }



    @Override
    public List<ManufacturerDetailsModel> paginationAPi(int currentPage) {
        int pageSize=5;
        String query="SELECT  {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";
        FlexibleSearchQuery flexibleSearchQuery =new FlexibleSearchQuery(query);
        PaginatedFlexibleSearchParameter  parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(flexibleSearchQuery);
        SearchPageData searchPageData=  PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,true);


         parameter.setSearchPageData(searchPageData);


        SearchPageData<ManufacturerDetailsModel>searchPageData1=getPaginatedFlexibleSearchService().search(parameter);
        return searchPageData1.getResults();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationApiSort(int currentPage) {
        int pageSize=5;
        String query="SELECT  {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";
        FlexibleSearchQuery flexibleSearchQuery =new FlexibleSearchQuery(query);
        PaginatedFlexibleSearchParameter  parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(flexibleSearchQuery);

        Map<String,String> sortMap=new HashMap<>();
        sortMap.put(ManufacturerDetailsModel.ID, SearchConstants.DESCENDING);
        SearchPageData searchPageData =  PaginatedSearchUtils.createSearchPageDataWithPaginationAndSorting(5,currentPage,true,sortMap);
        parameter.setSearchPageData(searchPageData);

        SearchPageData<ManufacturerDetailsModel> modelSearchPageData=getPaginatedFlexibleSearchService().search(parameter);

        modelSearchPageData.getSorts();
        return modelSearchPageData.getResults();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage) {
        int pageSize=5;

        String query="SELECT  {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"} ORDER BY {"+ManufacturerDetailsModel.ID+"} DESC";;

        FlexibleSearchQuery flexibleSearchQuery =new FlexibleSearchQuery(query);
        PaginatedFlexibleSearchParameter  parameter=new PaginatedFlexibleSearchParameter();

         parameter.setFlexibleSearchQuery(flexibleSearchQuery);
        SearchPageData searchPageData=  PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,true);


        parameter.setSearchPageData(searchPageData);


        SearchPageData<ManufacturerDetailsModel>searchPageData1=getPaginatedFlexibleSearchService().search(parameter);
        return searchPageData1.getResults();
    }





    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }



    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }


}
