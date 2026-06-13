package JCF.Lec_25_pt3;

public class Students_comp implements Comparable<Students_comp> {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Students_comp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    // ctor
    public Students_comp(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int compareTo(Students_comp that) {
        // called for current obj (this)
        // def sorting logic

        // sort if same age
        if (this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}
