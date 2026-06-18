public class EmployeeShift {
    private String empId;
    private String empName;
    private String domain;
    private String inTime;
    private String outTime;
    private double workingHours;
    private double overtimeHours;
    private double overtimePay;
    public EmployeeShift() {
    }
    public EmployeeShift(String empId, String empName, String domain,
                         String inTime, String outTime,
                         double workingHours,
                         double overtimeHours,
                         double overtimePay) {
        this.empId = empId;
        this.empName = empName;
        this.domain = domain;
        this.inTime = inTime;
        this.outTime = outTime;
        this.workingHours = workingHours;
        this.overtimeHours = overtimeHours;
        this.overtimePay = overtimePay;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getInTime() {
        return inTime;
    }
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }
    public String getOutTime() {
        return outTime;
    }
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    public double getOvertimePay() {
        return overtimePay;
    }
    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
}