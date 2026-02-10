package src;

public abstract class User {
    private String name;
    private String password;
    private String email;
    private int phone;
    private int age;
    private String address;

    public User(String name, String password, String email, int phone, int age, String address) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.address = address;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setAge(int age) {
        if(age >= 15){
            this.age = age;
        }
        throw new IllegalArgumentException("Below 15 cannot shop on their own");
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
