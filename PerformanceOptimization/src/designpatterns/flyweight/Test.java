package designpatterns.flyweight;

public class Test {
	public static void main(String[] arg){
		ReportManagerFactory rmf=new ReportManagerFactory();
		IReportManager rm=rmf.getEmployeeReportManager("A");
		System.out.println(rm.createReport());
		rm=rmf.getEmployeeReportManager("A");
		System.out.println(rm.createReport());
		rm=rmf.getEmployeeReportManager("Aa");
		System.out.println(rm.createReport());
	}
}
