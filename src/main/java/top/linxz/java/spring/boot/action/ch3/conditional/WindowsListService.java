package top.linxz.java.spring.boot.action.ch3.conditional;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
