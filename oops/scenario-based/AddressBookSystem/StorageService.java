


import java.util.List;

public interface StorageService {
    void save(List<Contact>contacts) throws Exception;
    List<Contact>load() throws Exception;
}
