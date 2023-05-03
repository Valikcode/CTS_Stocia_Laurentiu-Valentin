package Composite.Module;

public interface UnitateBancara {
    public void adaugaUnitate(UnitateBancara unitateBancara);
    public void stergeUnitate(UnitateBancara unitateBancara);
    public UnitateBancara getUnitate(int index);
    public void printUnitate(String indentare);
}
