public class Command_GetDateTasks implements Commands{

    private UI ui;

    public Command_GetDateTasks(UI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        ui.getPresenter().getDateTasks();
    }

    @Override
    public String description() {
        return "Показать записи на день";
    }
}
