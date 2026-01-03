package endsem;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Objects;
import java.util.Comparator;


public class Test {
	public static void main(String[] args) {
        Student s1 = new Student(101, "Ajay");
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(101, "Ajay");

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("HashSet contents:");
        for (Student s : set) {
            System.out.println(s);
        }

        TreeSet<Student> treeSetById = new TreeSet<>();
        treeSetById.add(s1);
        treeSetById.add(s2);

        System.out.println("\nTreeSet by id:");
        for (Student s : treeSetById) {
            System.out.println(s);
        }

        TreeSet<Student> treeSetByName = new TreeSet<>(new NameComparator());
        treeSetByName.add(s1);
        treeSetByName.add(s2);

        System.out.println("\nTreeSet by name:");
        for (Student s : treeSetByName) {
            System.out.println(s);
        }
    }

}
