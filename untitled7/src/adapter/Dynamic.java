package adapter;

public class Dynamic implements ListenMusic{
    @Override
    public void withEarPods(boolean isCheck) {

    }

    @Override
    public void withDynamic(boolean isCheck) {
        if (!isCheck) {
            return;
        }
        System.out.println ("Music is playing with dynamic...");
    }
}
