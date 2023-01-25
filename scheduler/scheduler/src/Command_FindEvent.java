
public class Command_FindEvent implements Commands{

    private UI ui;

    public Command_FindEvent(UI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        ui.getPresenter().findTask();
    }

    @Override
    public String description() {
        return "Найти задачу в планировщике";
    }
}
