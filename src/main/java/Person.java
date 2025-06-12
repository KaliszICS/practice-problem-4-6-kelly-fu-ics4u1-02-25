import java.util.Arrays;
/**
 * The {@code Person} class represents a person with basic personal information, such as name, birthday, social security number, and siblings.
 * This class provides methods to retrieve and modify personal information, as well as to manage sibling relationships.
 * @author Kelly Fu
 * @version 17.0.1
 */

public class Person {

    
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    /**
     * Main constructor for Person class.
     * 
     * @param firstname   The person's first name.
     * @param lastname    The person's last name.
     * @param birthDay    Birth day (1-31).
     * @param birthMonth  Birth month (1-12).
     * @param birthYear   Birth year.
     * @param ssn         Social Security Number.
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    /**
     * Returns the first name.
     * @return the firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the first name.
     * @param firstname the name to set.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns the last name.
     * @return the lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name.
     * @param lastname the name to set.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the full birthday in the format "day/month/year".
     * @return birthday as a string.
     */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    /**
     * Adds a sibling to this person.
     * @param newSibling the sibling to add.
     */
    public void addSibling(Person newSibling) {
        // Expand the array by 1 and copy over
        siblings = Arrays.copyOf(siblings, siblings.length + 1);
        siblings[siblings.length - 1] = newSibling;
        numberOfSiblings++;
    }

    /**
     * Returns an array of siblings.
     * @return array of Person siblings.
     */
    public Person[] getSiblings() {
        return siblings;
    }
}
