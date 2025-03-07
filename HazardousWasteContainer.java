public class HazardousWasteContainer implements WasteCollector{
  @Override
  public void setNextCollector(WasteCollector nextCollector) {
      System.out.println("All waste types have been collected");
  }

  @Override
  public void collectWaste(WasteContainer container) {
      if (container.getType().equalsIgnoreCase("hazardous")) {
          System.out.println("Hazardous waste collected: " + container.getCapacity() + " liters. Warning! Special precautions applied.");
      } else {
          System.out.println("No handler available for waste type: " + container.getType());
      }
  }
}
