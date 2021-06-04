package sample;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="summary")
//Optional: set the order of the elements
@XmlType(propOrder={"CPR", "zipCode","result","date_test","strainOfCovid", "mutationName"})

public class Summary {

    public Summary() {
        this.CPR = null;
        this.zipCode = null;
        this.result = null;
        this.date_test = null;
        this.strainOfCovid = null;
        this.mutationName=null;
    }

    private String CPR;
    private String zipCode;
    private String result;
    private String date_test;
    private String strainOfCovid;
    private String mutationName;

    public Summary(String CPR, String zipCode, String result, String date_test, String strainOfCovid, String mutationName) {
        this.CPR=CPR;
        this.zipCode=zipCode;
        this.result=result;
        this.date_test=date_test;
        this.strainOfCovid=strainOfCovid;
        this.mutationName=mutationName;
    }

    public String getCPR() {
        return CPR;
    }

    @XmlAttribute(name = "CPR")
    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public String getZipCode() {
        return zipCode;
    }

    @XmlElement(name = "zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getResult() {
        return result;
    }

    @XmlElement(name = "result")
    public void setResult(String result) {
        this.result = result;
    }

    public String getDate_test() {
        return date_test;
    }

    @XmlElement(name = "date_test")
    public void setDate_test(String date_test) {
        this.date_test = date_test;
    }

    public String getStrainOfCovid() {
        return strainOfCovid;
    }

    @XmlElement(name = "strainOfCovid")
    public void setStrainOfCovid(String strainOfCovid) {
        this.strainOfCovid = strainOfCovid;
    }

    public String getMutationName() {
        return mutationName;
    }

    @XmlElement(name = "mutationName")
    public void setMutationName(String mutationName) {
        this.mutationName = mutationName;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "CPR='" + CPR + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", result='" + result + '\'' +
                ", date_test=" + date_test +
                ", strainOfCovid='" + strainOfCovid + '\'' +
                ", mutationName='" + mutationName + '\'' +
                '}';
    }
}

