// Authors: Avery Wright and Kate Callan

public enum Setting {
    OFF("[---]"), LOW("[--+]"), MEDIUM("[-++]"), HIGH("[+++]");

    private final String representation;

    // Constructor that accepts a String
    Setting(String representation) {
        this.representation = representation;
    }

    // Getter for the string representation
    public String getRepresentation() {
        return representation;
    }

    // Override toString to return the string representation
    @Override
    public String toString() {
        return representation;
    }
}
