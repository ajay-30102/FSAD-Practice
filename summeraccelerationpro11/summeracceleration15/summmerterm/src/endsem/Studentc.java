package endsem;

public class Studentc implements Comparable<Student> {
	int id;
    String name;

    Studentc(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // compareTo for natural order (by id)
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    // equals and hashCode so HashSet can detect duplicates
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString for printing
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

}
