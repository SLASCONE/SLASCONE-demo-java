package Proxy;
import Model.ActivateInfo;
import Model.AnalyticalHeartbeat;
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
        analyticalHb.setDeviceLicenseKey(null);;
        analyticalHb.setUniqueDeviceId(null);;

        var analyticalHeartbeatResult = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);

        System.out.println(analyticalHeartbeatResult);
        
        if (activatedLicense.LicenseInfo != null)
        {
            // ToDo
            var unassignResult = slasconeProxy.Unassign("");

            System.out.println(unassignResult);
        }
	}
	
}
