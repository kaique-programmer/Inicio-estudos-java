package application;

import model.entities.ObjectArray;

import java.util.Objects;

public class Program01 {
    public static void main(String[] args) {

        ObjectArray objectArray = new ObjectArray(3);

        Contact c1 = new Contact("Contact 1", "6268-5892", "contact1@gmail.com");
        Contact c2 = new Contact("Contact 2", "7268-5892", "contact2@gmail.com");
        Contact c3 = new Contact("Contact 3", "8268-5892", "contact3@gmail.com");

        objectArray.add(c1);
        objectArray.add(c2);
        objectArray.add(c3);

        System.out.println("Length = " + objectArray.length());

        int position = objectArray.search(c1);
        if (position > -1) {
            System.out.println("Element exist in the array");
        } else {
            System.out.println("Element not exist in the array");
        }

        System.out.println(objectArray);
    }
}

class Contact {
    private String name, phone, email;

    public Contact() {
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName()) && Objects.equals(getPhone(), contact.getPhone()) && Objects.equals(getEmail(), contact.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), getEmail());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
