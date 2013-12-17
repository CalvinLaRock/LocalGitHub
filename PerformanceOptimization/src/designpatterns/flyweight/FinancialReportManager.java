package designpatterns.flyweight;

public class FinancialReportManager implements IReportManager {

	protected String tenantId = null;

	public FinancialReportManager(String tenantId) {
		this.tenantId = tenantId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.flyweight.IReportManager#createReport()
	 */
	@Override
	public String createReport() {
		return "This is a financial report,the tenantId is "+this.tenantId;
	}

}
