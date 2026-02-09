package client;

import converter.JSONDataProvider;

public class Client {
    private JSONDataProvider jsonDataProvider;
    public Client(JSONDataProvider jsonDataProvider){
        this.jsonDataProvider = jsonDataProvider;
    }

    public void getProcessedData(){
        String rawData = "rawData";
        String processedData = jsonDataProvider.getJSONData(rawData);
        System.out.println(processedData);
    }
}
