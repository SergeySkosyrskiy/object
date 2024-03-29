public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор книги = " + this.name + " " + lastName;
    }//Метод toString

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.name)&& lastName.equals(author.lastName);
    }

   public int hashCode(){
       return name.hashCode()+ lastName.hashCode();
    }

}
