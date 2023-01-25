public class Command_GetSchedule implements Commands{

    private UI ui;

    public Command_GetSchedule(UI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        ui.getPresenter().printSchedule(ui.getSchedule());
    }

    @Override
    public String description() {
        return "Вывести на экран весь планировщик";
    }
}