public class Command_DeleteTask implements Commands{

    private UI ui;

    public Command_DeleteTask(UI ui) {
        this.ui = ui;
    }


    @Override
    public void execute() {
        ui.getPresenter().deleteTask();
    }

    @Override
    public String description() {
        return "Удалить задачу из планировщика";
    }
}
