package Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Model.ActivateInfo;
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.ConsumptionHeartbeatDto;
import Model.ConsumptionHeartbeatValueDto;
import Model.ProvisioningInfo;
import Model.ProvisioningMode;
import Model.SessionDto;
import Model.UnassignDto;
import Model.UsageFeatureValueDto;
import Model.UsageHeartbeatDto;
import Model.ValidateConsumptionStatusDto;
import Proxy.SampleProxy;

public class Program {
	
	// ToDo: Insert the parameter for the respective function
	public static void main(String [] args) throws Exception
	{
		var slasconeProxy = new SampleProxy();
		
        // ToDo: Fill the variables
        var activatedLicense = slasconeProxy.Activate(new ActivateInfo("49b47576-0317-42d6-9f5a-59f4c810d92a", "8850672b-ad4c-42dd-8861-24c8d82be093",
            "test", "test", "test"));

        // If the activation failed, the api server responses with a specific error message which describes the problem. Therefore the LicenseInfo object is declared with null.
        if (activatedLicense.LicenseInfo == null)
        {
        	System.out.println(activatedLicense.WarningInfo.message);
        }
        else
        {
        	System.out.println("Successfully activated license.");
        }
        
        // ToDo: Uncomment specific scenario
        //HeartbeatSample(activatedLicense);
        //FloatingLicensingSample(activatedLicense);
       
	}
	
	private static void FloatingLicensingSample(ProvisioningInfo activatedLicense) throws Exception {
		var slasconeProxy = new SampleProxy();
		
		 // ToDo: Fill the variables
       var heartBeatDto = new AddHeartbeatDto();
       heartBeatDto.setClient_id(null);
       heartBeatDto.setGroup_id(null);
       heartBeatDto.setHeartbeat_type_id(null);
       heartBeatDto.setOperating_system(null);
       heartBeatDto.setProduct_id(null);
       heartBeatDto.setSoftware_version(null);
       heartBeatDto.setToken_key(null);
       
       var heartbeatResult = slasconeProxy.AddHeartbeat(heartBeatDto);
       
       // If the heartbeat failed, the api server responses with a specific error message which describes the problem. Therefore the LicenseInfo object is declared with null.
       if (heartbeatResult.LicenseInfo == null)
       {
       	System.out.println(heartbeatResult.WarningInfo.message);
       }
       else
       {
          // After successfully generating a heartbeat the client have to check provisioning mode of the license. Is it floating a session has to be opened. 
    	  if(heartbeatResult.LicenseInfo.provisioning_mode == ProvisioningMode.Floating) {
    		   	
    		   var sessionDto = new SessionDto();
    		   sessionDto.setClient_id(null);
    		   sessionDto.setLicense_id(null);
    		   
    		   var openSessionResult = slasconeProxy.OpenSession(sessionDto);
    		  	
               // If the floating limit is reached the api server responses with an Error.
    		   if (openSessionResult.SessionViolationInfo == null)
               {
    			   System.out.println(openSessionResult.WarningInfo.message);
               }
               else
               {
            	   System.out.println("Session active until: " + openSessionResult.SessionViolationInfo.session_valid_until);
               }

               // If the client have finished his work, he has to close the session. Therefore other clients are not blocked anymore and have not to wait until another Client expired. 
               var closeSessionResult = slasconeProxy.CloseSession(sessionDto);

               System.out.println(closeSessionResult);
    	  }
       }
	}
	
	private static void HeartbeatSample(ProvisioningInfo activatedLicense) throws Exception {
		
		var slasconeProxy = new SampleProxy();
		
		 // ToDo: Fill the variables
        var heartBeatDto = new AddHeartbeatDto();
        heartBeatDto.setClient_id(null);
        heartBeatDto.setGroup_id(null);
        heartBeatDto.setHeartbeat_type_id(null);
        heartBeatDto.setOperating_system(null);
        heartBeatDto.setProduct_id(null);
        heartBeatDto.setSoftware_version(null);
        heartBeatDto.setToken_key(null);
        
        var heartbeatResult = slasconeProxy.AddHeartbeat(heartBeatDto);
        
        // If the heartbeat failed, the api server responses with a specific error message which describes the problem. Therefore the LicenseInfo object is declared with null.
        if (heartbeatResult.LicenseInfo == null)
        {
        	System.out.println(heartbeatResult.WarningInfo.message);
        }
        else
        {
        	System.out.println("Successfully created heartbeat.");
        }

        // ToDo: Fill the variables
        var analyticalHb = new AnalyticalHeartbeat();
        analyticalHb.setAnalytical_heartbeat(null);
        analyticalHb.setClient_id(null);;

        var analyticalHeartbeatResult = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);

        System.out.println(analyticalHeartbeatResult);
        
        // ToDo: Fill the variables
     	var usageFeatureValue1 = new UsageFeatureValueDto();
    	usageFeatureValue1.setUsage_feature_id(UUID.fromString(""));
    	usageFeatureValue1.setUsage_module_id(null);
     	usageFeatureValue1.setValue("");
     		
     	var usageFeatureValue2 = new UsageFeatureValueDto();
     	usageFeatureValue2.setUsage_feature_id(UUID.fromString(""));
    	usageFeatureValue2.setUsage_module_id(null);
    	usageFeatureValue2.setValue("");
     	
     	List<UsageFeatureValueDto> usageFeatureValueList = new ArrayList<UsageFeatureValueDto>();
     	usageFeatureValueList.add(usageFeatureValue1);
     	usageFeatureValueList.add(usageFeatureValue2);
     		
     	var usageHeartbeatDto = new UsageHeartbeatDto();
     	usageHeartbeatDto.setClient_id("");
     	usageHeartbeatDto.setUsage_heartbeat(usageFeatureValueList);
     	usageHeartbeatDto.setToken_key(null);

     	var usageHeartbeatResult = slasconeProxy.AddUsageHeartbeat(usageHeartbeatDto);
     	
     	System.out.println(usageHeartbeatResult);
        
        if (activatedLicense.LicenseInfo != null)
        {
            // ToDo: Fill the variables
        	var unassignDto = new UnassignDto();
        	unassignDto.setToken_key(null);
        	
            var unassignResult = slasconeProxy.Unassign(unassignDto);

            System.out.println(unassignResult);
        }
        
        // ToDo: Fill the variables
     	var consumptionHeartbeatValue1 = new ConsumptionHeartbeatValueDto();
     	consumptionHeartbeatValue1.setLimitation_id(UUID.fromString(""));
     	consumptionHeartbeatValue1.setTimestamp_utc(null);
     	consumptionHeartbeatValue1.setValue("");
     		
     	var consumptionHeartbeatValue2 = new ConsumptionHeartbeatValueDto();
     	consumptionHeartbeatValue2.setLimitation_id(UUID.fromString(""));
     	consumptionHeartbeatValue2.setTimestamp_utc(null);
     	consumptionHeartbeatValue2.setValue("");
     	
     	List<ConsumptionHeartbeatValueDto> consumptionHeartbeatValueDtoList = new ArrayList<ConsumptionHeartbeatValueDto>();
     	consumptionHeartbeatValueDtoList.add(consumptionHeartbeatValue1);
     	consumptionHeartbeatValueDtoList.add(consumptionHeartbeatValue2);
     		
     	var consumptionHeartbeat = new ConsumptionHeartbeatDto();
     	consumptionHeartbeat.setClient_id("");
     	consumptionHeartbeat.setConsumption_heartbeat(consumptionHeartbeatValueDtoList);
     	consumptionHeartbeat.setToken_key(null);

     	var consumptionHeartbeatResult = slasconeProxy.AddConsumptionHeartbeat(consumptionHeartbeat);

     	System.out.println(consumptionHeartbeatResult);
     	
     	// ToDo: Fill the variables
     	var validateConsumptionStatusDto = new ValidateConsumptionStatusDto();
     	validateConsumptionStatusDto.client_id = "";
     	validateConsumptionStatusDto.limitation_id = UUID.fromString("");
     	
     	var remainingConsumptions = slasconeProxy.GetConsumptionStatus(validateConsumptionStatusDto);
     	
     	System.out.println(remainingConsumptions);
	}
	
}
