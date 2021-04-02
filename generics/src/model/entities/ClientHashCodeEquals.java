package model.entities;

import java.util.Objects;

public class ClientHashCodeEquals {
    private String name, email;

    public ClientHashCodeEquals(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof ClientHashCodeEquals)) return false;
        ClientHashCodeEquals that = (ClientHashCodeEquals) o;
        return getName().equals(that.getName()) && getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail());
    }
}
