package Chapter5;

public abstract class AbstractRules {

    private void privateDoSomething() {}
    final void finalDoSomething() {}
    abstract void abstractDoSomething();

//    private abstract void privateAbstractDoSomething() {
        // Illegal combination of modifiers: 'abstract' and 'private'
//    }

//    final abstract void privateAbstractDoSomething() {
        // Illegal combination of modifiers: 'abstract' and 'final'
//    }


    abstract class AbstractInnerClass {
        public abstract void doSomething();
    }

    private abstract class PrivateAbstractInnerClass {
        // Compiles! We can still make a implementation of this class inside AbstractRules
        abstract void doSomething();
    }

    private class PrivateAbstractInnerClassChild extends PrivateAbstractInnerClass {

        @Override
        void doSomething() {

        }
    }

//    final abstract class FinalAbstractInnerClass {
        // Illegal combination of modifiers: 'final' and 'abstract'
//    }
}
