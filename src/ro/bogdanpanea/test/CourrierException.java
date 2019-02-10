package ro.bogdanpanea.test;

public class CourrierException extends Exception {

    private String errCode;

    CourrierException(String message, String err) {

        super(message);
        this.errCode = err;
    }

    public String getErrCode() {
        return errCode;
    }

}
