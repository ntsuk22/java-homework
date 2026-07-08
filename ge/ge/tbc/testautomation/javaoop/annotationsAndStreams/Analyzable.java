package ge.tbc.testautomation.javaoop.annotationsAndStreams;

public class Analyzable {

    @VariableNameAnnotation(name = "Age")
    public int age;

    @VariableNameAnnotation(name = "Username")
    public String username;

    @VariableNameAnnotation(name = "Score")
    public double score;

    @VariableNameAnnotation(name = "IsActive")
    public boolean isActive;

    @VariableNameAnnotation(name = "Grade")
    public char grade;

    @VariableNameAnnotation(name = "Price")
    public float price;

    @VariableNameAnnotation(name = "Population")
    public long population;

    @VariableNameAnnotation(name = "Temperature")
    public short temperature;

    @VariableNameAnnotation(name = "Status")
    public String status;

    @VariableNameAnnotation
    public int distance;

    @VariableNameAnnotation(name = "RandomText")
    public String description;
}
