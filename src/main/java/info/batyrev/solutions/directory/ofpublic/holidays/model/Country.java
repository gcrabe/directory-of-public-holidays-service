package info.batyrev.solutions.directory.ofpublic.holidays.model;

public enum Country {

    Brazil("br"),
    Kazakhstan("kz"),
    Russia("ru"),
    Japan("jp");

    private String abbreviation;

    Country(String domain) {
        this.abbreviation = domain;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return abbreviation;
    }
}
