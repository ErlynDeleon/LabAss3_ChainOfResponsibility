public class OrganicWasteContainer implements WasteCollector{
  private WasteCollector nextCollector;

  @Override
  public void setNextCollector(WasteCollector nextCollector) {
      this.nextCollector = nextCollector;
  }

  @Override
  public void collectWaste(WasteContainer container) {
      if (container.getType().equalsIgnoreCase("organic")) {
          System.out.println("Organic waste collected: " + container.getCapacity() + " liters.");
      } else {
          if (nextCollector != null) {
              nextCollector.collectWaste(container);
          } else {
              System.out.println("No handler available for this waste type.");
          }
      }
  }
  
}