package designpatterns.flyweight;

public class EmployeeReportManager implements IReportManager {

	protected String tenantId = null;
	
	public EmployeeReportManager(String tenantId){
		this.tenantId = tenantId;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.flyweight.IReportManager#createReport()
	 */
	@Override
	public String createReport() {
		return "This is a employee report,the tenantId is "+this.tenantId;
	}

}
