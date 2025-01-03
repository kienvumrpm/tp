package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.CollectionUtil.isCollectionEqual;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import seedu.address.commons.util.ToStringBuilder;

/**
 * Builder for creating predicates of {@code Person}.
 */
public class PersonPredicateBuilder {

    private final List<String> nameKeywords;
    private final List<String> classIdKeywords;
    private final List<String> monthPaidKeywords;
    private final List<String> notMonthPaidKeywords;
    private final List<String> tagKeywords;
    private final List<String> addressKeywords;
    private final List<String> phoneKeywords;
    private final List<String> emailKeywords;
    private final List<String> feesKeywords;
    private boolean isSetName;
    private boolean isSetClassId;
    private boolean isSetMonthPaid;
    private boolean isSetNotMonthPaid;
    private boolean isSetEmail;
    private boolean isSetAddress;
    private boolean isSetPhone;
    private boolean isSetTag;
    private boolean isSetFees;

    /**
     * Creates an empty {@code PersonPredicateBuilder}.
     */
    public PersonPredicateBuilder() {
        nameKeywords = new ArrayList<>();
        classIdKeywords = new ArrayList<>();
        monthPaidKeywords = new ArrayList<>();
        notMonthPaidKeywords = new ArrayList<>();
        tagKeywords = new ArrayList<>();
        addressKeywords = new ArrayList<>();
        emailKeywords = new ArrayList<>();
        phoneKeywords = new ArrayList<>();
        feesKeywords = new ArrayList<>();
        isSetName = false;
        isSetClassId = false;
        isSetMonthPaid = false;
        isSetNotMonthPaid = false;
        isSetTag = false;
        isSetAddress = false;
        isSetPhone = false;
        isSetEmail = false;
        isSetFees = false;
    }

    /**
     * Creates a {@code PersonPredicateBuilder} with a copy of all internal data from the provided
     * {@code PersonPredicateBuilder}.
     */
    public PersonPredicateBuilder(PersonPredicateBuilder personPredicateBuilder) {
        nameKeywords = new ArrayList<>(personPredicateBuilder.nameKeywords);
        classIdKeywords = new ArrayList<>(personPredicateBuilder.classIdKeywords);
        monthPaidKeywords = new ArrayList<>(personPredicateBuilder.monthPaidKeywords);
        notMonthPaidKeywords = new ArrayList<>(personPredicateBuilder.notMonthPaidKeywords);
        tagKeywords = new ArrayList<>(personPredicateBuilder.tagKeywords);
        addressKeywords = new ArrayList<>(personPredicateBuilder.addressKeywords);
        emailKeywords = new ArrayList<>(personPredicateBuilder.emailKeywords);
        phoneKeywords = new ArrayList<>(personPredicateBuilder.phoneKeywords);
        feesKeywords = new ArrayList<>(personPredicateBuilder.feesKeywords);
        isSetName = personPredicateBuilder.isSetName;
        isSetClassId = personPredicateBuilder.isSetClassId;
        isSetMonthPaid = personPredicateBuilder.isSetMonthPaid;
        isSetNotMonthPaid = personPredicateBuilder.isSetNotMonthPaid;
        isSetTag = personPredicateBuilder.isSetTag;
        isSetEmail = personPredicateBuilder.isSetEmail;
        isSetPhone = personPredicateBuilder.isSetPhone;
        isSetAddress = personPredicateBuilder.isSetAddress;
        isSetFees = personPredicateBuilder.isSetFees;
    }

    /**
     * Adds all strings in {@code nameKeywords} into this object's {@code nameKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withNameKeywords(List<String> nameKeywords) {
        requireNonNull(nameKeywords);
        PersonPredicateBuilder newBuilder = new PersonPredicateBuilder(this);
        newBuilder.nameKeywords.addAll(nameKeywords);
        newBuilder.isSetName = true;
        return newBuilder;
    }

    /**
     * Adds all strings in {@code classIdKeywords} into this object's {@code classIdKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withClassIdKeywords(List<String> classIdKeywords) {
        requireNonNull(classIdKeywords);
        PersonPredicateBuilder newBuilder = new PersonPredicateBuilder(this);
        newBuilder.classIdKeywords.addAll(classIdKeywords);
        newBuilder.isSetClassId = true;
        return newBuilder;
    }

    /**
     * Adds all strings in {@code monthPaidKeywords} into this object's {@code monthPaidKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withMonthPaidKeywords(List<String> monthPaidKeywords) {
        requireNonNull(monthPaidKeywords);
        PersonPredicateBuilder newBuilder = new PersonPredicateBuilder(this);
        newBuilder.monthPaidKeywords.addAll(monthPaidKeywords);
        newBuilder.isSetMonthPaid = true;
        return newBuilder;
    }

    /**
     * Adds all strings in {@code notMonthPaidKeywords} into this object's {@code notMonthPaidKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withNotMonthPaidKeywords(List<String> notMonthPaidKeywords) {
        requireNonNull(notMonthPaidKeywords);
        PersonPredicateBuilder newBuilder = new PersonPredicateBuilder(this);
        newBuilder.notMonthPaidKeywords.addAll(notMonthPaidKeywords);
        newBuilder.isSetNotMonthPaid = true;
        return newBuilder;
    }

    /**
     * Adds all strings in {@code tagKeywords} into this object's {@code tagKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withTagsKeywords(List<String> tagKeywords) {
        requireNonNull(tagKeywords);
        this.tagKeywords.addAll(tagKeywords);
        isSetTag = true;
        return this;
    }
    /**
     * Adds all strings in {@code addressKeywords} into this object's {@code addressKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withAddressKeywords(List<String> addressKeywords) {
        requireNonNull(addressKeywords);
        this.addressKeywords.addAll(addressKeywords);
        isSetAddress = true;
        return this;
    }
    /**
     * Adds all strings in {@code phoneKeywords} into this object's {@code phoneKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withPhoneKeywords(List<String> phoneKeywords) {
        requireNonNull(phoneKeywords);
        this.phoneKeywords.addAll(phoneKeywords);
        isSetPhone = true;
        return this;
    }
    /**
     * Adds all strings in {@code emailKeywords} into this object's {@code emailKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withEmailKeywords(List<String> emailKeywords) {
        requireNonNull(emailKeywords);
        this.emailKeywords.addAll(emailKeywords);
        isSetEmail = true;
        return this;
    }
    /**
     * Adds all strings in {@code feesKeywords} into this object's {@code feesKeywords} field.
     * @return this object
     */
    public PersonPredicateBuilder withFeesKeywords(List<String> feesKeywords) {
        requireNonNull(feesKeywords);
        this.feesKeywords.addAll(feesKeywords);
        isSetFees = true;
        return this;
    }

    /**
     * Converts this object into a {@code Predicate<Person>} object that tests a {@code Person} for all fields set
     * in this object.
     */
    public Predicate<Person> build() {


        return person -> {
            boolean nameMatch = nameContainsKeywords(person, isSetName, nameKeywords);
            boolean classIdMatch = classIdContainsKeywords(person, isSetClassId, classIdKeywords);
            boolean monthPaidMatch = monthPaidContainsKeywords(person, isSetMonthPaid, monthPaidKeywords);
            boolean notMonthPaidMatch = notMonthPaidContainsKeywords(
                    person, isSetNotMonthPaid, notMonthPaidKeywords);
            boolean tagMatch = tagContainsKeywords(person, isSetTag, tagKeywords);
            boolean addressMatch = addressContainsKeywords(person, isSetAddress, addressKeywords);
            boolean phoneMatch = phoneContainsKeywords(person, isSetPhone, phoneKeywords);
            boolean emailMatch = emailContainsKeywords(person, isSetEmail, emailKeywords);
            boolean feesMatch = feesContainsKeywords(person, isSetFees, feesKeywords);
            return nameMatch && classIdMatch && monthPaidMatch && notMonthPaidMatch && tagMatch && addressMatch
                    && phoneMatch && emailMatch && feesMatch;
        };
    }

    private static boolean nameContainsKeywords(Person person, boolean isSetName, List<String> nameKeywords) {
        if (!isSetName) {
            return true;
        }
        return nameKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getName().fullName, keyword));
    }

    private static boolean classIdContainsKeywords(Person person, boolean isSetClassId, List<String> classIdKeywords) {
        if (!isSetClassId) {
            return true;
        }
        return classIdKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getClassId().value, keyword));
    }

    private static boolean monthPaidContainsKeywords(
            Person person, boolean isSetMonthPaid, List<String> monthPaidKeywords) {
        if (!isSetMonthPaid) {
            return true;
        }
        return monthPaidKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getMonthsPaid().toString(), keyword));
    }

    private static boolean notMonthPaidContainsKeywords(
            Person person, boolean isSetNotMonthPaid, List<String> notMonthPaidKeywords) {
        if (!isSetNotMonthPaid) {
            return true;
        }
        return notMonthPaidKeywords.stream()
                .noneMatch(keyword -> regexMatch(person.getMonthsPaid().toString(), keyword));
    }

    private static boolean tagContainsKeywords(Person person, boolean isSetTag, List<String> tagKeywords) {
        if (!isSetTag) {
            return true;
        }
        return tagKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getTags().toString(), keyword));
    }

    private static boolean addressContainsKeywords(Person person, boolean isSetAddress, List<String> addressKeywords) {
        if (!isSetAddress) {
            return true;
        }
        return addressKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getAddress().value, keyword));
    }

    private static boolean phoneContainsKeywords(Person person, boolean isSetPhone, List<String> phoneKeywords) {
        if (!isSetPhone) {
            return true;
        }
        return phoneKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getPhone().value, keyword));
    }

    private static boolean emailContainsKeywords(Person person, boolean isSetEmail, List<String> emailKeywords) {
        if (!isSetEmail) {
            return true;
        }
        return emailKeywords.stream()
                .anyMatch(keyword -> regexMatch(person.getEmail().value, keyword));
    }

    private static boolean feesContainsKeywords(Person person, boolean isSetFees, List<String> feesKeywords) {
        if (!isSetFees) {
            return true;
        }
        return feesKeywords.stream()
                .anyMatch(keyword -> person.getFees().value.equalsIgnoreCase(keyword));
    }

    private static boolean regexMatch(String value, String keyword) {
        Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(value).find();
    }

    /**
     * Returns true if no {@code with} functions of this object has been executed yet.
     */
    public boolean isEmpty() {
        return !isSetName && !isSetClassId && !isSetMonthPaid && !isSetNotMonthPaid && !isSetTag && !isSetAddress
                && !isSetPhone && !isSetEmail && !isSetFees;
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof PersonPredicateBuilder)) {
            return false;
        }

        PersonPredicateBuilder otherPersonPredicateBuilder = (PersonPredicateBuilder) other;
        return isCollectionEqual(nameKeywords, otherPersonPredicateBuilder.nameKeywords)
                && isCollectionEqual(classIdKeywords, otherPersonPredicateBuilder.classIdKeywords)
                && isCollectionEqual(monthPaidKeywords, otherPersonPredicateBuilder.monthPaidKeywords)
                && isCollectionEqual(notMonthPaidKeywords, otherPersonPredicateBuilder.notMonthPaidKeywords)
                && isCollectionEqual(tagKeywords, otherPersonPredicateBuilder.tagKeywords)
                && isCollectionEqual(addressKeywords, otherPersonPredicateBuilder.addressKeywords)
                && isCollectionEqual(phoneKeywords, otherPersonPredicateBuilder.phoneKeywords)
                && isCollectionEqual(emailKeywords, otherPersonPredicateBuilder.emailKeywords)
                && isCollectionEqual(feesKeywords, otherPersonPredicateBuilder.feesKeywords)
                && isSetName == otherPersonPredicateBuilder.isSetName
                && isSetClassId == otherPersonPredicateBuilder.isSetClassId
                && isSetMonthPaid == otherPersonPredicateBuilder.isSetMonthPaid
                && isSetNotMonthPaid == otherPersonPredicateBuilder.isSetNotMonthPaid
                && isSetEmail == otherPersonPredicateBuilder.isSetEmail
                && isSetAddress == otherPersonPredicateBuilder.isSetAddress
                && isSetPhone == otherPersonPredicateBuilder.isSetPhone
                && isSetFees == otherPersonPredicateBuilder.isSetFees
                && isSetTag == otherPersonPredicateBuilder.isSetTag;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("nameKeywords", nameKeywords)
                .add("classIdKeywords", classIdKeywords)
                .add("monthPaidKeywords", monthPaidKeywords)
                .add("notMonthPaidKeywords", notMonthPaidKeywords)
                .add("tagKeywords", tagKeywords)
                .add("addressKeywords", addressKeywords)
                .add("phoneKeywords", phoneKeywords)
                .add("emailKeywords", emailKeywords)
                .add("feesKeywords", feesKeywords)
                .add("isSetName", isSetName)
                .add("isSetClassId", isSetClassId)
                .add("isSetMonthPaid", isSetMonthPaid)
                .add("isSetNotMonthPaid", isSetNotMonthPaid)
                .add("isSetTag", isSetTag)
                .add("isSetAddress", isSetAddress)
                .add("isSetPhone", isSetPhone)
                .add("isSetEmail", isSetEmail)
                .add("isSetFees", isSetFees)
                .toString();
    }
}
