
interface Exporter {

    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

public class DataExporterInterface {
	public static void main(String[] args) {
	}
}
