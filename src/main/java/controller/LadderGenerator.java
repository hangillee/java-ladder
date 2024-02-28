package controller;

import domain.Height;
import domain.Lines;
import domain.Names;
import domain.PointGenerator;
import domain.RandomPointGenerator;
import domain.Results;
import java.util.List;
import view.InputView;
import view.ResultView;

public class LadderDrawer {
    private Ladder ladder;

    public void generateLadder() {
        Names names = inputNames();
        Results results = inputResults(names.size());
        Height height = inputLadderHeight();

        PointGenerator generator = new RandomPointGenerator();
        Lines lines = new Lines(height.getValue(), names.size(), generator);

        ladder = new Ladder()
                .lines(lines)
                .names(names)
                .results(results)
                .build();

        ResultView.printLadderDrawResult(ladder);
    }

    private Height inputLadderHeight() {
        int rawHeight = InputView.getHeight();
        return new Height(rawHeight);
    }

    private Results inputResults(final int nameSize) {
        List<String> rawResults = InputView.getResults();
        return new Results(rawResults, nameSize);
    }

    private Names inputNames() {
        List<String> rawNames = InputView.getNames();
        return new Names(rawNames);
    }

    public Ladder getLadder() {
        return ladder;
    }
}
