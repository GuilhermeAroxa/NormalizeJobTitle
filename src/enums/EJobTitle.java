package enums;

public enum EJobTitle {

    ARCHITECT("Architect"),
    SOFTWAREENGINEER("Software Engineer"),
    QUANTITYSURVEYOR("Quantity Surveyor"),
    ACCOUNTANT("Accountant");

    private String jobTitle;

    EJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }    

    public static String valueOfLabel(String value) {
        for (EJobTitle e : values()) {
            if ((e.jobTitle.toUpperCase()).contains(value)) {
                return e.jobTitle;
            }
        }
        return null;
    }
}
