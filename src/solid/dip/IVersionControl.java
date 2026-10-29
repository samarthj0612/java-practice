package solid.dip;

// Interface for version control system
public interface IVersionControl {
    void commit(String message);
    void push();
    void pull();
}
