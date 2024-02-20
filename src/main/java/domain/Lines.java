package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lines {
    private final List<Line> lines = new ArrayList<>();

    public Lines(final int height, final int personCount) {
        IntStream.range(0, height)
                .mapToObj(index -> new Line(personCount))
                .forEach(lines::add);
    }

    public List<Line> getLines() {
        return lines;
    }
}