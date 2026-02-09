package adapter;

import converter.JSONDataProvider;
import thirdparty.XMLDataProvider;

public class JSONDataProviderAdapter extends JSONDataProvider {
    private XMLDataProvider xmlDataProvider;
    @Override
    public String getJSONData(String data){
        String xmlData = xmlDataProvider.getXMLData(data);
        System.out.println("Passing through adapter");
        return xmlData+"JSON";
    }
}
