package pl.sda;

public class ReversedCharSequence implements CharSequence {
    private String reversed;

    public ReversedCharSequence(String toReverse) {
        StringBuilder stringBuilder = new StringBuilder(toReverse);
        this.reversed = stringBuilder.reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int index) {
        return reversed.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversed.subSequence(start, end);
    }

    @Override
    public String toString() {
        return reversed;
    }
}
