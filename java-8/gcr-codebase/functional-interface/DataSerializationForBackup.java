import java.io.Serializable;

class BackupData implements Serializable {
    String name = "Backup File";
}

public final class DataSerializationForBackup {
	public static void main(String[] args) {
		BackupData backup=new BackupData();
		String name = backup.name;
		System.out.println(name);
	}
}
