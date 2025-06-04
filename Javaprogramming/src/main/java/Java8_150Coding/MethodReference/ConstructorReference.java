package Java8_150Coding.MethodReference;

import java.util.function.Supplier;

public class ConstructorReference {

}
class Hey{
    public static void main(String[] args) {
        // using lambda
        Supplier<ConstructorReference> referenceSupplier=()->new ConstructorReference();
        referenceSupplier.get();
        // using method reference
        Supplier<ConstructorReference> referenceSupplier1=ConstructorReference::new;
    }
}