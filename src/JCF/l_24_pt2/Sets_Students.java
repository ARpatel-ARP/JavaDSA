package JCF.l_24_pt2;

import java.util.Objects;

public class Sets_Students {
    public int rollNo;
    public String name;





    public Sets_Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Sets_Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sets_Students that = (Sets_Students) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }


}
