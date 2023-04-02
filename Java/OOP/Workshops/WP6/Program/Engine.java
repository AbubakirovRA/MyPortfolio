package Workshops.WP6.Program;

import Workshops.WP6.SaveLoad.SaveLoad;

public class Engine<M extends Model, V extends Viewer> {
    M model;
    V viewer;
    SaveLoad<M> save;

    public Engine(M m, V v) {
        model = m;
        viewer = v;
        save = new SaveLoad<>();
    }
/**
 * начало игры
 */
    public void startGame() {
        while (model.gameStatus()) {
            String input = viewer.inputLine("Enter the number in range 1-10 (press 'S' for save game or 'L' to load)\n");
            try {
                viewer.outputLine(model.answerLine(Integer.parseInt(input)));
            } catch (Exception e) {
                if (input.equals("S")) {
                    save("saved", model); // запись в файл saved
                    viewer.outputLine("Saved. Ok!\n");
                } else if (input.equals("L")) {
                    loadModel("saved"); //чтение состояния
                    viewer.outputLine("Loaded. Ok!\n");
                }
            }
        }
    }

    private void save(String path, M obj) {
        try {
            save.save(path, obj);
        } catch (Exception e) {
            viewer.outputLine(String.format("Save Error: %s\n", e.toString()));
        }

    }

    private void loadModel(String path) {
        try {
            save.load(path);
        } catch (Exception e) {
            viewer.outputLine(String.format("Load Error: %s\n", e.toString()));
        }
    }
}
