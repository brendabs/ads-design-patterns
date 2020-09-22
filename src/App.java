import Reports.ReportPDF;
import Reports.ReportPNG;
import Reports.ReportXLSX;

public class App {
  public static void main(String[] args) throws Exception {
    Analysis a = new Analysis();

    a.setReportMethod(new ReportPDF());
    a.createAnalysis();
  }
}
