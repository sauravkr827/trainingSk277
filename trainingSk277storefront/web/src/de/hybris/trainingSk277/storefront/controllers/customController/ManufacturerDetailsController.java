package de.hybris.trainingSk277.storefront.controllers.customController;

import de.hybris.trainingSk277.core.customCommandService.ManufacturerDetailsCommandService;
import de.hybris.trainingSk277.core.customService.impl.DefaultManufacturerDetailsService;
import de.hybris.trainingSk277.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSk277.facades.customeFacad.impl.DefaultManufacturerDetailsFacad;
import de.hybris.trainingSk277.facades.product.data.ManufacturerDetailsData;
import de.hybris.trainingSk277.storefront.controllers.ControllerConstants;
import de.hybris.trainingSk277.storefront.customCommand.ManufacturerDetailsCommand;
import de.hybris.trainingSk277.storefront.util.ManufacturerDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class ManufacturerDetailsController {

    @Resource(name = "defaultManufacturerDetailsFacade")
    DefaultManufacturerDetailsFacad defaultManufacturerDetailsFacade;

    @Resource(name="manufacturerDetailsUtil")
    ManufacturerDetailsUtil manufacturerDetailsUtil;

    @Resource(name="commandService")
    ManufacturerDetailsCommandService commandService;

    @Autowired
    DefaultManufacturerDetailsService defaultManufacturerDetailsService;


    @RequestMapping("/getById/{id}")
    public String getManufacturerDetailsById(@PathVariable("id") int id, Model model)
    {
        ManufacturerDetailsData manufacturerDetailsData=defaultManufacturerDetailsFacade.getManufacturerDetailsById(id);

        model.addAttribute("data",manufacturerDetailsData);

        return ControllerConstants.Views.Pages.ManufacturerDetails.singleData;

    }

    @RequestMapping("/listOfManufacturerDetails")
    public String listOfManufacturerDetails(Model model)
    {
        List<ManufacturerDetailsData> detailsDataList=defaultManufacturerDetailsFacade.getListOfManufacturerData();

        model.addAttribute("data",detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.listOfData;
    }


    @RequestMapping("/pagination/{currentPage}")
    public String paginationEx(@PathVariable("currentPage") int currentPage, Model model)
    {
        List<ManufacturerDetailsData> detailsDataList=defaultManufacturerDetailsFacade.paginationEX(currentPage);

        model.addAttribute("data",detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }
    @RequestMapping("/paginationApi/{currentPage}")
    public String paginationApi(@PathVariable("currentPage") int currentPage, Model model)
    {
        List<ManufacturerDetailsData> detailsDataList=defaultManufacturerDetailsFacade.paginationAPi(currentPage);

        model.addAttribute("data",detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping("/paginationSort/{currentPage}")
    public String paginationSort(@PathVariable("currentPage") int currentPage, Model model)
    {
        List<ManufacturerDetailsData> detailsDataList=defaultManufacturerDetailsFacade.paginationApiSort(currentPage);

        model.addAttribute("data",detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping("/paginationOrderByDesc/{currentPage}")
    public String paginationOrderByDesc(@PathVariable("currentPage") int currentPage, Model model)
    {
        List<ManufacturerDetailsData> detailsDataList=defaultManufacturerDetailsFacade.paginationOrderByDesc(currentPage);

        model.addAttribute("data",detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String getDataByUser(Model model)
    {
        model.addAttribute("model",new ManufacturerDetailsCommand());

        return ControllerConstants.Views.Pages.ManufacturerDetails.form;
    }

    @RequestMapping(value = "/saveData",method = RequestMethod.POST)
    public String saveModel(@ModelAttribute("model")ManufacturerDetailsCommand detailsModel, Model model)
    {

        ManufacturerDetailsModel manufacturerDetailsModel=manufacturerDetailsUtil.converterCommandToModel(detailsModel);

        String msg=commandService.executeSave(manufacturerDetailsModel);
        model.addAttribute("msg",msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.form;
    }


      @RequestMapping(value = "/update/{id}" ,method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") int id, Model model)
    {
        ManufacturerDetailsModel manufacturerDetailsModel=defaultManufacturerDetailsService.getManufacturerDetailsById(id);

        model.addAttribute("model",manufacturerDetailsModel);

        return ControllerConstants.Views.Pages.ManufacturerDetails.update;


    }

    @RequestMapping (value ="/saveUpdate",method = RequestMethod.POST)
    public String saveUpdate(@ModelAttribute("model")ManufacturerDetailsModel manufacturerDetailsModel,Model model)
    {
        String msg= commandService.executeSave(manufacturerDetailsModel);

        model.addAttribute("msg",msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.update;

    }


}
