package examples.wav;

public class FormatSegment extends Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
