package OOP.Workshops.WP4.ToDoPlanner.Presenter;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.CsvLoad;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.CsvSave;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.JsonLoad;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.JsonSave;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.XmlLoad;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.XmlSave;
import OOP.Workshops.WP4.ToDoPlanner.Model.ActiveUser;
import OOP.Workshops.WP4.ToDoPlanner.Model.Person;
import OOP.Workshops.WP4.ToDoPlanner.Model.Task;
import OOP.Workshops.WP4.ToDoPlanner.Model.TaskPriority;
import OOP.Workshops.WP4.ToDoPlanner.Model.TaskRepo;
import OOP.Workshops.WP4.ToDoPlanner.View.View;

public class Presenter<M extends TaskRepo<Task>, V extends View> {
    private final String knownDataFiles = "csv json xml";
    private M model;
    private V view;

    public Presenter(M m, V v) {
        model = m;
        view = v;
    }

    public void start() {
        login();
        preLoadModel();
        boolean wokring = true;
        do {
            redrawTasksList();
            String Command = view.getInput(
                    "\nLoad - Загрузить список задач\nSave - сохранить список задач\nAdd - добавить задачу\nUpdate - обновить задачу\nRemove - удалить задачу\nExit - выйти\nВыберите действие:");
            switch (Command) {
                case "Load":
                    loadModel();
                    break;
                case "Save":
                    saveModel();
                    break;
                case "Add":
                    addTask();
                    break;
                case "Update":
                    updTask();
                    break;
                case "Remove":
                    removeTask();
                    break;
                case "Exit":
                    wokring = false;
                    break;
                default:
                    break;
            }
        } while (wokring);
    }

    private void login() {
        boolean checkinput = false;
        String message = "Как Вас зовут? (введите ФИО через пробел):";
        do {
            String input = view.getInput(message);
            String[] splitedInput = input.trim().split(" ");
            if (splitedInput.length == 3) {
                ActiveUser.setActiveUser(new Person(splitedInput[1], splitedInput[2], splitedInput[0]));
                checkinput = true;
            } else {

                message = "Что-то не то Вы ввели, давайте-ка еще разок:";
            }
        } while (!checkinput);
    }

    private void preLoadModel() {
        boolean checkinput = false;
        String message = "Импортировать список задач из файла? (1 - да, 2 - нет):";
        do {
            String command = view.getInput(message);
            if (command.equals("1")) {
                loadModel();
                checkinput = true;
            } else if (command.equals("2")) {
                checkinput = true;
            } else {
                message = "Введите:\n'1' чтобы перейти к импортированию списка зачад или \n'2' для работы с новым (пустым) списком задач:";
            }
        } while (!checkinput);
    }

    private void loadModel() {
        String path = askLoadFilePath();
        switch (path.substring(path.indexOf('.') + 1)) {
            case "csv":
                if (!this.model.load(new CsvLoad(), path)) {
                    view.printOutput("Файл не загружен\n");
                }
                break;

            case "json":
                if (!this.model.load(new JsonLoad(), path)) { // NYI
                    view.printOutput("Файл не загружен\n");
                }
                break;

            case "xml":
                if (!this.model.load(new XmlLoad(), path)) { // NYI
                    view.printOutput("Файл не загружен\n");
                }
                break;
        }
    }

    private String askLoadFilePath() {
        boolean checkinput = false;
        String message = "Введите имя файла (Например: data.csv, TestData.csv):";
        do {
            String input = view.getInput(message);
            if (knownDataFiles.contains(input.substring(input.indexOf('.') + 1))) {
                if (new File(input).exists()) {
                    return input;
                } else {
                    message = "Такого файла не существует. Попробуйте ещё раз или выйдите написав 'Exit':";
                }
            } else if (input.equals("Exit")) {
                checkinput = false;
            } else {
                message = "Поддерживаются только форматы '.csv' '.json' '.xml'. Попробуйте ещё раз или выйдите написав 'Exit':";
            }
        } while (!checkinput);
        return null;
    }

    private void saveModel() {
        String path = askSaveFilePath();
        switch (path.substring(path.indexOf('.') + 1)) {
            case "csv":
                if (!this.model.save(new CsvSave(), path)) {
                    view.printOutput("Cохранение фаила не удалось\n");
                } else {
                    view.printOutput("Cохранение удалось\n");
                }
                break;

            case "json":
                if (!this.model.save(new JsonSave(), path)) {
                    view.printOutput("Cохранение фаила не удалось\n");
                } else {
                    view.printOutput("Cохранение удалось\n");
                }
                break;

            case "xml":
                if (!this.model.save(new XmlSave(), path)) {
                    view.printOutput("Cохранение фаила не удалось\n");
                } else {
                    view.printOutput("Cохранение удалось\n");
                }
                break;
        }
    }

    private String askSaveFilePath() {
        boolean checkinput = false;
        String message = "Введите имя файла (Например: dataNew.csv):";
        do {
            String input = view.getInput(message);
            if (knownDataFiles.contains(input.substring(input.indexOf('.') + 1))) {
                return input;
            } else if (input.equals("Exit")) {
                checkinput = false;
            } else {
                message = "Поддерживаются только форматы '.csv' '.json' '.xml'. Попробуйте ещё раз или выйдите написав 'Exit':";
            }
        } while (!checkinput);
        return null;
    }

    private void addTask() {
        String name = view.getInput("Введите название 'Задачи':");
        String description = view.getInput("Введите описание 'Задачи':");
        TaskPriority taskPriority = checkPrirotyInput();
        LocalDateTime deadLineTime = checkDateInput();
        model.add(new Task(name, description, taskPriority, deadLineTime, ActiveUser.activeUserCopy().getFIO()));
    }

    private void updTask() {
        int id = checkIdInput();
        String name = view.getInput("Введите название 'Задачи':");
        String description = view.getInput("Введите описание 'Задачи':");
        TaskPriority taskPriority = checkPrirotyInput();
        LocalDateTime deadLineTime = checkDateInput();
        model.updateById(id,
                new Task(name, description, taskPriority, deadLineTime, ActiveUser.activeUserCopy().getFIO()));
    }

    private void removeTask() {
        int id = checkIdInput();
        if (id > 0) {
            model.removeById(id);
        }
    }

    private TaskPriority checkPrirotyInput() {
        boolean checkinput = false;
        String message = "Задайте приоритет задачи  (1 - низкий, 2 - средний, 3 - незамедлительный):";
        do {
            String priorityNum = view.getInput(message);
            switch (priorityNum) {
                case "1":
                    checkinput = true;
                    return TaskPriority.LOW;
                case "2":
                    checkinput = true;
                    return TaskPriority.MEDIUM;
                case "3":
                    checkinput = true;
                    return TaskPriority.IMMEDIATE;
                default:
                    message = "Напишите '1', '2' или '3' (1 - низкий, 2 - средний, 3 - незамедлительный):";
                    break;
            }
        } while (!checkinput);
        return TaskPriority.LOW;
    }

    private LocalDateTime checkDateInput() {
        boolean checkinput = false;
        String message = "Введите дату в формате '13.02.1987 01:00':";
        do {
            String date = view.getInput(message);
            try {
                return LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
            } catch (Exception e) {
                message = "Неудалось получить дату, напомню формат (dd.MM.yyyy HH:mm):";
            }

        } while (!checkinput);
        return null;
    }

    private int checkIdInput() {
        boolean checkinput = false;
        String message = "Введите 'id' задачи:";
        do {
            try {
                return Integer.parseInt(view.getInput(message));
            } catch (Exception e) {
                message = "Это должно быть целое число:";
            }
        } while (!checkinput);
        return 0;
    }

    private void redrawTasksList() {
        StringBuilder sb = new StringBuilder();
        for (Object task : model.getAll()) {
            sb.append(task)
                    .append("\n");
        }
        view.printOutput(sb.toString());
    }

}
