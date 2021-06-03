package sample;

public class MutationsList {
    private String mutationName;
    private String MutationDate;

    public MutationsList(String mutationName, String mutationDate) {
        this.mutationName = mutationName;
        MutationDate = mutationDate;
    }

    public String getMutationName() {
        return mutationName;
    }

    public void setMutationName(String mutationName) {
        this.mutationName = mutationName;
    }

    public String getMutationDate() {
        return MutationDate;
    }

    public void setMutationDate(String mutationDate) {
        MutationDate = mutationDate;
    }

    @Override
    public String toString() {
        return "MutationsList{" +
                "mutationName='" + mutationName + '\'' +
                ", MutationDate='" + MutationDate + '\'' +
                '}';
    }
}
