package hooks;

import SpAcademyCucumber.Usuario;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableConfig {

    @DataTableType
    public Usuario singleUser(Map<String, String> entry) throws Throwable{
        return new Usuario(
                Integer.parseInt(entry.get("id")),
                entry.get("nombre"),
                Double.parseDouble(entry.get("balance")));
    }
}
