package Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Model.ActivateInfo;
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.UnassignDto;
import Model.UsageFeatureValueDto;
import Model.UsageHeartbeatDto;
import Proxy.SampleProxy;

public class Program {
	
	public static void main(String [] args) throws Exception
	{
		var slasconeProxy = new SampleProxy();
		
        // ToDo
        var activatedLicense = slasconeProxy.Activate(new ActivateInfo("", "",
            "", "", ""));

        if (activatedLicense.LicenseInfo == null)
        {
        	System.out.println(activatedLicense.WarningInfo.message);
        }
        else
        {
        	System.out.println("Successfully activated license.");
        }

        // ToDo
        var heartBeatDto = new AddHeartbeatDto();
        heartBeatDto.setClient_id(null);
        heartBeatDto.setGroup_id(null);
        heartBeatDto.setHeartbeat_type_id(null);
        heartBeatDto.setOperating_system(null);
        heartBeatDto.setProduct_id(null);
        heartBeatDto.setSoftware_version(null);
        heartBeatDto.setToken_key(null);
        
        var heartbeatResult = slasconeProxy.AddHeartbeat(heartBeatDto);

        if (heartbeatResult.LicenseInfo == null)
        {
        	System.out.println(heartbeatResult.WarningInfo.message);
        }
        else
        {
        	System.out.println("Successfully created heartbeat.");
        }

        // ToDo
        var analyticalHb = new AnalyticalHeartbeat();
        analyticalHb.setAnalytical_heartbeat(null);
        analyticalHb.setClient_id(null);;

        var analyticalHeartbeatResult = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);

        System.out.println(analyticalHeartbeatResult);
        
        // ToDo
     	var usageFeatureValue1 = new UsageFeatureValueDto();
    	usageFeatureValue1.setUsage_feature_id(UUID.fromString(""));
    	usageFeatureValue1.setUsage_module_id(null);
     	usageFeatureValue1.setValue("");
     		
     	var usageFeatureValue2 = new UsageFeatureValueDto();
     	usageFeatureValue2.setUsage_feature_id(UUID.fromString(""));
    	usageFeatureValue2.setUsage_module_id(null);
    	usageFeatureValue2.setValue("");
     	
     	List<UsageFeatureValueDto> usageFeatureValueList = new ArrayList();
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
            // ToDo
        	var unassignDto = new UnassignDto();
        	unassignDto.setToken_key(null);
        	
            var unassignResult = slasconeProxy.Unassign(unassignDto);

            System.out.println(unassignResult);
        }
	}
	
}
