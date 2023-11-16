package exercise;

// BEGIN
public class ReversedSequence implements CharSequence{
    private String line;
    public ReversedSequence (String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public int length() {
        return getLine().length();
    }

    @Override
    public char charAt(int index) {
        return line.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder input = new StringBuilder();
        input.append(getLine());
        input.reverse();
        return input.subSequence(start, end);
    }

    @Override
    public String toString() {
        StringBuilder input = new StringBuilder();
        input.append(getLine());
        return String.valueOf(input.reverse());
    }
}

// END
