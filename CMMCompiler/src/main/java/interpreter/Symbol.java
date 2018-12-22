package interpreter;

/**
 * Created by Alex on 2018.12.3
 */
public class Symbol extends BaseSymbol{

    String name;
    SymbolTab symbolTab;

    public Symbol(String name, Type type) {
        this.name=name;
        this.type = type;
    }
    public Symbol(String name, Type type, Object value){
        this(name, type);
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

}
