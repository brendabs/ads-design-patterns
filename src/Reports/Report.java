package Reports;

public abstract class Report {
  private void processReport () {
    System.out.println("Processando relatório...");
  }

  public void generateReport () {
    this.processReport();
    this.export();
  }

  public abstract void export();
}
