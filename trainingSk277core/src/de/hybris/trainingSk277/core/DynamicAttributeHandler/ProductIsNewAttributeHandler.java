package de.hybris.trainingSk277.core.DynamicAttributeHandler;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProductIsNewAttributeHandler implements DynamicAttributeHandler<Boolean, ProductModel> {
    @Override
    public Boolean get(ProductModel model) {
        final Date modelCreationTime=model.getCreationtime();

        DateFormat dateFormat3 = new SimpleDateFormat("dd");

        String a=  dateFormat3.format(modelCreationTime);

        int registerationDate=Integer.parseInt(a);

        int currentDate= Calendar.getInstance().get(Calendar.DATE);

        int differenceOfDate=currentDate-registerationDate;

        if(differenceOfDate<=10)
        {
            return true;

        }

        else
        {
            return false;
        }
    }

    @Override
    public void set(ProductModel model, Boolean aBoolean) {

    }

    /*   Date modelCreationTime= model.getCreationtime();

        Calendar calendar = Calendar.getInstance();

        Date todayDate=calendar.getTime();

        long diff=(todayDate.getTime())-(modelCreationTime.getTime());

        long diff_In_Days=(diff/(1000*60*60*24))%365;


        if(diff_In_Days<10)
        {
            return  true;
        }

        else
        {
            return false;
        }
*/
}
