import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    private String firstName, lastName;
    private int age;

    public Person(String fN, String lN, int age){
        this.age =age;
        this.firstName = fN;
        this.lastName = lN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Person person)) return false;

        return new EqualsBuilder().
                append(firstName, person.firstName).
                append(lastName, person.lastName).
                append(age, person.age).
                isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(lastName)
                .append(firstName)
                .append(age)
                .toString();
    }

    public String getFirstName(){
        return firstName;
    }
}