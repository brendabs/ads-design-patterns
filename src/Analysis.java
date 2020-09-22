import Reports.Report;

public class Analysis {
  private Report report;

  private void getInputData () {
    System.out.println("Coletando dados dos inputs...");
  }

  private void processData () {
    System.out.println("Processando os dados...");
  }

  private void saveAnalysis () {
    System.out.println("Salvando a análise...");
  }

  public void createAnalysis () {
    this.getInputData();
    this.processData();
    this.saveAnalysis();
    this.report.generateReport();
  }

  public void setReportMethod (Report reportType) {
    this.report = reportType;
  }
}
