public class WasteManagementSystem {
  public static void main(String[] args) {
    // Creating waste collectors
    WasteCollector organicCollector = new OrganicWasteContainer();
    WasteCollector recyclableCollector = new RecyclableWasteContainer();
    WasteCollector hazardousCollector = new HazardousWasteContainer();

    // Setting up the chain
    organicCollector.setNextCollector(recyclableCollector);
    recyclableCollector.setNextCollector(hazardousCollector);

    // Creating waste containers
    WasteContainer organicWaste = new WasteContainer("organic", 20);
    WasteContainer recyclableWaste = new WasteContainer("recyclable", 15);
    WasteContainer hazardousWaste = new WasteContainer("hazardous", 10);
    WasteContainer unknownWaste = new WasteContainer("electronic", 5);

    // Triggering waste collection
    organicCollector.collectWaste(organicWaste);
    organicCollector.collectWaste(recyclableWaste);
    organicCollector.collectWaste(hazardousWaste);
    organicCollector.collectWaste(unknownWaste);
}
}
