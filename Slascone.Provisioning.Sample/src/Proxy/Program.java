package Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Model.ActivateInfo;
import Model.AnalyticalHeartbeat;
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
        	System.out.println(activatedLicense.WarningInfo.ErrorMessage);
        }
        else
        {
        	System.out.println("Successfully activated license.");
        }

        // ToDo
        var heartbeatResult = slasconeProxy.AddHeartbeat("", "",
            "", "", "");

        if (heartbeatResult.LicenseInfo == null)
        {
        	System.out.println(heartbeatResult.WarningInfo.ErrorMessage);
        }
        else
        {
        	System.out.println("Successfully created heartbeat.");
        }

        // ToDo
        var analyticalHb = new AnalyticalHeartbeat();
        analyticalHb.setAnalyticalHeartbeatInfo(null);
        analyticalHb.setUniqueDeviceId(null);;

        var analyticalHeartbeatResult = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);

        System.out.println(analyticalHeartbeatResult);
        
        // ToDo
     	var usageFeatureValue1 = new UsageFeatureValueDto();
    	usageFeatureValue1.setUsageFeatureId(UUID.fromString(""));
     	usageFeatureValue1.setValue("");
     		
     	var usageFeatureValue2 = new UsageFeatureValueDto();
     	usageFeatureValue2.setUsageFeatureId(UUID.fromString(""));
     	usageFeatureValue2.setValue("");
     	
     	List<UsageFeatureValueDto> usageFeatureValueList = new ArrayList();
     	usageFeatureValueList.add(usageFeatureValue1);
     	usageFeatureValueList.add(usageFeatureValue2);
     		
     	var usageHeartbeatDto = new UsageHeartbeatDto();
     	usageHeartbeatDto.setUniqueDeviceId("");
     	usageHeartbeatDto.setUsageHeartbeat(usageFeatureValueList);

     	var usageHeartbeatResult = slasconeProxy.AddUsageHeartbeat(usageHeartbeatDto);
     	
     	System.out.println(usageHeartbeatResult);
        
        if (activatedLicense.LicenseInfo != null)
        {
            // ToDo
            var unassignResult = slasconeProxy.Unassign("");

            System.out.println(unassignResult);
        }
	}
	
}
