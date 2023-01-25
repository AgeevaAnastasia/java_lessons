public class Command_AddTask implements Commands{

    private UI ui;

    public Command_AddTask(UI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        ui.getPresenter().addTask();
    }

    @Override
    public String description() {
        return "Добавить задачу в планировщик";
    }
}
