/* A Program that demonstrates Encapsulation */

public class EncapsulateEx {

    private String name;

    // Getter method
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        EncapsulateEx emp = new EncapsulateEx();

        emp.setName("Nath");

        System.out.println("Employee Name: " + emp.getName());
    }
}