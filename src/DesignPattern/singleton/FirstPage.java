package DesignPattern.singleton;

public class FirstPage {
    private Settings settings = Settings.getSettings();

    public void setAndPrintSettings() {
        // 셋팅 변경 설정
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }
}
