public interface WasteCollector {
  public void setNextCollector(WasteCollector nextCollector);
  public void collectWaste(WasteContainer container);
} 
