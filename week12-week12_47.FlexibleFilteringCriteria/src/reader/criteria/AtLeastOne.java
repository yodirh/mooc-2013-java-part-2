package reader.criteria;

public class AtLeastOne implements Criterion {

    Criterion c1[];

    public AtLeastOne(Criterion... c1) {
        this.c1 = c1;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c11 : c1) {
            if (c11.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
