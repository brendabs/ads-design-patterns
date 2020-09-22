public class Analysis {
  // private Relatorio report;

  private void getInputData () {
    System.out.println("Coletando dados dos inputs...");
  }

  private void processData () {
    System.out.println("Processando os dados...");
  }

  private void saveData () {
    System.out.println("Salvando os dados...");
  }

  public void createAnalysis () {
    this.getInputData();
    this.processData();
    this.saveData();
    // this.report.export();
  }

  // public void setReportMethod (Relatorio reportType) {
  //   this.report = reportType;
  // }
}
