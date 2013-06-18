package com.stackmob.customcode;

import com.stackmob.core.InvalidSchemaException;
import com.stackmob.core.DatastoreException;
import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.rest.ProcessedAPIRequest;
import com.stackmob.core.rest.ResponseToProcess;
import com.stackmob.sdkapi.SDKServiceProvider;
import com.stackmob.sdkapi.*;

import java.net.HttpURLConnection;
import java.util.*;

public class CreateCustomer implements CustomCodeMethod {
    public static final String secretKey = "sk_test_kNaJjHDfUScYjmhFieYJR41W";


    @Override
    public String getMethodName() {
        return "createCustomer";
    }

    @Override
    public List<String> getParams() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ResponseToProcess execute(ProcessedAPIRequest request, SDKServiceProvider serviceProvider) {

        DataService ds = serviceProvider.getDataService();
        List<SMCondition> query = new ArrayList<SMCondition>();
        Map<String, List<SMObject>> results = new HashMap<String, List<SMObject>>();

        try {
            //Get the car with ID "12345"
            query.add(new SMEquals("username", new SMString("gmulroney@gmail.com")));

            // Read objects from the car schema
            results.put("results", ds.readObjects("pnuser", query));

        } catch (InvalidSchemaException ise) {
        } catch (DatastoreException dse) {}

        return new ResponseToProcess(HttpURLConnection.HTTP_OK, results);
    }
}