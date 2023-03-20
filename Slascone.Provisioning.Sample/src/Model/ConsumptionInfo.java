package Model;

public class ConsumptionInfo {

    public ConsumptionDto[] Consumptions = null;

    public WarningInfo WarningInfo = null;

    public ConsumptionInfo() {
        super();
    }

    public ConsumptionInfo(ConsumptionDto[] consumptions, Model.WarningInfo warningInfo) {
        super();
        Consumptions = consumptions;
        WarningInfo = warningInfo;
    }

    public void setConsumptions(ConsumptionDto[] consumptions) {
        Consumptions = consumptions;
    }

    public void setWarningInfo(WarningInfo warningInfo) {
        WarningInfo = warningInfo;
    }
}
