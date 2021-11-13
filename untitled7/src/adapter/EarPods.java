package adapter;

public class EarPods implements ListenMusic{
    @Override
    public void withEarPods(boolean isCheck) {
        if (!isCheck) {
            return;
        }
        System.out.println ("Music is playing with ear pods...");
    }

    @Override
    public void withDynamic(boolean isCheck) {

    }
}
