import java.io.IOException;

public class Command_SaveAndExit implements Commands{

    private UI ui;

    public Command_SaveAndExit(UI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() throws IOException {
        ui.getPresenter().saveSchedule();
        System.exit(0);
    }

    @Override
    public String description() {
        return "Сохранение всего планировщика и выход из программы";
    }
}
