package assignment.model.types;

public class Admin extends Human implements Type {
  private int id;
  private String name;
  private String email;
  private String password;
  private String phone;
  private int isDeleted;

  public Admin(int id, String name, String email, String password, String phone, int isDeleted) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.isDeleted = isDeleted;
  }

  public String toString() {
    return String.format("%d,%s,%s,%s,%s,%d", id, name, email, password, phone, isDeleted);
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = md5sum(password);
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setIsDeleted(int isDeleted) {
    this.isDeleted = isDeleted;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getPhone() {
    return phone;
  }

  public int getIsDeleted() {
    return isDeleted;
  }
}
