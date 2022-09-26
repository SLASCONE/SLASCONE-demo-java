package Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Model.ActivateInfo;
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.AnalyticalFieldValue;
import Model.ConsumptionHeartbeatDto;
import Model.ConsumptionHeartbeatValueDto;
import Model.SessionDto;
import Model.UsageFeatureValueDto;
import Model.UsageHeartbeatDto;


public class Program {
	
	// ToDo: Insert the parameter for the respective function
	public static void main(String [] args) throws Exception
	{
        // ToDo: (Un)comment specific scenario
        ActivateExample();
        HeartbeatExample();
        AnalyticalHeartbeatExample();
        UsageHeartbeatExample();
        ConsumptionHeartbeatExample();
        OpenSessionExample();
        CloseSessionExample();     
	}
		
	private static void ActivateExample() throws Exception {
        var slasconeProxy = new SampleProxy();      
		
        System.out.println(slasconeProxy.GetUniqueDeviceId());
        // ToDo: Fill the variables
        var result = slasconeProxy.Activate(new ActivateInfo("b18657cc-1f7c-43fa-e3a4-08da6fa41ad3", "27180460-29df-4a5a-a0a1-78c85ab6cee0",
            "test85765", "test", "test"));

        // If the activation failed, the api server responses with a specific error message which describes the problem. Therefore the LicenseInfo object is declared with null.
        if (result.WarningInfo != null)
        {
        	System.out.println(result.WarningInfo.message);
            //Example Warning handling
            if (result.WarningInfo.id == 2006)
            { 
            }
        }
        else if (result.LicenseInfo != null)
        {
        	System.out.println("Successfull activation.");            
        }
        else
        {
        	System.out.println("Unknown Error");
        }
    
    }
	private static void HeartbeatExample() throws Exception {
		
		var slasconeProxy = new SampleProxy();
		
		 // ToDo: Fill the variables
        var heartBeatDto = new AddHeartbeatDto();
        heartBeatDto.setClient_id(slasconeProxy.GetUniqueDeviceId());
        //heartBeatDto.setGroup_id(null);
        //heartBeatDto.setHeartbeat_type_id(null);
        heartBeatDto.setOperating_system(slasconeProxy.GetOperatingSystem());
        heartBeatDto.setProduct_id(UUID.fromString("b18657cc-1f7c-43fa-e3a4-08da6fa41ad3"));
        heartBeatDto.setSoftware_version("22.2");
        //heartBeatDto.setToken_key(null);
        
        var result = slasconeProxy.AddHeartbeat(heartBeatDto);
        if (result.WarningInfo != null)
        {
        	System.out.println(result.WarningInfo.message);
            //Example Warning handling
            if (result.WarningInfo.id == 2006)
            { 
            }
        }
        else if (result.LicenseInfo != null)
        {
        	System.out.println("Successfully created heartbeat.");            
        }
        else
        {
        	System.out.println("Unknown Error");
        }
	}
    private static void AnalyticalHeartbeatExample() throws Exception {
		
		var slasconeProxy = new SampleProxy();		        
        // ToDo: Fill the variables
        var analyticalHb = new AnalyticalHeartbeat();
        analyticalHb.setClient_id(slasconeProxy.GetUniqueDeviceId());
        var analyticalField = new AnalyticalFieldValue();
        analyticalField.setAnalytical_field_id(UUID.fromString("2754aca1-4d1a-4af3-9387-08da9ac54c6d"));
        analyticalField.setValue("SQL Server 2019");

        List<AnalyticalFieldValue> valueList = new ArrayList<AnalyticalFieldValue>();
        valueList.add(analyticalField);

        analyticalHb.setAnalytical_heartbeat(valueList);
  

        var result = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);
        if (result.WarningInfo!= null)
        {
        	System.out.println(result.WarningInfo.message);
            //Example Warning handling
            if (result.WarningInfo.id == 2006)
            { 
            }            
        }
        else if (result.SuccessInfo != null)
        {
        	System.out.println("Successfully created analytical heartbeat.");            
        }
        else
        {
        	System.out.println("Unknown Error");
        }       
        
	}
    private static void UsageHeartbeatExample() throws Exception {
		
		var slasconeProxy = new SampleProxy();
		                
        // ToDo: Fill the variables
     	var usageFeatureValue1 = new UsageFeatureValueDto();
    	usageFeatureValue1.setUsage_feature_id(UUID.fromString("66099049-0472-467c-6ea6-08da9ac57d7c"));
    	usageFeatureValue1.setUsage_module_id(null);
     	usageFeatureValue1.setValue(3);
     		
     	var usageFeatureValue2 = new UsageFeatureValueDto();
     	usageFeatureValue2.setUsage_feature_id(UUID.fromString("e82619b1-f403-4e0d-5389-08da9e17dd73"));
    	usageFeatureValue2.setUsage_module_id(null);
    	usageFeatureValue2.setValue(2);
     	
     	List<UsageFeatureValueDto> usageFeatureValueList = new ArrayList<UsageFeatureValueDto>();
     	usageFeatureValueList.add(usageFeatureValue1);
     	usageFeatureValueList.add(usageFeatureValue2);
     		
     	var usageHeartbeatDto = new UsageHeartbeatDto();
     	usageHeartbeatDto.setClient_id(slasconeProxy.GetUniqueDeviceId());
     	usageHeartbeatDto.setUsage_heartbeat(usageFeatureValueList);
     	//usageHeartbeatDto.setToken_key(null);

     	var result = slasconeProxy.AddUsageHeartbeat(usageHeartbeatDto);
         if (result.WarningInfo!= null)
         {
             System.out.println(result.WarningInfo.message);
            //Example Warning handling
            if (result.WarningInfo.id == 2006)
            { 
            }             
         }
         else if (result.SuccessInfo != null)
         {
             System.out.println("Successfully created usage heartbeat.");            
         }
         else
         {
             System.out.println("Unknown Error");
         }   

	}
    private static void ConsumptionHeartbeatExample() throws Exception {
		
		var slasconeProxy = new SampleProxy();		       
        
        // ToDo: Fill the variables
     	var consumptionHeartbeatValue1 = new ConsumptionHeartbeatValueDto();
     	consumptionHeartbeatValue1.setLimitation_id(UUID.fromString("00cf2984-d71a-4c66-9f49-08da833189e3"));
     	//consumptionHeartbeatValue1.setTimestamp_utc(null);
     	consumptionHeartbeatValue1.setValue(5);
     		
     	
     	List<ConsumptionHeartbeatValueDto> consumptionHeartbeatValueDtoList = new ArrayList<ConsumptionHeartbeatValueDto>();
     	consumptionHeartbeatValueDtoList.add(consumptionHeartbeatValue1);

     		
     	var consumptionHeartbeat = new ConsumptionHeartbeatDto();
     	consumptionHeartbeat.setClient_id(slasconeProxy.GetUniqueDeviceId());
     	consumptionHeartbeat.setConsumption_heartbeat(consumptionHeartbeatValueDtoList);
     	//consumptionHeartbeat.setToken_key(null);

     	var result = slasconeProxy.AddConsumptionHeartbeat(consumptionHeartbeat);
         if (result.WarningInfo!= null)
         {
             System.out.println(result.WarningInfo.message);
            //Example Warning handling
            if (result.WarningInfo.id == 2006)
            { 
            }
                    
         }
         else if (result.SuccessInfo != null)
         {
             System.out.println("Successfully created consumption heartbeat.");            
         }
         else
         {
             System.out.println("Unknown Error");
         }  


	}
	private static void OpenSessionExample() throws Exception {
		var slasconeProxy = new SampleProxy();
		  	
    		   var sessionDto = new SessionDto();
    		   sessionDto.setClient_id(slasconeProxy.GetUniqueDeviceId());
    		   sessionDto.setLicense_id(UUID.fromString("27180460-29df-4a5a-a0a1-78c85ab6cee0"));
    		   
    		   var result = slasconeProxy.OpenSession(sessionDto);


               if (result.WarningInfo!= null)
               {
                   System.out.println(result.WarningInfo.message);
                  //Example Warning handling
                  if (result.WarningInfo.id == 2006)
                  { 
                  }             
               }
               else if (result.OpenSessionInfo != null)
               {
                   System.out.println("Successfully opened session.");            
               }
               else
               {
                   System.out.println("Unknown Error");
               }  
    	  
       
	}
    private static void CloseSessionExample() throws Exception {
		var slasconeProxy = new SampleProxy();
		  	
    		   var sessionDto = new SessionDto();
    		   sessionDto.setClient_id(slasconeProxy.GetUniqueDeviceId());
    		   sessionDto.setLicense_id(UUID.fromString("27180460-29df-4a5a-a0a1-78c85ab6cee0"));
    		   
    		   var result = slasconeProxy.CloseSession(sessionDto);
               if (result.WarningInfo!= null)
               {
                   System.out.println(result.WarningInfo.message);
                  //Example Warning handling
                  if (result.WarningInfo.id == 2006)
                  { 
                  }             
               }
               else if (result.SuccessInfo != null)
               {
                   System.out.println("Successfully closed session.");            
               }
               else
               {
                   System.out.println("Unknown Error");
               }  
    	  
       
	}
}
