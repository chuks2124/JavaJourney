package Chapter5;

public class AutoPolicy {
    private int AccountNumber;
    private String MakeandModel;
    private String state;

    public AutoPolicy(int AccountNumber, String MakeandModel, String state){
        this.AccountNumber = AccountNumber;
        this.MakeandModel = MakeandModel;
        this.state = state;
    }
    public void setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setMakeandModel(String makeandModel) {
        MakeandModel = makeandModel;
    }

    public String getMakeandModel() {
        return MakeandModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public boolean isNoFaultState(){
        boolean NoFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PN":
                NoFaultState = true;
                break;
            default:
                NoFaultState = false;

        }
        return NoFaultState;
    }
}
